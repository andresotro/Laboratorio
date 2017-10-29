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
import java.util.Date;
import javax.xml.bind.annotation.XmlTransient;

public class Remision implements Serializable {

    private Integer iDRemision;
    private Date fecha;
    private Collection<Examen> examenCollection;
    private Medico iDMedico;
    private Paciente iDPaciente;

    public Remision() {
    }

    public Remision(Integer iDRemision) {
        this.iDRemision = iDRemision;
    }

    public Remision(Integer iDRemision, Date fecha) {
        this.iDRemision = iDRemision;
        this.fecha = fecha;
    }

    public Integer getIDRemision() {
        return iDRemision;
    }

    public void setIDRemision(Integer iDRemision) {
        this.iDRemision = iDRemision;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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
