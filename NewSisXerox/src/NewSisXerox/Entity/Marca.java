/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Allan
 */
@Entity
@Table(name = "marca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marca.findAll", query = "SELECT m FROM Marca m"),
    @NamedQuery(name = "Marca.findByCdMarca", query = "SELECT m FROM Marca m WHERE m.cdMarca = :cdMarca"),
    @NamedQuery(name = "Marca.findByNmMarca", query = "SELECT m FROM Marca m WHERE m.nmMarca = :nmMarca")})
public class Marca implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cdMarca")
    private Collection<Modelo> modeloCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cd_marca")
    private Integer cdMarca;
    @Basic(optional = false)
    @Column(name = "nm_marca")
    private String nmMarca;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cdMarca")
    private Collection<Produto> produtoCollection;

    public Marca() {
    }

    public Marca(Integer cdMarca) {
        this.cdMarca = cdMarca;
    }

    public Marca(Integer cdMarca, String nmMarca) {
        this.cdMarca = cdMarca;
        this.nmMarca = nmMarca;
    }

    public Integer getCdMarca() {
        return cdMarca;
    }

    public void setCdMarca(Integer cdMarca) {
        this.cdMarca = cdMarca;
    }

    public String getNmMarca() {
        return nmMarca;
    }

    public void setNmMarca(String nmMarca) {
        this.nmMarca = nmMarca;
    }

    @XmlTransient
    public Collection<Produto> getProdutoCollection() {
        return produtoCollection;
    }

    public void setProdutoCollection(Collection<Produto> produtoCollection) {
        this.produtoCollection = produtoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdMarca != null ? cdMarca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marca)) {
            return false;
        }
        Marca other = (Marca) object;
        if ((this.cdMarca == null && other.cdMarca != null) || (this.cdMarca != null && !this.cdMarca.equals(other.cdMarca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nmMarca;
    }

    @XmlTransient
    public Collection<Modelo> getModeloCollection() {
        return modeloCollection;
    }

    public void setModeloCollection(Collection<Modelo> modeloCollection) {
        this.modeloCollection = modeloCollection;
    }
    
}
