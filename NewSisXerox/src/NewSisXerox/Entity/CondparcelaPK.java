/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Allan
 */
@Embeddable
public class CondparcelaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "cd_condparcela")
    private int cdCondparcela;
    @Basic(optional = false)
    @Column(name = "cd_condpgto")
    private int cdCondpgto;
    @Basic(optional = false)
    @Column(name = "nm_condparcela")
    private int nmCondparcela;

    public CondparcelaPK() {
    }

    public CondparcelaPK(int cdCondparcela, int cdCondpgto, int nmCondparcela) {
        this.cdCondparcela = cdCondparcela;
        this.cdCondpgto = cdCondpgto;
        this.nmCondparcela = nmCondparcela;
    }

    public int getCdCondparcela() {
        return cdCondparcela;
    }

    public void setCdCondparcela(int cdCondparcela) {
        this.cdCondparcela = cdCondparcela;
    }

    public int getCdCondpgto() {
        return cdCondpgto;
    }

    public void setCdCondpgto(int cdCondpgto) {
        this.cdCondpgto = cdCondpgto;
    }

    public int getNmCondparcela() {
        return nmCondparcela;
    }

    public void setNmCondparcela(int nmCondparcela) {
        this.nmCondparcela = nmCondparcela;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cdCondparcela;
        hash += (int) cdCondpgto;
        hash += (int) nmCondparcela;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CondparcelaPK)) {
            return false;
        }
        CondparcelaPK other = (CondparcelaPK) object;
        if (this.cdCondparcela != other.cdCondparcela) {
            return false;
        }
        if (this.cdCondpgto != other.cdCondpgto) {
            return false;
        }
        if (this.nmCondparcela != other.nmCondparcela) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NewSisXerox.Entity.CondparcelaPK[ cdCondparcela=" + cdCondparcela + ", cdCondpgto=" + cdCondpgto + ", nmCondparcela=" + nmCondparcela + " ]";
    }
    
}
