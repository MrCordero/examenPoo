package org.app.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.app.model.Cliente;
import org.app.model.Conexion;

public class DAO_Cliente extends Conexion implements DAO<Cliente> {

    public DAO_Cliente() throws ClassNotFoundException, SQLException {
        super("bdcinema");
    }

    @Override
    public void create(Cliente ob) throws SQLException {
        ejecutar("INSERT INTO cliente VALUES(NULL,"
                + "'" + ob.getNombre() + "',"
                + "'" + ob.getRut() + "',"
                + "'" + ob.getMail() + "',"
                + "'" + ob.getTelefono() + "');");

    }

    @Override
    public List<Cliente> read() throws SQLException {
        List<Cliente> cliente = new ArrayList<>();
        ResultSet rs = ejecutar("SELECT * FROM cliente;");

        Cliente cl;

        while (rs.next()) {
            cl = new Cliente();

            cl.setId(1);
            cl.setNombre(rs.getString(2));
            cl.setRut(rs.getString(3));
            cl.setMail(rs.getString(4));
            cl.setTelefono(rs.getNString(5));

            cliente.add(cl);
        }
        return cliente;
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
