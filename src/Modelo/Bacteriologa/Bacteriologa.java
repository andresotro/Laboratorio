/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Bacteriologa;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "bacteriologa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bacteriologa.findAll", query = "SELECT b FROM Bacteriologa b")
    , @NamedQuery(name = "Bacteriologa.findByIDBacteriologa", query = "SELECT b FROM Bacteriologa b WHERE b.iDBacteriologa = :iDBacteriologa")
    , @NamedQuery(name = "Bacteriologa.findByNombre", query = "SELECT b FROM Bacteriologa b WHERE b.nombre = :nombre")
    , @NamedQuery(name = "Bacteriologa.findByApellido", query = "SELECT b FROM Bacteriologa b WHERE b.apellido = :apellido")
    , @NamedQuery(name = "Bacteriologa.findByUsuario", query = "SELECT b FROM Bacteriologa b WHERE b.usuario = :usuario")
    , @NamedQuery(name = "Bacteriologa.findByPassword", query = "SELECT b FROM Bacteriologa b WHERE b.password = :password")
    , @NamedQuery(name = "Bacteriologa.findByIdentificacion", query = "SELECT b FROM Bacteriologa b WHERE b.identificacion = :identificacion")})
public class Bacteriologa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDBacteriologa")
    private Integer iDBacteriologa;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "Apellido")
    private String apellido;
    @Basic(optional = false)
    @Column(name = "Usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @Column(name = "Identificacion")
    private long identificacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDBacteriologa")
    private Collection<Resultado> resultadoCollection;

    public Bacteriologa() {
    }

    public Bacteriologa(Integer iDBacteriologa) {
        this.iDBacteriologa = iDBacteriologa;
    }

    public Bacteriologa(Integer iDBacteriologa, String nombre, String apellido, String usuario, String password, long identificacion) {
        this.iDBacteriologa = iDBacteriologa;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.password = password;
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

    @XmlTransient
    public Collection<Resultado> getResultadoCollection() {
        return resultadoCollection;
    }

    public void setResultadoCollection(Collection<Resultado> resultadoCollection) {
        this.resultadoCollection = resultadoCollection;
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
