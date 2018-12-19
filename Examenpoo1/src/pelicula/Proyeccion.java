package pelicula;

import java.util.Objects;

public class Proyeccion {

    private int id;
    private String fkpelicula;
    private String horario;
    private String fecha;
    private String fksala;
    private String localidad;
    private int precio;

    @Override
    public String toString() {
        return "Proyeccion{" + "id=" + id + ", fkpelicula=" + fkpelicula + ", horario=" + horario + ", fecha=" + fecha + ", fksala=" + fksala + ", localidad=" + localidad + ", precio=" + precio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.fkpelicula);
        hash = 53 * hash + Objects.hashCode(this.horario);
        hash = 53 * hash + Objects.hashCode(this.fecha);
        hash = 53 * hash + Objects.hashCode(this.fksala);
        hash = 53 * hash + Objects.hashCode(this.localidad);
        hash = 53 * hash + this.precio;
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
        final Proyeccion other = (Proyeccion) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.precio != other.precio) {
            return false;
        }
        if (!Objects.equals(this.fkpelicula, other.fkpelicula)) {
            return false;
        }
        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        if (!Objects.equals(this.fksala, other.fksala)) {
            return false;
        }
        if (!Objects.equals(this.localidad, other.localidad)) {
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFkpelicula() {
        return fkpelicula;
    }

    public void setFkpelicula(String fkpelicula) {
        this.fkpelicula = fkpelicula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFksala() {
        return fksala;
    }

    public void setFksala(String fksala) {
        this.fksala = fksala;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setPrecio(String precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}