package org.app.model;

public class Pelicula {
    private int id;
    private String duracion;
    private String idioma;
    private String fkdirector;
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

    public String getDioma() {
        return idioma;
    }

    public void setDioma(String dioma) {
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
