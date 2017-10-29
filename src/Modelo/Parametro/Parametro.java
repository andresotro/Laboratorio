/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Parametro;

import Modelo.Examen.Examen;
import Modelo.Resultado.Resultado;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


public class Parametro implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer iDParametro;
    private float valorMinimo;
    private float valorMaximo;
    private String nombre;
    private String descripcion;
    private Collection<Resultado> resultadoCollection;
    private int iDExamen;

    public Parametro() {
    }

    public Parametro(Integer iDParametro) {
        this.iDParametro = iDParametro;
    }

    public Parametro(Integer iDParametro, int valorMinimo, int valorMaximo, String nombre, String descripcion) {
        this.iDParametro = iDParametro;
        this.valorMinimo = valorMinimo;
        this.valorMaximo = valorMaximo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    Parametro(int idParametro, int idExamen, float minV, float maxV, String nombre, String descripcion) {
        this.iDParametro = idParametro;
        this.iDExamen = idExamen;
        this.valorMinimo = minV;
        this.valorMaximo = maxV;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getIDParametro() {
        return iDParametro;
    }

    public void setIDParametro(Integer iDParametro) {
        this.iDParametro = iDParametro;
    }

    public float getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(float valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public float getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(float valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Resultado> getResultadoCollection() {
        return resultadoCollection;
    }

    public void setResultadoCollection(Collection<Resultado> resultadoCollection) {
        this.resultadoCollection = resultadoCollection;
    }

    public int getIDExamen() {
        return iDExamen;
    }

    public void setIDExamen(int iDExamen) {
        this.iDExamen = iDExamen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDParametro != null ? iDParametro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parametro)) {
            return false;
        }
        Parametro other = (Parametro) object;
        if ((this.iDParametro == null && other.iDParametro != null) || (this.iDParametro != null && !this.iDParametro.equals(other.iDParametro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Parametro[ iDParametro=" + iDParametro + " ]";
    }
    
}
