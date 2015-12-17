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
@Table(name = "formpgto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formpgto.findAll", query = "SELECT f FROM Formpgto f"),
    @NamedQuery(name = "Formpgto.findByCdFormpgto", query = "SELECT f FROM Formpgto f WHERE f.cdFormpgto = :cdFormpgto"),
    @NamedQuery(name = "Formpgto.findByNmFormpgto", query = "SELECT f FROM Formpgto f WHERE f.nmFormpgto = :nmFormpgto")})
public class Formpgto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cd_formpgto")
    private Integer cdFormpgto;
    @Basic(optional = false)
    @Column(name = "nm_formpgto")
    private String nmFormpgto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cdFormpgto")
    private Collection<Venda> vendaCollection;

    public Formpgto() {
    }

    public Formpgto(Integer cdFormpgto) {
        this.cdFormpgto = cdFormpgto;
    }

    public Formpgto(Integer cdFormpgto, String nmFormpgto) {
        this.cdFormpgto = cdFormpgto;
        this.nmFormpgto = nmFormpgto;
    }

    public Integer getCdFormpgto() {
        return cdFormpgto;
    }

    public void setCdFormpgto(Integer cdFormpgto) {
        this.cdFormpgto = cdFormpgto;
    }

    public String getNmFormpgto() {
        return nmFormpgto;
    }

    public void setNmFormpgto(String nmFormpgto) {
        this.nmFormpgto = nmFormpgto;
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
        hash += (cdFormpgto != null ? cdFormpgto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formpgto)) {
            return false;
        }
        Formpgto other = (Formpgto) object;
        if ((this.cdFormpgto == null && other.cdFormpgto != null) || (this.cdFormpgto != null && !this.cdFormpgto.equals(other.cdFormpgto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nmFormpgto;
    }
    
}
