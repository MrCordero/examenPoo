package pelicula;

import java.util.Objects;

public class Pelicula {
    private int id;
    private String nombre;
    private String duracion;
    private String idioma;
    private String fkdirector;
    private String resumen;

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", nombre=" + nombre + ", duracion=" + duracion + ", idioma=" + idioma + ", fkdirector=" + fkdirector + ", resumen=" + resumen + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.duracion);
        hash = 97 * hash + Objects.hashCode(this.idioma);
        hash = 97 * hash + Objects.hashCode(this.fkdirector);
        hash = 97 * hash + Objects.hashCode(this.resumen);
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
        final Pelicula other = (Pelicula) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.duracion, other.duracion)) {
            return false;
        }
        if (!Objects.equals(this.idioma, other.idioma)) {
            return false;
        }
        if (!Objects.equals(this.fkdirector, other.fkdirector)) {
            return false;
        }
        if (!Objects.equals(this.resumen, other.resumen)) {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getFkdirector() {
        return fkdirector;
    }

    public void setFkdirector(String fkdirector) {
        this.fkdirector = fkdirector;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    


}
