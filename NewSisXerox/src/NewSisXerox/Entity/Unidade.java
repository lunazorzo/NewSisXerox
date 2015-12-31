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
@Table(name = "unidade")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unidade.findAll", query = "SELECT u FROM Unidade u"),
    @NamedQuery(name = "Unidade.findByCdUnidade", query = "SELECT u FROM Unidade u WHERE u.cdUnidade = :cdUnidade"),
    @NamedQuery(name = "Unidade.findByNmUnidade", query = "SELECT u FROM Unidade u WHERE u.nmUnidade = :nmUnidade")})
public class Unidade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cd_unidade")
    private Integer cdUnidade;
    @Basic(optional = false)
    @Column(name = "nm_unidade")
    private String nmUnidade;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cdUnidade")
    private Collection<Produto> produtoCollection;

    public Unidade() {
    }

    public Unidade(Integer cdUnidade) {
        this.cdUnidade = cdUnidade;
    }

    public Unidade(Integer cdUnidade, String nmUnidade) {
        this.cdUnidade = cdUnidade;
        this.nmUnidade = nmUnidade;
    }

    public Integer getCdUnidade() {
        return cdUnidade;
    }

    public void setCdUnidade(Integer cdUnidade) {
        this.cdUnidade = cdUnidade;
    }

    public String getNmUnidade() {
        return nmUnidade;
    }

    public void setNmUnidade(String nmUnidade) {
        this.nmUnidade = nmUnidade;
    }

    @XmlTransient
    public Collection<Produto> getProdutoCollection() {
        return produtoCollection;
    }

    public void setProdutoCollection(Collection<Produto> produtoCollection) {
        this.produtoCollection = produtoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdUnidade != null ? cdUnidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidade)) {
            return false;
        }
        Unidade other = (Unidade) object;
        if ((this.cdUnidade == null && other.cdUnidade != null) || (this.cdUnidade != null && !this.cdUnidade.equals(other.cdUnidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nmUnidade;
    }
    
}
