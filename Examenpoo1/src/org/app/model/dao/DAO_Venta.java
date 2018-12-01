package org.app.model.dao;

import java.sql.SQLException;
import java.util.List;
import org.app.model.Conexion;
import org.app.model.Venta;

public class DAO_Venta extends Conexion implements DAO<Venta> {

    public DAO_Venta(String bd) throws ClassNotFoundException, SQLException {
        super("bdcinema");
    }

    @Override
    public void create(Venta ob) throws SQLException {
        ejecutar("INSERT INTO cliente VALUES(NULL,"
                + "'" + ob.getTipo_venta() + "');");
    }

    @Override
    public List<Venta> read() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Venta ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Venta ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void venta() {
        
    }

}
