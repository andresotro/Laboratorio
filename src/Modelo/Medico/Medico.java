/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Medico;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public class Medico implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer iDMedico;
    private String nombre;
    private String apellido;
    private long telefono;
    private Integer nroRegistros;
    private String usuario;
    private String password;
    private Integer iDGenero;
    private long identificacion;

    Medico(int id, String nombre, String apellido, long identificacion, long telefono, int noRegistro, String usuario, String contraseña, int idGenero) {
        this.iDMedico = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.nroRegistros = noRegistro;
        this.usuario = usuario;
        this.password = contraseña;
        this.iDGenero = idGenero;
    }

    public Integer getIDMedico() {
        return iDMedico;
    }

    public void setIDMedico(Integer iDMedico) {
        this.iDMedico = iDMedico;
    }

    public Integer getIDGenero() {
        return iDGenero;
    }

    public void setIDGenero(Integer iDGenero) {
        this.iDGenero = iDGenero;
    }
    
    public void setGeneroString(String genero) {
        switch (genero) {
            case "Masculino":
                this.iDGenero = 1;
                break;
            case "Femenino":
                this.iDGenero = 2;
                break;
            default:
                break;
        }
    }

    public Medico() {
    }

    public Medico(Integer iDMedico) {
        this.iDMedico = iDMedico;
    }

    public Medico(Integer iDMedico, String nombre, String apellido, long telefono, String usuario, String password, long identificacion) {
        this.iDMedico = iDMedico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.usuario = usuario;
        this.password = password;
        this.identificacion = identificacion;
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

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public Integer getNroRegistros() {
        return nroRegistros;
    }

    public void setNroRegistros(Integer nroRegistros) {
        this.nroRegistros = nroRegistros;
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
        hash += (iDMedico != null ? iDMedico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medico)) {
            return false;
        }
        Medico other = (Medico) object;
        if ((this.iDMedico == null && other.iDMedico != null) || (this.iDMedico != null && !this.iDMedico.equals(other.iDMedico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Medico[ iDMedico=" + iDMedico + " ]";
    }
    
}
