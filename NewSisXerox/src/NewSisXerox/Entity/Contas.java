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
@Table(name = "contas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contas.findAll", query = "SELECT c FROM Contas c"),
    @NamedQuery(name = "Contas.findByCdContas", query = "SELECT c FROM Contas c WHERE c.cdContas = :cdContas"),
    @NamedQuery(name = "Contas.findByVlTitulo", query = "SELECT c FROM Contas c WHERE c.vlTitulo = :vlTitulo"),
    @NamedQuery(name = "Contas.findByVlSaldo", query = "SELECT c FROM Contas c WHERE c.vlSaldo = :vlSaldo"),
    @NamedQuery(name = "Contas.findByDtVenda", query = "SELECT c FROM Contas c WHERE c.dtVenda = :dtVenda"),
    @NamedQuery(name = "Contas.findByDtEmissao", query = "SELECT c FROM Contas c WHERE c.dtEmissao = :dtEmissao")})
public class Contas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cd_contas")
    private Integer cdContas;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "vl_titulo")
    private BigDecimal vlTitulo;
    @Basic(optional = false)
    @Column(name = "vl_saldo")
    private BigDecimal vlSaldo;
    @Basic(optional = false)
    @Column(name = "dt_venda")
    @Temporal(TemporalType.DATE)
    private Date dtVenda;
    @Basic(optional = false)
    @Column(name = "dt_emissao")
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;
    @JoinColumn(name = "cd_venda", referencedColumnName = "cd_venda")
    @ManyToOne(optional = false)
    private Venda cdVenda;

    public Contas() {
    }

    public Contas(Integer cdContas) {
        this.cdContas = cdContas;
    }

    public Contas(Integer cdContas, BigDecimal vlTitulo, BigDecimal vlSaldo, Date dtVenda, Date dtEmissao) {
        this.cdContas = cdContas;
        this.vlTitulo = vlTitulo;
        this.vlSaldo = vlSaldo;
        this.dtVenda = dtVenda;
        this.dtEmissao = dtEmissao;
    }

    public Integer getCdContas() {
        return cdContas;
    }

    public void setCdContas(Integer cdContas) {
        this.cdContas = cdContas;
    }

    public BigDecimal getVlTitulo() {
        return vlTitulo;
    }

    public void setVlTitulo(BigDecimal vlTitulo) {
        this.vlTitulo = vlTitulo;
    }

    public BigDecimal getVlSaldo() {
        return vlSaldo;
    }

    public void setVlSaldo(BigDecimal vlSaldo) {
        this.vlSaldo = vlSaldo;
    }

    public Date getDtVenda() {
        return dtVenda;
    }

    public void setDtVenda(Date dtVenda) {
        this.dtVenda = dtVenda;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public Venda getCdVenda() {
        return cdVenda;
    }

    public void setCdVenda(Venda cdVenda) {
        this.cdVenda = cdVenda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdContas != null ? cdContas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contas)) {
            return false;
        }
        Contas other = (Contas) object;
        if ((this.cdContas == null && other.cdContas != null) || (this.cdContas != null && !this.cdContas.equals(other.cdContas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NewSisXerox.Entity.Contas[ cdContas=" + cdContas + " ]";
    }
    
}
