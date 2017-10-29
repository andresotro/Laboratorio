/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Remision;

import Modelo.Paciente.Paciente;
import Modelo.Medico.Medico;
import Modelo.Examen.Examen;
import java.io.Serializable;
import java.util.Collection;
import java.sql.Date;
import javax.xml.bind.annotation.XmlTransient;

public class Remision implements Serializable {

    private Integer iDRemision;
    private String fecha;
    private Collection<Examen> examenCollection;
    private String razon;
    private Medico iDMedico;
    private Paciente iDPaciente;

    public Remision() {
    }

    public Remision(Integer iDRemision) {
        this.iDRemision = iDRemision;
    }

    public Remision(Integer iDRemision, String fecha, String razon) {
        this.iDRemision = iDRemision;
        this.fecha = fecha;
        this.razon = razon;
    }

    public Integer getIDRemision() {
        return iDRemision;
    }

    public void setIDRemision(Integer iDRemision) {
        this.iDRemision = iDRemision;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public Collection<Examen> getExamenCollection() {
        return examenCollection;
    }

    public void setExamenCollection(Collection<Examen> examenCollection) {
        this.examenCollection = examenCollection;
    }

    public Medico getIDMedico() {
        return iDMedico;
    }

    public void setIDMedico(Medico iDMedico) {
        this.iDMedico = iDMedico;
    }
    
    public String getRazon(){
        return razon;
    }
    
    public void setRazon(String razon){
        this.razon = razon;
    }

    public Paciente getIDPaciente() {
        return iDPaciente;
    }

    public void setIDPaciente(Paciente iDPaciente) {
        this.iDPaciente = iDPaciente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDRemision != null ? iDRemision.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Remision)) {
            return false;
        }
        Remision other = (Remision) object;
        if ((this.iDRemision == null && other.iDRemision != null) || (this.iDRemision != null && !this.iDRemision.equals(other.iDRemision))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Remision[ iDRemision=" + iDRemision + " ]";
    }
    
}
