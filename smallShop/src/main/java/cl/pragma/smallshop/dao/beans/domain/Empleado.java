/*
 * Software desarrollado por Pragma Inf.
 * Derechos reservados 2015 mberoiza.
 *
 * http://www.pragma.cl
 */
package cl.pragma.smallshop.dao.beans.domain;

import java.util.Date;
import java.util.Set;

/**
 *
 * @author mberoiza
 */
public class Empleado {
    private String id;
    private String nombre;
    private String apellido;
    private Integer email;
    private String telefono;
    private Date contratacion;
    private Cargo cargo;
    private Double salario;
    private Departamento departamento;
    private Empleado jefe;
    private Set<Empleado> subalternos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Integer getEmail() {
        return email;
    }

    public void setEmail(Integer email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getContratacion() {
        return contratacion;
    }

    public void setContratacion(Date contratacion) {
        this.contratacion = contratacion;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Empleado getJefe() {
        return jefe;
    }

    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }

    public Set<Empleado> getSubalternos() {
        return subalternos;
    }

    public void setSubalternos(Set<Empleado> subalternos) {
        this.subalternos = subalternos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 61 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        hash = 61 * hash + (this.apellido != null ? this.apellido.hashCode() : 0);
        hash = 61 * hash + (this.email != null ? this.email.hashCode() : 0);
        hash = 61 * hash + (this.telefono != null ? this.telefono.hashCode() : 0);
        hash = 61 * hash + (this.contratacion != null ? this.contratacion.hashCode() : 0);
        hash = 61 * hash + (this.cargo != null ? this.cargo.hashCode() : 0);
        hash = 61 * hash + (this.salario != null ? this.salario.hashCode() : 0);
        hash = 61 * hash + (this.departamento != null ? this.departamento.hashCode() : 0);
        hash = 61 * hash + (this.jefe != null ? this.jefe.hashCode() : 0);
        hash = 61 * hash + (this.subalternos != null ? this.subalternos.hashCode() : 0);
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
        final Empleado other = (Empleado) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
}
