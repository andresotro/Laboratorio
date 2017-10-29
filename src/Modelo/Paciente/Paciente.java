/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Paciente;

import Modelo.Remision.Remision;
import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author USUARIO
 */
public class Paciente implements Serializable {

    private Integer iDPaciente;
    private String nombre;
    private String apellido;
    private long identificacion;
    private int edad;
    private String direccioncasa;
    private String usuario;
    private String password;
    private int iDCiudad;
    private int iDGenero;
    private Collection<Remision> remisionCollection;

    public Paciente() {
    }

    public Paciente(Integer iDPaciente) {
        this.iDPaciente = iDPaciente;
    }

    public Paciente(Integer iDPaciente, String nombre, String apellido, long identificacion, int edad, String direccioncasa, String usuario, String password) {
        this.iDPaciente = iDPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.edad = edad;
        this.direccioncasa = direccioncasa;
        this.usuario = usuario;
        this.password = password;
    }

    Paciente(int id, String nombre, String apellido, long identificacion, int edad, String direccion, int idCiudad, String usuario, String contraseña, int idGenero) {
        this.iDPaciente = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.edad = edad;
        this.direccioncasa = direccion;
        this.usuario = usuario;
        this.password = contraseña;
        this.iDGenero = idGenero;
    }

    public Integer getIDPaciente() {
        return iDPaciente;
    }

    public void setIDPaciente(Integer iDPaciente) {
        this.iDPaciente = iDPaciente;
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

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccioncasa() {
        return direccioncasa;
    }

    public void setDireccioncasa(String direccioncasa) {
        this.direccioncasa = direccioncasa;
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

    public int getIDCiudad() {
        return iDCiudad;
    }

    public void setIDCiudad(int iDCiudad) {
        this.iDCiudad = iDCiudad;
    }

    public int getIDGenero() {
        return iDGenero;
    }

    public void setIDGenero(int iDGenero) {
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
    
    public void setCiudadString(String ciudad) {
        switch (ciudad) {
            case "Bogotá":
                this.iDCiudad = 1;
                break;
            case "Zipaquirá":
                this.iDCiudad = 2;
                break;
            case "Chia":
                this.iDCiudad = 3;
                break;
            case "Cajicá":
                this.iDCiudad = 4;
                break;
            case "Sopó":
                this.iDCiudad = 5;
                break;
            case "Tocancipá":
                this.iDCiudad = 6;
                break;
            default:
                break;
        }
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPaciente != null ? iDPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.iDPaciente == null && other.iDPaciente != null) || (this.iDPaciente != null && !this.iDPaciente.equals(other.iDPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Paciente[ iDPaciente=" + iDPaciente + " ]";
    }
    
}
