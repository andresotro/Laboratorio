/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Remision;

import java.io.Serializable;
import java.util.Date;

public class Remision implements Serializable {

    private Integer iDRemision;
    private boolean verificaParametros;
    private Date fecha;
    private String razon;
    private int iDMedico;
    private int iDPaciente;

    public Remision() {
    }

    public Remision(Integer iDRemision) {
        this.iDRemision = iDRemision;
    }

    public Remision(Integer iDRemision, Date fecha, String razon, boolean verificaParametros) {
        this.iDRemision = iDRemision;
        this.fecha = fecha;
        this.razon = razon;
        this.verificaParametros = verificaParametros;
    }

    Remision(int id, int idPaciente, Date fecha, int idMedico, String razon, boolean verificaParametros) {
        this.iDRemision = id;
        this.iDPaciente = idPaciente;
        this.fecha = fecha;
        this.iDMedico = idMedico;
        this.razon = razon;
        this.verificaParametros = verificaParametros;
    }

    public Integer getIDRemision() {
        return iDRemision;
    }

    public void setIDRemision(Integer iDRemision) {
        this.iDRemision = iDRemision;
    }
    
    public boolean getVerificaParametros(){
        return verificaParametros;
    }
    
    public void setVerificaParametros(){
        this.verificaParametros = verificaParametros;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIDMedico() {
        return iDMedico;
    }

    public void setIDMedico(int iDMedico) {
        this.iDMedico = iDMedico;
    }
    
    public String getRazon(){
        return razon;
    }
    
    public void setRazon(String razon){
        this.razon = razon;
    }

    public int getIDPaciente() {
        return iDPaciente;
    }

    public void setIDPaciente(int iDPaciente) {
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
