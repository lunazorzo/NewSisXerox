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
@Table(name = "condpgto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Condpgto.findAll", query = "SELECT c FROM Condpgto c"),
    @NamedQuery(name = "Condpgto.findByCdCondpgto", query = "SELECT c FROM Condpgto c WHERE c.cdCondpgto = :cdCondpgto"),
    @NamedQuery(name = "Condpgto.findByNmCondpgto", query = "SELECT c FROM Condpgto c WHERE c.nmCondpgto = :nmCondpgto"),
    @NamedQuery(name = "Condpgto.findByNrDias", query = "SELECT c FROM Condpgto c WHERE c.nrDias = :nrDias"),
    @NamedQuery(name = "Condpgto.findByStParcelado", query = "SELECT c FROM Condpgto c WHERE c.stParcelado = :stParcelado")})
public class Condpgto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cd_condpgto")
    private Integer cdCondpgto;
    @Basic(optional = false)
    @Column(name = "nm_condpgto")
    private String nmCondpgto;
    @Basic(optional = false)
    @Column(name = "nr_dias")
    private int nrDias;
    @Basic(optional = false)
    @Column(name = "st_parcelado")
    private boolean stParcelado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "condpgto")
    private Collection<Condparcela> condparcelaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "condpgtoCdCondpgto")
    private Collection<Condparcela> condparcelaCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cdCondpgto")
    private Collection<Venda> vendaCollection;

    public Condpgto() {
    }

    public Condpgto(Integer cdCondpgto) {
        this.cdCondpgto = cdCondpgto;
    }

    public Condpgto(Integer cdCondpgto, String nmCondpgto, int nrDias, boolean stParcelado) {
        this.cdCondpgto = cdCondpgto;
        this.nmCondpgto = nmCondpgto;
        this.nrDias = nrDias;
        this.stParcelado = stParcelado;
    }

    public Integer getCdCondpgto() {
        return cdCondpgto;
    }

    public void setCdCondpgto(Integer cdCondpgto) {
        this.cdCondpgto = cdCondpgto;
    }

    public String getNmCondpgto() {
        return nmCondpgto;
    }

    public void setNmCondpgto(String nmCondpgto) {
        this.nmCondpgto = nmCondpgto;
    }

    public int getNrDias() {
        return nrDias;
    }

    public void setNrDias(int nrDias) {
        this.nrDias = nrDias;
    }

    public boolean getStParcelado() {
        return stParcelado;
    }

    public void setStParcelado(boolean stParcelado) {
        this.stParcelado = stParcelado;
    }

    @XmlTransient
    public Collection<Condparcela> getCondparcelaCollection() {
        return condparcelaCollection;
    }

    public void setCondparcelaCollection(Collection<Condparcela> condparcelaCollection) {
        this.condparcelaCollection = condparcelaCollection;
    }

    @XmlTransient
    public Collection<Condparcela> getCondparcelaCollection1() {
        return condparcelaCollection1;
    }

    public void setCondparcelaCollection1(Collection<Condparcela> condparcelaCollection1) {
        this.condparcelaCollection1 = condparcelaCollection1;
    }

    @XmlTransient
    public Collection<Venda> getVendaCollection() {
        return vendaCollection;
    }

    public void setVendaCollection(Collection<Venda> vendaCollection) {
        this.vendaCollection = vendaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdCondpgto != null ? cdCondpgto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Condpgto)) {
            return false;
        }
        Condpgto other = (Condpgto) object;
        if ((this.cdCondpgto == null && other.cdCondpgto != null) || (this.cdCondpgto != null && !this.cdCondpgto.equals(other.cdCondpgto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NewSisXerox.Entity.Condpgto[ cdCondpgto=" + cdCondpgto + " ]";
    }
    
}
