package org.app.model;

public class Sala {
    private int id;
    private String tipo_sala;
    private int fkasientos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_sala() {
        return tipo_sala;
    }

    public void setTipo_sala(String tipo_sala) {
        this.tipo_sala = tipo_sala;
    }

    public int getFkasientos() {
        return fkasientos;
    }

    public void setFkasientos(int fkasientos) {
        this.fkasientos = fkasientos;
    }
}
