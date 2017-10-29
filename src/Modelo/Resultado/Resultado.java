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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "resultado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resultado.findAll", query = "SELECT r FROM Resultado r")
    , @NamedQuery(name = "Resultado.findByIDResultado", query = "SELECT r FROM Resultado r WHERE r.iDResultado = :iDResultado")
    , @NamedQuery(name = "Resultado.findByValor", query = "SELECT r FROM Resultado r WHERE r.valor = :valor")
    , @NamedQuery(name = "Resultado.findByFechaRealizacion", query = "SELECT r FROM Resultado r WHERE r.fechaRealizacion = :fechaRealizacion")})
public class Resultado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDResultado")
    private Integer iDResultado;
    @Basic(optional = false)
    @Column(name = "Valor")
    private int valor;
    @Basic(optional = false)
    @Column(name = "Fecha_Realizacion")
    @Temporal(TemporalType.DATE)
    private Date fechaRealizacion;
    @JoinColumn(name = "IDBacteriologa", referencedColumnName = "IDBacteriologa")
    @ManyToOne(optional = false)
    private Bacteriologa iDBacteriologa;
    @JoinColumn(name = "IDPaciente", referencedColumnName = "IDPaciente")
    @ManyToOne(optional = false)
    private Paciente iDPaciente;
    @JoinColumn(name = "IDParametro", referencedColumnName = "IDParametro")
    @ManyToOne(optional = false)
    private Parametro iDParametro;

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

    public Integer getIDResultado() {
        return iDResultado;
    }

    public void setIDResultado(Integer iDResultado) {
        this.iDResultado = iDResultado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public Bacteriologa getIDBacteriologa() {
        return iDBacteriologa;
    }

    public void setIDBacteriologa(Bacteriologa iDBacteriologa) {
        this.iDBacteriologa = iDBacteriologa;
    }

    public Paciente getIDPaciente() {
        return iDPaciente;
    }

    public void setIDPaciente(Paciente iDPaciente) {
        this.iDPaciente = iDPaciente;
    }

    public Parametro getIDParametro() {
        return iDParametro;
    }

    public void setIDParametro(Parametro iDParametro) {
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
