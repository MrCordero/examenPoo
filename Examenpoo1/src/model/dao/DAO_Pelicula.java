package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conexion;
import pelicula.Pelicula;

public class DAO_Pelicula extends Conexion implements DAO<Pelicula> {

    public DAO_Pelicula(String bd) throws ClassNotFoundException, SQLException {
        super("bdcinema");
    }

    @Override
    public void create(Pelicula ob) throws SQLException {
        ejecutar("INSERT INTO pelicula VALUES(NULL,"
                + "'" + ob.getDuracion() + "',"
                + "'" + ob.getDioma() + "',"
                + "'" + ob.getFkdirector() + "',"
                + "'" + ob.getResumen() + "');");
    }

    @Override
    public List<Pelicula> read() throws SQLException {
        List<Pelicula> pelicula = new ArrayList<>();
        ResultSet rs = ejecutar("SELECT * FROM pelicula;");
        
        Pelicula pl;
        
        while(rs.next()){
            pl = new Pelicula();
            
            pl.setId(1);
            pl.setDioma(rs.getString(2));
            pl.setDuracion(rs.getString(3));
            pl.setFkdirector(rs.getString(4));
            pl.setResumen(rs.getString(5));
            
            pelicula.add(pl);
        }
        return pelicula;
    }

    @Override
    public void update(Pelicula ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Pelicula ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
