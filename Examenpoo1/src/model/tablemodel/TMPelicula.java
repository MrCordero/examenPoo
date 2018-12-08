package model.tablemodel;

import java.text.DecimalFormat;
import java.util.List;
import pelicula.Pelicula;

public class TMPelicula {
    
    private List<Pelicula> lista;
    public TMPelicula(List<Pelicula> lista){
        this.lista = lista;
    }

    public int getRowCount() {
        return lista.size();
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nombre";
            case 1:
                return "Duración";
            case 2:
                return "Idioma";
            case 3:
                return "Director";
            default:
                return "Resumen";
        }
    }
}
