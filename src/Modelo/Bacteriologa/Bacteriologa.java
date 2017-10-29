/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Bacteriologa;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public class Bacteriologa implements Serializable {

    private Integer iDBacteriologa;
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private long identificacion;

    public Bacteriologa() {
    }

    public Bacteriologa(Integer iDBacteriologa) {
        this.iDBacteriologa = iDBacteriologa;
    }

    public Bacteriologa(int id, String nombre, String apellido, long identificacion, String usuario, String contraseña) {
        this.iDBacteriologa = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.password = contraseña;
        this.identificacion = identificacion;
    }

    public Integer getIDBacteriologa() {
        return iDBacteriologa;
    }

    public void setIDBacteriologa(Integer iDBacteriologa) {
        this.iDBacteriologa = iDBacteriologa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDBacteriologa != null ? iDBacteriologa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bacteriologa)) {
            return false;
        }
        Bacteriologa other = (Bacteriologa) object;
        if ((this.iDBacteriologa == null && other.iDBacteriologa != null) || (this.iDBacteriologa != null && !this.iDBacteriologa.equals(other.iDBacteriologa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Bacteriologa[ iDBacteriologa=" + iDBacteriologa + " ]";
    }
    
}
