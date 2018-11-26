package org.app.model.dao;

import java.sql.SQLException;
import java.util.List;
import org.app.model.Conexion;
import org.app.model.Proyeccion;

public class DAO_Proyeccion extends Conexion implements DAO<Proyeccion>{

    public DAO_Proyeccion() throws ClassNotFoundException, SQLException {
        super("bdcinema");
    }

    @Override
    public void create(Proyeccion ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Proyeccion> read() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Proyeccion ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Proyeccion ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
