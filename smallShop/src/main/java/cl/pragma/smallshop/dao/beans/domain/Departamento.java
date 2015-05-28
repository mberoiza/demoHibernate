/*
 * Software desarrollado por Pragma Inf.
 * Derechos reservados 2015 mberoiza.
 *
 * http://www.pragma.cl
 */
package cl.pragma.smallshop.dao.beans.domain;

import java.util.Set;

/**
 *
 * @author mberoiza
 */
public class Departamento {
    private Integer id;
    private String nombre;
    private String ciudad;
    private Empleado administrador;
    private Ubicacion ubicacion;
    private Set<Empleado> empleados;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Set<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Empleado getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Empleado administrador) {
        this.administrador = administrador;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 97 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        hash = 97 * hash + (this.ciudad != null ? this.ciudad.hashCode() : 0);
        hash = 97 * hash + (this.administrador != null ? this.administrador.hashCode() : 0);
        hash = 97 * hash + (this.ubicacion != null ? this.ubicacion.hashCode() : 0);
        hash = 97 * hash + (this.empleados != null ? this.empleados.hashCode() : 0);
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
        final Departamento other = (Departamento) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
}
