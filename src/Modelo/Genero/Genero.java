/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Genero;

import Modelo.Paciente.Paciente;
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
 * @author USUARIO
 */
@Entity
@Table(name = "genero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Genero.findAll", query = "SELECT g FROM Genero g")
    , @NamedQuery(name = "Genero.findByIDGenero", query = "SELECT g FROM Genero g WHERE g.iDGenero = :iDGenero")
    , @NamedQuery(name = "Genero.findByGenero", query = "SELECT g FROM Genero g WHERE g.genero = :genero")})
public class Genero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDGenero")
    private Integer iDGenero;
    @Basic(optional = false)
    @Column(name = "Genero")
    private String genero;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDGenero")
    private Collection<Paciente> pacienteCollection;

    public Genero() {
    }

    public Genero(Integer iDGenero) {
        this.iDGenero = iDGenero;
    }

    public Genero(Integer iDGenero, String genero) {
        this.iDGenero = iDGenero;
        this.genero = genero;
    }

    public Integer getIDGenero() {
        return iDGenero;
    }

    public void setIDGenero(Integer iDGenero) {
        this.iDGenero = iDGenero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @XmlTransient
    public Collection<Paciente> getPacienteCollection() {
        return pacienteCollection;
    }

    public void setPacienteCollection(Collection<Paciente> pacienteCollection) {
        this.pacienteCollection = pacienteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDGenero != null ? iDGenero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Genero)) {
            return false;
        }
        Genero other = (Genero) object;
        if ((this.iDGenero == null && other.iDGenero != null) || (this.iDGenero != null && !this.iDGenero.equals(other.iDGenero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Genero[ iDGenero=" + iDGenero + " ]";
    }
    
}
