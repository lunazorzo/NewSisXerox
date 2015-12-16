package NewSisXerox.DAO;

import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GenericDAO {

    private static GenericDAO instance = null;
    private EntityManager em;
    private EntityTransaction tx;

    public GenericDAO() {
        try {
            HashMap<String, String> map = new HashMap<String, String>();
            /*File flPro = new File(System.getProperty("user.dir") + File.separatorChar + "banco.properties");
             System.out.println(flPro.getAbsolutePath());
             if (!flPro.exists()) {
             JOptionPane.showMessageDialog(null, "Falta configuração com o Banco.");
             System.exit(0);
             }*/
            map.put("hibernate.connection.username", "postgres");
            map.put("hibernate.connection.driver_class", "org.postgresql.Driver");
            map.put("hibernate.connection.password", "root");
            map.put("hibernate.connection.url", "jdbc:postgresql://localhost:5432/newxerox");
//            map.put("hibernate.dialect", "");

            map.put("hibernate.connection.lc_ctype", "LATIN1");
            //map.put("hibernateshow_sql", "true");
            map.put("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
            //map.put("hibernate.hbm2ddl.auto", "update");

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("NewSisXeroxPU", map);
            em = emf.createEntityManager();
            em.setFlushMode(FlushModeType.AUTO);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static GenericDAO getInstance() {
        if (instance == null) {
            instance = new GenericDAO();
        }
        return instance;
    }

    public <T> List<T> getList(Class clazz, String query, Object... params) {
        try {
            Query q = null;
            q = em.createQuery(query);
            if (params != null) {
                int i = 1;
                for (Object obj : params) {
                    q.setParameter(i, obj);
                    i++;
                }
            }
            return q.getResultList();
        } catch (Exception ex) {
            System.out.println("Erro ao realizar getList: " + ex.getMessage());
            return null;
        }
    }

    public Object getObjeto(String query, Object... params) {
        try {
            Query q = null;
            q = em.createQuery(query);
            if (params != null) {
                int i = 1;
                for (Object obj : params) {
                    q.setParameter(i, obj);
                    i++;
                }
            }
            return q.getSingleResult();
        } catch (NoResultException e) {
            System.out.println("não encontrada");
            return null;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public boolean remove(Object obj) {
        try {
            em.remove(obj);
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao realizar a remoção: " + ex.getMessage());
            return false;
        }
    }

    public void startTransaction() {
        tx = em.getTransaction();
        if (tx.isActive() && tx.getRollbackOnly()) {
            tx.rollback();
        }
        if (!tx.isActive()) {
            tx.begin();
        }
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
    }

    public void commit() {
       // startTransaction();
        if (tx != null && tx.isActive()) {
            try {
                em.flush();
                tx.commit();
            } catch (Exception cex) {
                try {
                    cex.printStackTrace();
                    tx.rollback();
                } catch (Exception rex) {
                    System.out.println("Erro RollBack ");
                }
                throw new RuntimeException("Erro gravando alterações no Banco de Dados.");
            }
        }
    }

    public void rollback() {
        if (tx != null && tx.isActive()) {
            try {
                tx.rollback();
            } catch (Exception rex) {
                System.out.println("Erro ao realizar rollback: " + rex.getMessage());
            }
        }
    }
    protected EntityManager entityManager;

    public Object persist(Object obj) {
        startTransaction();
        try {
            flush();
            Object novo = em.merge(obj);
            obj = novo;
        } catch (Exception ex) {
            try {
                em.persist(obj);
            } catch (Exception pex) {
                rollback();
                System.out.println("Erro ao realizar persist: " + pex.getMessage());
                return null;
            }
        }
        return obj;
    }

    public <T> T getEntity(Class<T> clazz, Object key) {
        try {
            return em.find(clazz, key);
        } catch (Exception ex) {
            System.out.println("Erro buscando entidade: " + ex.getMessage());
            return null;
        }
    }

    public void closeEM() {
        if (em != null) {
            em.close();
            em = null;
            instance = null;
        }
    }

    public Object getObject(String consulta) {
        try {
            Object ob = null;
            return em.createQuery(consulta).getSingleResult();
        } catch (NoResultException no) {
            System.out.println("Erro NoResultException: " + no.getMessage());
            return null;
        } catch (Exception e) {
            System.out.println("Erro Exception: " + e.getMessage());
            return null;
        }
    }

    public List getObjects(String consulta, Class clazz) {
        try {
            Object ob = null;
            return em.createNativeQuery(consulta, clazz).getResultList();
        } catch (NoResultException no) {
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public void refresh(Object obj) {
        em.refresh(obj);
    }

    public void clear() {
        em.flush();
        em.clear();
    }

    public EntityManager getEm() {
        return em;
    }

    public final void flush() {
        try {
            em.flush();
        } catch (Exception ex) {
            System.out.println("Erro flush: " + ex.getMessage());
        }

    }
}
