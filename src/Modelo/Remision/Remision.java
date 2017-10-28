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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "remision")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Remision.findAll", query = "SELECT r FROM Remision r")
    , @NamedQuery(name = "Remision.findByIDRemision", query = "SELECT r FROM Remision r WHERE r.iDRemision = :iDRemision")
    , @NamedQuery(name = "Remision.findByFecha", query = "SELECT r FROM Remision r WHERE r.fecha = :fecha")})
public class Remision implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDRemision")
    private Integer iDRemision;
    @Basic(optional = false)
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @ManyToMany(mappedBy = "remisionCollection")
    private Collection<Examen> examenCollection;
    @JoinColumn(name = "IDMedico", referencedColumnName = "IDMedico")
    @ManyToOne(optional = false)
    private Medico iDMedico;
    @JoinColumn(name = "IDPaciente", referencedColumnName = "IDPaciente")
    @ManyToOne(optional = false)
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
