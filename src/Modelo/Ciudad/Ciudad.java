/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Ciudad;

import Modelo.Paciente.Paciente;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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


public class Ciudad implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer iDCiudad;
    private String nombre;
    private Collection<Paciente> pacienteCollection;

    public Ciudad() {
    }

    public Ciudad(Integer iDCiudad) {
        this.iDCiudad = iDCiudad;
    }

    public Ciudad(Integer iDCiudad, String nombre) {
        this.iDCiudad = iDCiudad;
        this.nombre = nombre;
    }

    public Integer getIDCiudad() {
        return iDCiudad;
    }

    public void setIDCiudad(Integer iDCiudad) {
        this.iDCiudad = iDCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        hash += (iDCiudad != null ? iDCiudad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ciudad)) {
            return false;
        }
        Ciudad other = (Ciudad) object;
        if ((this.iDCiudad == null && other.iDCiudad != null) || (this.iDCiudad != null && !this.iDCiudad.equals(other.iDCiudad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Ciudad[ iDCiudad=" + iDCiudad + " ]";
    }
    
}
