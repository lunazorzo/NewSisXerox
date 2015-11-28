/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Entity;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Allan
 */
@Entity
@Table(name = "empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e"),
    @NamedQuery(name = "Empresa.findByCdEmpresa", query = "SELECT e FROM Empresa e WHERE e.cdEmpresa = :cdEmpresa"),
    @NamedQuery(name = "Empresa.findByNmEmpresa", query = "SELECT e FROM Empresa e WHERE e.nmEmpresa = :nmEmpresa"),
    @NamedQuery(name = "Empresa.findByEndereco", query = "SELECT e FROM Empresa e WHERE e.endereco = :endereco"),
    @NamedQuery(name = "Empresa.findByBairro", query = "SELECT e FROM Empresa e WHERE e.bairro = :bairro"),
    @NamedQuery(name = "Empresa.findByCidade", query = "SELECT e FROM Empresa e WHERE e.cidade = :cidade"),
    @NamedQuery(name = "Empresa.findByCep", query = "SELECT e FROM Empresa e WHERE e.cep = :cep"),
    @NamedQuery(name = "Empresa.findByEmail", query = "SELECT e FROM Empresa e WHERE e.email = :email"),
    @NamedQuery(name = "Empresa.findByNumTelefone", query = "SELECT e FROM Empresa e WHERE e.numTelefone = :numTelefone")})
public class Empresa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cd_empresa")
    private Integer cdEmpresa;
    @Basic(optional = false)
    @Column(name = "nm_empresa")
    private String nmEmpresa;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "bairro")
    private String bairro;
    @Basic(optional = false)
    @Column(name = "cidade")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "cep")
    private String cep;
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "num_telefone")
    private String numTelefone;
    @JoinColumn(name = "cd_estado", referencedColumnName = "cd_estado")
    @ManyToOne(optional = false)
    private Estado cdEstado;

    public Empresa() {
    }

    public Empresa(Integer cdEmpresa) {
        this.cdEmpresa = cdEmpresa;
    }

    public Empresa(Integer cdEmpresa, String nmEmpresa, String endereco, String bairro, String cidade, String cep, String numTelefone) {
        this.cdEmpresa = cdEmpresa;
        this.nmEmpresa = nmEmpresa;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.numTelefone = numTelefone;
    }

    public Integer getCdEmpresa() {
        return cdEmpresa;
    }

    public void setCdEmpresa(Integer cdEmpresa) {
        this.cdEmpresa = cdEmpresa;
    }

    public String getNmEmpresa() {
        return nmEmpresa;
    }

    public void setNmEmpresa(String nmEmpresa) {
        this.nmEmpresa = nmEmpresa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    public Estado getCdEstado() {
        return cdEstado;
    }

    public void setCdEstado(Estado cdEstado) {
        this.cdEstado = cdEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdEmpresa != null ? cdEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.cdEmpresa == null && other.cdEmpresa != null) || (this.cdEmpresa != null && !this.cdEmpresa.equals(other.cdEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NewSisXerox.Entity.Empresa[ cdEmpresa=" + cdEmpresa + " ]";
    }
    
}
