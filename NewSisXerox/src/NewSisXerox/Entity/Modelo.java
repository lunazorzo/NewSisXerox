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
@Table(name = "modelo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modelo.findAll", query = "SELECT m FROM Modelo m"),
    @NamedQuery(name = "Modelo.findByCdModelo", query = "SELECT m FROM Modelo m WHERE m.cdModelo = :cdModelo"),
    @NamedQuery(name = "Modelo.findByNmModelo", query = "SELECT m FROM Modelo m WHERE m.nmModelo = :nmModelo")})
public class Modelo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cd_modelo")
    private Integer cdModelo;
    @Basic(optional = false)
    @Column(name = "nm_modelo")
    private String nmModelo;
    @JoinColumn(name = "cd_marca", referencedColumnName = "cd_marca")
    @ManyToOne(optional = false)
    private Marca cdMarca;

    public Modelo() {
    }

    public Modelo(Integer cdModelo) {
        this.cdModelo = cdModelo;
    }

    public Modelo(Integer cdModelo, String nmModelo) {
        this.cdModelo = cdModelo;
        this.nmModelo = nmModelo;
    }

    public Integer getCdModelo() {
        return cdModelo;
    }

    public void setCdModelo(Integer cdModelo) {
        this.cdModelo = cdModelo;
    }

    public String getNmModelo() {
        return nmModelo;
    }

    public void setNmModelo(String nmModelo) {
        this.nmModelo = nmModelo;
    }

    public Marca getCdMarca() {
        return cdMarca;
    }

    public void setCdMarca(Marca cdMarca) {
        this.cdMarca = cdMarca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdModelo != null ? cdModelo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modelo)) {
            return false;
        }
        Modelo other = (Modelo) object;
        if ((this.cdModelo == null && other.cdModelo != null) || (this.cdModelo != null && !this.cdModelo.equals(other.cdModelo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nmModelo;
    }
    
}
