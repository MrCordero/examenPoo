package pelicula;

import java.util.Objects;

public class Pelicula {
    private int id;
    private String duracion;
    private String idioma;
    private String fkdirector;

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", duracion=" + duracion + ", idioma=" + idioma + ", fkdirector=" + fkdirector + ", resumen=" + resumen + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.duracion);
        hash = 79 * hash + Objects.hashCode(this.idioma);
        hash = 79 * hash + Objects.hashCode(this.fkdirector);
        hash = 79 * hash + Objects.hashCode(this.resumen);
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
    private String resumen;   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setIdioma(String dioma) {
        this.idioma = dioma;
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
