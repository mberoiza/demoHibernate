/*
 * Software desarrollado por Pragma Inf.
 * Derechos reservados 2015 mberoiza.
 *
 * http://www.pragma.cl
 */
package cl.pragma.smallshop.dao.beans.domain;

/**
 *
 * @author mberoiza
 */
public class Cargo {
    private Integer id;
    private String descripcion;
    private Double salarioMin;
    private Double salarioMax;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getSalarioMin() {
        return salarioMin;
    }

    public void setSalarioMin(Double salarioMin) {
        this.salarioMin = salarioMin;
    }

    public Double getSalarioMax() {
        return salarioMax;
    }

    public void setSalarioMax(Double salarioMax) {
        this.salarioMax = salarioMax;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 97 * hash + (this.descripcion != null ? this.descripcion.hashCode() : 0);
        hash = 97 * hash + (this.salarioMin != null ? this.salarioMin.hashCode() : 0);
        hash = 97 * hash + (this.salarioMax != null ? this.salarioMax.hashCode() : 0);
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
        final Cargo other = (Cargo) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

   
}
