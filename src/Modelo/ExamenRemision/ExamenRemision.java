/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.ExamenRemision;

/**
 *
 * @author USUARIO
 */
public class ExamenRemision {
    
    private int iDRemision;
    private int iDExamen;

    public ExamenRemision(int iDRemision, int iDExamen) {
        this.iDRemision = iDRemision;
        this.iDExamen = iDExamen;
    }

    public ExamenRemision() {
    }

    public int getiDRemision() {
        return iDRemision;
    }

    public void setiDRemision(int iDRemision) {
        this.iDRemision = iDRemision;
    }

    public int getiDExamen() {
        return iDExamen;
    }

    public void setiDExamen(int iDExamen) {
        this.iDExamen = iDExamen;
    }

    @Override
    public String toString() {
        return "ExamenRemision{" + "iDRemision=" + iDRemision + ", iDExamen=" + iDExamen + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.iDRemision;
        hash = 97 * hash + this.iDExamen;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ExamenRemision other = (ExamenRemision) obj;
        if (this.iDRemision != other.iDRemision) {
            return false;
        }
        if (this.iDExamen != other.iDExamen) {
            return false;
        }
        return true;
    }
    
    

}