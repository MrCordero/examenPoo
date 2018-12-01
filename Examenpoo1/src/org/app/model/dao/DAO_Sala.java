package org.app.model.dao;

import java.sql.SQLException;
import java.util.List;
import org.app.model.Conexion;
import org.app.model.Sala;

public class DAO_Sala extends Conexion implements DAO<Sala> {

    public DAO_Sala(String bd) throws ClassNotFoundException, SQLException {
        super("bdcinema");
    }

    @Override
    public void create(Sala ob) throws SQLException {
        ejecutar("INSERT INTO cliente VALUES(NULL,"
                + "'" + ob.getTipo_sala() + "',"
                + "'" + ob.getFkasientos() + "');");
    }

    @Override
    public List<Sala> read() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Sala ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Sala ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
