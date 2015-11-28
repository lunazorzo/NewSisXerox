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
@Table(name = "instituicao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Instituicao.findAll", query = "SELECT i FROM Instituicao i"),
    @NamedQuery(name = "Instituicao.findByCdInstituicao", query = "SELECT i FROM Instituicao i WHERE i.cdInstituicao = :cdInstituicao"),
    @NamedQuery(name = "Instituicao.findByNmInstituicao", query = "SELECT i FROM Instituicao i WHERE i.nmInstituicao = :nmInstituicao")})
public class Instituicao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cd_instituicao")
    private Integer cdInstituicao;
    @Basic(optional = false)
    @Column(name = "nm_instituicao")
    private int nmInstituicao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cdInstituicao")
    private Collection<Curso> cursoCollection;

    public Instituicao() {
    }

    public Instituicao(Integer cdInstituicao) {
        this.cdInstituicao = cdInstituicao;
    }

    public Instituicao(Integer cdInstituicao, int nmInstituicao) {
        this.cdInstituicao = cdInstituicao;
        this.nmInstituicao = nmInstituicao;
    }

    public Integer getCdInstituicao() {
        return cdInstituicao;
    }

    public void setCdInstituicao(Integer cdInstituicao) {
        this.cdInstituicao = cdInstituicao;
    }

    public int getNmInstituicao() {
        return nmInstituicao;
    }

    public void setNmInstituicao(int nmInstituicao) {
        this.nmInstituicao = nmInstituicao;
    }

    @XmlTransient
    public Collection<Curso> getCursoCollection() {
        return cursoCollection;
    }

    public void setCursoCollection(Collection<Curso> cursoCollection) {
        this.cursoCollection = cursoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdInstituicao != null ? cdInstituicao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instituicao)) {
            return false;
        }
        Instituicao other = (Instituicao) object;
        if ((this.cdInstituicao == null && other.cdInstituicao != null) || (this.cdInstituicao != null && !this.cdInstituicao.equals(other.cdInstituicao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NewSisXerox.Entity.Instituicao[ cdInstituicao=" + cdInstituicao + " ]";
    }
    
}
