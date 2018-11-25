package org.app.model;

public class Proyeccion {
    private int fkpelicula;
    private String horario;
    private String fecha;
    private int fksala;
    private String localidad;
    private int precio;

    public int getFkpelicula() {
        return fkpelicula;
    }

    public void setFkpelicula(int fkpelicula) {
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

    public int getFksala() {
        return fksala;
    }

    public void setFksala(int fksala) {
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
}
