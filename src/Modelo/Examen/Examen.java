/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Examen;

import Modelo.Parametro.Parametro;
import Modelo.Remision.Remision;
import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlTransient;


public class Examen implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer iDExamen;
    private String nombre;
    private String descripcion;
    private Collection<Remision> remisionCollection;
    private Collection<Parametro> parametroCollection;

    public Examen() {
    }

    public Examen(Integer iDExamen) {
        this.iDExamen = iDExamen;
    }

    public Examen(Integer iDExamen, String nombre, String descripcion) {
        this.iDExamen = iDExamen;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getIDExamen() {
        return iDExamen;
    }

    public void setIDExamen(Integer iDExamen) {
        this.iDExamen = iDExamen;
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
    public Collection<Remision> getRemisionCollection() {
        return remisionCollection;
    }

    public void setRemisionCollection(Collection<Remision> remisionCollection) {
        this.remisionCollection = remisionCollection;
    }

    @XmlTransient
    public Collection<Parametro> getParametroCollection() {
        return parametroCollection;
    }

    public void setParametroCollection(Collection<Parametro> parametroCollection) {
        this.parametroCollection = parametroCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDExamen != null ? iDExamen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Examen)) {
            return false;
        }
        Examen other = (Examen) object;
        if ((this.iDExamen == null && other.iDExamen != null) || (this.iDExamen != null && !this.iDExamen.equals(other.iDExamen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Examen[ iDExamen=" + iDExamen + " ]";
    }
    
}
