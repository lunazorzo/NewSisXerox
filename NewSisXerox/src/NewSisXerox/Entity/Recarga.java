/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Allan
 */
@Entity
@Table(name = "recarga")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recarga.findAll", query = "SELECT r FROM Recarga r"),
    @NamedQuery(name = "Recarga.findByCdRecarga", query = "SELECT r FROM Recarga r WHERE r.cdRecarga = :cdRecarga"),
    @NamedQuery(name = "Recarga.findByDtRecarga", query = "SELECT r FROM Recarga r WHERE r.dtRecarga = :dtRecarga"),
    @NamedQuery(name = "Recarga.findByVlRecarga", query = "SELECT r FROM Recarga r WHERE r.vlRecarga = :vlRecarga")})
public class Recarga implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cd_recarga")
    private Integer cdRecarga;
    @Basic(optional = false)
    @Column(name = "dt_recarga")
    @Temporal(TemporalType.DATE)
    private Date dtRecarga;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "vl_recarga")
    private BigDecimal vlRecarga;
    @JoinColumn(name = "cd_aluno", referencedColumnName = "cd_aluno")
    @ManyToOne(optional = false)
    private Aluno cdAluno;
    @JoinColumn(name = "cd_formpgto", referencedColumnName = "cd_formpgto")
    @ManyToOne(optional = false)
    private Formpgto cdFormpgto;
    @JoinColumn(name = "cd_usuario", referencedColumnName = "cd_usuario")
    @ManyToOne(optional = false)
    private Usuario cdUsuario;

    public Recarga() {
    }

    public Recarga(Integer cdRecarga) {
        this.cdRecarga = cdRecarga;
    }

    public Recarga(Integer cdRecarga, Date dtRecarga, BigDecimal vlRecarga) {
        this.cdRecarga = cdRecarga;
        this.dtRecarga = dtRecarga;
        this.vlRecarga = vlRecarga;
    }

    public Integer getCdRecarga() {
        return cdRecarga;
    }

    public void setCdRecarga(Integer cdRecarga) {
        this.cdRecarga = cdRecarga;
    }

    public Date getDtRecarga() {
        return dtRecarga;
    }

    public void setDtRecarga(Date dtRecarga) {
        this.dtRecarga = dtRecarga;
    }

    public BigDecimal getVlRecarga() {
        return vlRecarga;
    }

    public void setVlRecarga(BigDecimal vlRecarga) {
        this.vlRecarga = vlRecarga;
    }

    public Aluno getCdAluno() {
        return cdAluno;
    }

    public void setCdAluno(Aluno cdAluno) {
        this.cdAluno = cdAluno;
    }

    public Formpgto getCdFormpgto() {
        return cdFormpgto;
    }

    public void setCdFormpgto(Formpgto cdFormpgto) {
        this.cdFormpgto = cdFormpgto;
    }

    public Usuario getCdUsuario() {
        return cdUsuario;
    }

    public void setCdUsuario(Usuario cdUsuario) {
        this.cdUsuario = cdUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdRecarga != null ? cdRecarga.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recarga)) {
            return false;
        }
        Recarga other = (Recarga) object;
        if ((this.cdRecarga == null && other.cdRecarga != null) || (this.cdRecarga != null && !this.cdRecarga.equals(other.cdRecarga))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NewSisXerox.Entity.Recarga[ cdRecarga=" + cdRecarga + " ]";
    }
    
}
