package model.tablemodel;

import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pelicula.Pelicula;

public class TMPelicula extends AbstractTableModel {

    private List<Pelicula> lista;

    public TMPelicula(List<Pelicula> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pelicula peli = lista.get(rowIndex);
        
        switch (columnIndex){
            case 0:
                return peli.getNombre();
            case 1:
                return peli.getDuracion();
            case 2:
                return peli.getIdioma();
            default:
                return  peli.getResumen();
        }
    }
       @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nombre";
            case 1:
                return "Duración";
            case 2:
                return "Idioma";
            default:
                return "Resumen";
        }

    }
  
}
