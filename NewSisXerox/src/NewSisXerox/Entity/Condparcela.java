/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "condparcela")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Condparcela.findAll", query = "SELECT c FROM Condparcela c"),
    @NamedQuery(name = "Condparcela.findByCdCondparcela", query = "SELECT c FROM Condparcela c WHERE c.condparcelaPK.cdCondparcela = :cdCondparcela"),
    @NamedQuery(name = "Condparcela.findByCdCondpgto", query = "SELECT c FROM Condparcela c WHERE c.condparcelaPK.cdCondpgto = :cdCondpgto"),
    @NamedQuery(name = "Condparcela.findByNmCondparcela", query = "SELECT c FROM Condparcela c WHERE c.condparcelaPK.nmCondparcela = :nmCondparcela")})
public class Condparcela implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CondparcelaPK condparcelaPK;
    @JoinColumn(name = "cd_condpgto", referencedColumnName = "cd_condpgto", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Condpgto condpgto;
    @JoinColumn(name = "condpgto_cd_condpgto", referencedColumnName = "cd_condpgto")
    @ManyToOne(optional = false)
    private Condpgto condpgtoCdCondpgto;

    public Condparcela() {
    }

    public Condparcela(CondparcelaPK condparcelaPK) {
        this.condparcelaPK = condparcelaPK;
    }

    public Condparcela(int cdCondparcela, int cdCondpgto, int nmCondparcela) {
        this.condparcelaPK = new CondparcelaPK(cdCondparcela, cdCondpgto, nmCondparcela);
    }

    public CondparcelaPK getCondparcelaPK() {
        return condparcelaPK;
    }

    public void setCondparcelaPK(CondparcelaPK condparcelaPK) {
        this.condparcelaPK = condparcelaPK;
    }

    public Condpgto getCondpgto() {
        return condpgto;
    }

    public void setCondpgto(Condpgto condpgto) {
        this.condpgto = condpgto;
    }

    public Condpgto getCondpgtoCdCondpgto() {
        return condpgtoCdCondpgto;
    }

    public void setCondpgtoCdCondpgto(Condpgto condpgtoCdCondpgto) {
        this.condpgtoCdCondpgto = condpgtoCdCondpgto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (condparcelaPK != null ? condparcelaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Condparcela)) {
            return false;
        }
        Condparcela other = (Condparcela) object;
        if ((this.condparcelaPK == null && other.condparcelaPK != null) || (this.condparcelaPK != null && !this.condparcelaPK.equals(other.condparcelaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NewSisXerox.Entity.Condparcela[ condparcelaPK=" + condparcelaPK + " ]";
    }
    
}
