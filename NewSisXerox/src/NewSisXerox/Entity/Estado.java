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
@Table(name = "estado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estado.findAll", query = "SELECT e FROM Estado e"),
    @NamedQuery(name = "Estado.findByCdEstado", query = "SELECT e FROM Estado e WHERE e.cdEstado = :cdEstado"),
    @NamedQuery(name = "Estado.findByNmEstado", query = "SELECT e FROM Estado e WHERE e.nmEstado = :nmEstado"),
    @NamedQuery(name = "Estado.findBySglEstado", query = "SELECT e FROM Estado e WHERE e.sglEstado = :sglEstado")})
public class Estado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cd_estado")
    private Integer cdEstado;
    @Basic(optional = false)
    @Column(name = "nm_estado")
    private String nmEstado;
    @Basic(optional = false)
    @Column(name = "sgl_estado")
    private String sglEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cdEstado")
    private Collection<Empresa> empresaCollection;

    public Estado() {
    }

    public Estado(Integer cdEstado) {
        this.cdEstado = cdEstado;
    }

    public Estado(Integer cdEstado, String nmEstado, String sglEstado) {
        this.cdEstado = cdEstado;
        this.nmEstado = nmEstado;
        this.sglEstado = sglEstado;
    }

    public Integer getCdEstado() {
        return cdEstado;
    }

    public void setCdEstado(Integer cdEstado) {
        this.cdEstado = cdEstado;
    }

    public String getNmEstado() {
        return nmEstado;
    }

    public void setNmEstado(String nmEstado) {
        this.nmEstado = nmEstado;
    }

    public String getSglEstado() {
        return sglEstado;
    }

    public void setSglEstado(String sglEstado) {
        this.sglEstado = sglEstado;
    }

    @XmlTransient
    public Collection<Empresa> getEmpresaCollection() {
        return empresaCollection;
    }

    public void setEmpresaCollection(Collection<Empresa> empresaCollection) {
        this.empresaCollection = empresaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdEstado != null ? cdEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estado)) {
            return false;
        }
        Estado other = (Estado) object;
        if ((this.cdEstado == null && other.cdEstado != null) || (this.cdEstado != null && !this.cdEstado.equals(other.cdEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NewSisXerox.Entity.Estado[ cdEstado=" + cdEstado + " ]";
    }
    
}
