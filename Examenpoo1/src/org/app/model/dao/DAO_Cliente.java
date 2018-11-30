package org.app.model.dao;

import java.sql.SQLException;
import java.util.List;
import org.app.model.Cliente;
import org.app.model.Conexion;

public class DAO_Cliente extends Conexion implements DAO<Cliente>{

    public DAO_Cliente() throws ClassNotFoundException, SQLException {
        super("bdcinema");
    }

    @Override
    public void create(Cliente ob) throws SQLException {
       
    }

    @Override
    public List<Cliente> read() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Cliente ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Cliente ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
