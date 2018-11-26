package org.app.model;

import java.util.Objects;

public class Sala {

    @Override
    public String toString() {
        return "Sala{" + "id=" + id + ", tipo_sala=" + tipo_sala + ", fkasientos=" + fkasientos + '}';
    }
    private int id;
    private String tipo_sala;
    private int fkasientos;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.tipo_sala);
        hash = 67 * hash + this.fkasientos;
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
        final Sala other = (Sala) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.fkasientos != other.fkasientos) {
            return false;
        }
        if (!Objects.equals(this.tipo_sala, other.tipo_sala)) {
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
