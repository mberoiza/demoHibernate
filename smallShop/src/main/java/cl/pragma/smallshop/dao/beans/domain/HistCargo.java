/*
 * Software desarrollado por Pragma Inf.
 * Derechos reservados 2015 mberoiza.
 *
 * http://www.pragma.cl
 */
package cl.pragma.smallshop.dao.beans.domain;

import java.util.Date;

/**
 *
 * @author mberoiza
 */
public class HistCargo {
    private Empleado empleado;
    private Date inicio;
    private Date fin;
    private Cargo cargo;
    Departamento departamento;

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.empleado != null ? this.empleado.hashCode() : 0);
        hash = 97 * hash + (this.inicio != null ? this.inicio.hashCode() : 0);
        hash = 97 * hash + (this.fin != null ? this.fin.hashCode() : 0);
        hash = 97 * hash + (this.cargo != null ? this.cargo.hashCode() : 0);
        hash = 97 * hash + (this.departamento != null ? this.departamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HistCargo other = (HistCargo) obj;
        if (this.empleado != other.empleado && (this.empleado == null || !this.empleado.equals(other.empleado))) {
            return false;
        }
        if (this.inicio != other.inicio && (this.inicio == null || !this.inicio.equals(other.inicio))) {
            return false;
        }
        return true;
    }
    
    
    
}
