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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "curso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c"),
    @NamedQuery(name = "Curso.findByCdCurso", query = "SELECT c FROM Curso c WHERE c.cdCurso = :cdCurso"),
    @NamedQuery(name = "Curso.findByNmCurso", query = "SELECT c FROM Curso c WHERE c.nmCurso = :nmCurso")})
public class Curso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cd_curso")
    private Integer cdCurso;
    @Basic(optional = false)
    @Column(name = "nm_curso")
    private String nmCurso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cdCurso")
    private Collection<Aluno> alunoCollection;
    @JoinColumn(name = "cd_instituicao", referencedColumnName = "cd_instituicao")
    @ManyToOne(optional = false)
    private Instituicao cdInstituicao;

    public Curso() {
    }

    public Curso(Integer cdCurso) {
        this.cdCurso = cdCurso;
    }

    public Curso(Integer cdCurso, String nmCurso) {
        this.cdCurso = cdCurso;
        this.nmCurso = nmCurso;
    }

    public Integer getCdCurso() {
        return cdCurso;
    }

    public void setCdCurso(Integer cdCurso) {
        this.cdCurso = cdCurso;
    }

    public String getNmCurso() {
        return nmCurso;
    }

    public void setNmCurso(String nmCurso) {
        this.nmCurso = nmCurso;
    }

    @XmlTransient
    public Collection<Aluno> getAlunoCollection() {
        return alunoCollection;
    }

    public void setAlunoCollection(Collection<Aluno> alunoCollection) {
        this.alunoCollection = alunoCollection;
    }

    public Instituicao getCdInstituicao() {
        return cdInstituicao;
    }

    public void setCdInstituicao(Instituicao cdInstituicao) {
        this.cdInstituicao = cdInstituicao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdCurso != null ? cdCurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.cdCurso == null && other.cdCurso != null) || (this.cdCurso != null && !this.cdCurso.equals(other.cdCurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NewSisXerox.Entity.Curso[ cdCurso=" + cdCurso + " ]";
    }
    
}
