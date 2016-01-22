/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Allan
 */
@Entity
@Table(name = "aluno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aluno.findAll", query = "SELECT a FROM Aluno a"),
    @NamedQuery(name = "Aluno.findByCdAluno", query = "SELECT a FROM Aluno a WHERE a.cdAluno = :cdAluno"),
    @NamedQuery(name = "Aluno.findByNmAluno", query = "SELECT a FROM Aluno a WHERE a.nmAluno = :nmAluno"),
    @NamedQuery(name = "Aluno.findByDtCadastro", query = "SELECT a FROM Aluno a WHERE a.dtCadastro = :dtCadastro"),
    @NamedQuery(name = "Aluno.findByVlSaldo", query = "SELECT a FROM Aluno a WHERE a.vlSaldo = :vlSaldo"),
    @NamedQuery(name = "Aluno.findByRgAluno", query = "SELECT a FROM Aluno a WHERE a.rgAluno = :rgAluno"),
    @NamedQuery(name = "Aluno.findByRaAluno", query = "SELECT a FROM Aluno a WHERE a.raAluno = :raAluno")})
public class Aluno implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cdAluno")
    private Collection<Venda> vendaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cdAluno")
    private Collection<Recarga> recargaCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cd_aluno")
    private Integer cdAluno;
    @Basic(optional = false)
    @Column(name = "nm_aluno")
    private String nmAluno;
    @Basic(optional = false)
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.DATE)
    private Date dtCadastro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    //@Basic(optional = false)
    @Column(name = "vl_saldo")
    private BigDecimal vlSaldo;
    @Basic(optional = false)
    @Column(name = "rg_aluno")
    private String rgAluno;
    @Basic(optional = false)
    @Column(name = "ra_aluno",unique=true)
    private String raAluno;
    @JoinColumn(name = "cd_curso", referencedColumnName = "cd_curso")
    @ManyToOne(optional = false)
    private Curso cdCurso;

    public Aluno() {
    }

    public Aluno(Integer cdAluno) {
        this.cdAluno = cdAluno;
    }

    public Aluno(Integer cdAluno, String nmAluno, Date dtCadastro, BigDecimal vlSaldo, String rgAluno, String raAluno) {
        this.cdAluno = cdAluno;
        this.nmAluno = nmAluno;
        this.dtCadastro = dtCadastro;
        this.vlSaldo = vlSaldo;
        this.rgAluno = rgAluno;
        this.raAluno = raAluno;
    }

    public Integer getCdAluno() {
        return cdAluno;
    }

    public void setCdAluno(Integer cdAluno) {
        this.cdAluno = cdAluno;
    }

    public String getNmAluno() {
        return nmAluno;
    }

    public void setNmAluno(String nmAluno) {
        this.nmAluno = nmAluno;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public BigDecimal getVlSaldo() {
        return vlSaldo;
    }

    public void setVlSaldo(BigDecimal vlSaldo) {
        this.vlSaldo = vlSaldo;
    }

    public String getRgAluno() {
        return rgAluno;
    }

    public void setRgAluno(String rgAluno) {
        this.rgAluno = rgAluno;
    }

    public String getRaAluno() {
        return raAluno;
    }

    public void setRaAluno(String raAluno) {
        this.raAluno = raAluno;
    }

    public Curso getCdCurso() {
        return cdCurso;
    }

    public void setCdCurso(Curso cdCurso) {
        this.cdCurso = cdCurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdAluno != null ? cdAluno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.cdAluno == null && other.cdAluno != null) || (this.cdAluno != null && !this.cdAluno.equals(other.cdAluno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nmAluno;
    }

    @XmlTransient
    public Collection<Recarga> getRecargaCollection() {
        return recargaCollection;
    }

    public void setRecargaCollection(Collection<Recarga> recargaCollection) {
        this.recargaCollection = recargaCollection;
    }

    @XmlTransient
    public Collection<Venda> getVendaCollection() {
        return vendaCollection;
    }

    public void setVendaCollection(Collection<Venda> vendaCollection) {
        this.vendaCollection = vendaCollection;
    }
    
}
