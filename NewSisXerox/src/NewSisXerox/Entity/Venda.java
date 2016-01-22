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
@Table(name = "venda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venda.findAll", query = "SELECT v FROM Venda v"),
    @NamedQuery(name = "Venda.findByCdVenda", query = "SELECT v FROM Venda v WHERE v.cdVenda = :cdVenda"),
    @NamedQuery(name = "Venda.findByDtVenda", query = "SELECT v FROM Venda v WHERE v.dtVenda = :dtVenda"),
    @NamedQuery(name = "Venda.findByStEstorno", query = "SELECT v FROM Venda v WHERE v.stEstorno = :stEstorno"),
    @NamedQuery(name = "Venda.findByQtVenda", query = "SELECT v FROM Venda v WHERE v.qtVenda = :qtVenda"),
    @NamedQuery(name = "Venda.findByVlVenda", query = "SELECT v FROM Venda v WHERE v.vlVenda = :vlVenda"),
    @NamedQuery(name = "Venda.findByVlDesconto", query = "SELECT v FROM Venda v WHERE v.vlDesconto = :vlDesconto"),
    @NamedQuery(name = "Venda.findByVlTotal", query = "SELECT v FROM Venda v WHERE v.vlTotal = :vlTotal")})
public class Venda implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cd_venda")
    private Integer cdVenda;
    @Basic(optional = false)
    @Column(name = "dt_venda")
    @Temporal(TemporalType.DATE)
    private Date dtVenda;
    @Basic(optional = false)
    @Column(name = "st_estorno")
    private boolean stEstorno;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "qt_venda")
    private BigDecimal qtVenda;
    @Basic(optional = false)
    @Column(name = "vl_venda")
    private BigDecimal vlVenda;
    @Basic(optional = false)
    @Column(name = "vl_desconto")
    private BigDecimal vlDesconto;
    @Basic(optional = false)
    @Column(name = "vl_total")
    private BigDecimal vlTotal;
    @JoinColumn(name = "cd_aluno", referencedColumnName = "cd_aluno")
    @ManyToOne(optional = false)
    private Aluno cdAluno;
    @JoinColumn(name = "cd_condpgto", referencedColumnName = "cd_condpgto")
    @ManyToOne(optional = false)
    private Condpgto cdCondpgto;
    @JoinColumn(name = "cd_formpgto", referencedColumnName = "cd_formpgto")
    @ManyToOne(optional = false)
    private Formpgto cdFormpgto;
    @JoinColumn(name = "cd_produto", referencedColumnName = "cd_produto")
    @ManyToOne(optional = false)
    private Produto cdProduto;

    public Venda() {
    }

    public Venda(Integer cdVenda) {
        this.cdVenda = cdVenda;
    }

    public Venda(Integer cdVenda, Date dtVenda, boolean stEstorno, BigDecimal qtVenda, BigDecimal vlVenda, BigDecimal vlDesconto, BigDecimal vlTotal) {
        this.cdVenda = cdVenda;
        this.dtVenda = dtVenda;
        this.stEstorno = stEstorno;
        this.qtVenda = qtVenda;
        this.vlVenda = vlVenda;
        this.vlDesconto = vlDesconto;
        this.vlTotal = vlTotal;
    }

    public Integer getCdVenda() {
        return cdVenda;
    }

    public void setCdVenda(Integer cdVenda) {
        this.cdVenda = cdVenda;
    }

    public Date getDtVenda() {
        return dtVenda;
    }

    public void setDtVenda(Date dtVenda) {
        this.dtVenda = dtVenda;
    }

    public boolean getStEstorno() {
        return stEstorno;
    }

    public void setStEstorno(boolean stEstorno) {
        this.stEstorno = stEstorno;
    }

    public BigDecimal getQtVenda() {
        return qtVenda;
    }

    public void setQtVenda(BigDecimal qtVenda) {
        this.qtVenda = qtVenda;
    }

    public BigDecimal getVlVenda() {
        return vlVenda;
    }

    public void setVlVenda(BigDecimal vlVenda) {
        this.vlVenda = vlVenda;
    }

    public BigDecimal getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(BigDecimal vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public BigDecimal getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(BigDecimal vlTotal) {
        this.vlTotal = vlTotal;
    }

    public Aluno getCdAluno() {
        return cdAluno;
    }

    public void setCdAluno(Aluno cdAluno) {
        this.cdAluno = cdAluno;
    }

    public Condpgto getCdCondpgto() {
        return cdCondpgto;
    }

    public void setCdCondpgto(Condpgto cdCondpgto) {
        this.cdCondpgto = cdCondpgto;
    }

    public Formpgto getCdFormpgto() {
        return cdFormpgto;
    }

    public void setCdFormpgto(Formpgto cdFormpgto) {
        this.cdFormpgto = cdFormpgto;
    }

    public Produto getCdProduto() {
        return cdProduto;
    }

    public void setCdProduto(Produto cdProduto) {
        this.cdProduto = cdProduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdVenda != null ? cdVenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venda)) {
            return false;
        }
        Venda other = (Venda) object;
        if ((this.cdVenda == null && other.cdVenda != null) || (this.cdVenda != null && !this.cdVenda.equals(other.cdVenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NewSisXerox.Entity.Venda[ cdVenda=" + cdVenda + " ]";
    }
    
}
