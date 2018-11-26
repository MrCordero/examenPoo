package org.app.model;

public class Asiento {
    private int fila;

    @Override
    public String toString() {
        return "Asiento{" + "fila=" + fila + ", numero=" + numero + ", estado=" + estado + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.fila;
        hash = 79 * hash + this.numero;
        hash = 79 * hash + (this.estado ? 1 : 0);
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
        final Asiento other = (Asiento) obj;
        if (this.fila != other.fila) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (this.estado != other.estado) {
            return false;
        }
        return true;
    }
    private int numero;
    private boolean estado;

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
