/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Resultado;

import Modelo.Parametro.Parametro;
import Modelo.Paciente.Paciente;
import Modelo.Bacteriologa.Bacteriologa;
import java.io.Serializable;
import java.util.Date;


public class Resultado implements Serializable {

    private Integer iDResultado;
    private float valor;
    private Date fechaRealizacion;
    private int iDBacteriologa;
    private int iDPaciente;
    private int iDParametro;

    public Resultado() {
    }

    public Resultado(Integer iDResultado) {
        this.iDResultado = iDResultado;
    }

    public Resultado(Integer iDResultado, int valor, Date fechaRealizacion) {
        this.iDResultado = iDResultado;
        this.valor = valor;
        this.fechaRealizacion = fechaRealizacion;
    }

    Resultado(int idResultado, int idParametro, int idPaciente, float valor, int idBacteriologa, Date fecha) {
        this.iDResultado = idResultado;
        this.iDParametro = idParametro;
        this.iDPaciente = idPaciente;
        this.valor = valor;
        this.iDBacteriologa = idBacteriologa;
        this.fechaRealizacion = fecha;
    }

    public Integer getIDResultado() {
        return iDResultado;
    }

    public void setIDResultado(Integer iDResultado) {
        this.iDResultado = iDResultado;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public int getIDBacteriologa() {
        return iDBacteriologa;
    }

    public void setIDBacteriologa(int iDBacteriologa) {
        this.iDBacteriologa = iDBacteriologa;
    }

    public int getIDPaciente() {
        return iDPaciente;
    }

    public void setIDPaciente(int iDPaciente) {
        this.iDPaciente = iDPaciente;
    }

    public int getIDParametro() {
        return iDParametro;
    }

    public void setIDParametro(int iDParametro) {
        this.iDParametro = iDParametro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDResultado != null ? iDResultado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resultado)) {
            return false;
        }
        Resultado other = (Resultado) object;
        if ((this.iDResultado == null && other.iDResultado != null) || (this.iDResultado != null && !this.iDResultado.equals(other.iDResultado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Resultado[ iDResultado=" + iDResultado + " ]";
    }
    
}
