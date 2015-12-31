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
 * @author Nobre Sistemas
 */
@Entity
@Table(name = "produto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByCdProduto", query = "SELECT p FROM Produto p WHERE p.cdProduto = :cdProduto"),
    @NamedQuery(name = "Produto.findByNmProduto", query = "SELECT p FROM Produto p WHERE p.nmProduto = :nmProduto"),
    @NamedQuery(name = "Produto.findByDtCadastro", query = "SELECT p FROM Produto p WHERE p.dtCadastro = :dtCadastro"),
    @NamedQuery(name = "Produto.findByFgAtivo", query = "SELECT p FROM Produto p WHERE p.fgAtivo = :fgAtivo"),
    @NamedQuery(name = "Produto.findByVlCompra", query = "SELECT p FROM Produto p WHERE p.vlCompra = :vlCompra"),
    @NamedQuery(name = "Produto.findByVlVenda", query = "SELECT p FROM Produto p WHERE p.vlVenda = :vlVenda")})
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cd_produto")
    private Integer cdProduto;
    @Basic(optional = false)
    @Column(name = "nm_produto")
    private String nmProduto;
    @Basic(optional = false)
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.DATE)
    private Date dtCadastro;
    @Basic(optional = false)
    @Column(name = "fg_ativo")
    private boolean fgAtivo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "vl_compra")
    private BigDecimal vlCompra;
    @Basic(optional = false)
    @Column(name = "vl_venda")
    private BigDecimal vlVenda;
    @JoinColumn(name = "cd_marca", referencedColumnName = "cd_marca")
    @ManyToOne(optional = false)
    private Marca cdMarca;
    @JoinColumn(name = "cd_modelo", referencedColumnName = "cd_modelo")
    @ManyToOne(optional = false)
    private Modelo cdModelo;
    @JoinColumn(name = "cd_unidade", referencedColumnName = "cd_unidade")
    @ManyToOne(optional = false)
    private Unidade cdUnidade;

    public Produto() {
    }

    public Produto(Integer cdProduto) {
        this.cdProduto = cdProduto;
    }

    public Produto(Integer cdProduto, String nmProduto, Date dtCadastro, boolean fgAtivo, BigDecimal vlCompra, BigDecimal vlVenda) {
        this.cdProduto = cdProduto;
        this.nmProduto = nmProduto;
        this.dtCadastro = dtCadastro;
        this.fgAtivo = fgAtivo;
        this.vlCompra = vlCompra;
        this.vlVenda = vlVenda;
    }

    public Integer getCdProduto() {
        return cdProduto;
    }

    public void setCdProduto(Integer cdProduto) {
        this.cdProduto = cdProduto;
    }

    public String getNmProduto() {
        return nmProduto;
    }

    public void setNmProduto(String nmProduto) {
        this.nmProduto = nmProduto;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public boolean getFgAtivo() {
        return fgAtivo;
    }

    public void setFgAtivo(boolean fgAtivo) {
        this.fgAtivo = fgAtivo;
    }

    public BigDecimal getVlCompra() {
        return vlCompra;
    }

    public void setVlCompra(BigDecimal vlCompra) {
        this.vlCompra = vlCompra;
    }

    public BigDecimal getVlVenda() {
        return vlVenda;
    }

    public void setVlVenda(BigDecimal vlVenda) {
        this.vlVenda = vlVenda;
    }

    public Marca getCdMarca() {
        return cdMarca;
    }

    public void setCdMarca(Marca cdMarca) {
        this.cdMarca = cdMarca;
    }

    public Modelo getCdModelo() {
        return cdModelo;
    }

    public void setCdModelo(Modelo cdModelo) {
        this.cdModelo = cdModelo;
    }

    public Unidade getCdUnidade() {
        return cdUnidade;
    }

    public void setCdUnidade(Unidade cdUnidade) {
        this.cdUnidade = cdUnidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdProduto != null ? cdProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.cdProduto == null && other.cdProduto != null) || (this.cdProduto != null && !this.cdProduto.equals(other.cdProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NewSisXerox.Entity.Produto[ cdProduto=" + cdProduto + " ]";
    }
    
}
