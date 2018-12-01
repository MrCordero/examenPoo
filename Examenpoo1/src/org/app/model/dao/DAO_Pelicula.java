package org.app.model.dao;

import java.sql.SQLException;
import java.util.List;
import org.app.model.Conexion;
import org.app.model.Pelicula;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
