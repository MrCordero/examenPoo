package org.app.model.dao;

import java.sql.SQLException;
import java.util.List;
import org.app.model.Conexion;
import org.app.model.Director;

public class DAO_Director extends Conexion implements DAO<Director>{

    public DAO_Director() throws ClassNotFoundException, SQLException {
        super("bdcinema");
    }

    @Override
    public void create(Director ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Director> read() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Director ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Director ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
