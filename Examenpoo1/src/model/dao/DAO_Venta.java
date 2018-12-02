package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conexion;
import pelicula.Venta;

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
        List<Venta> venta = new ArrayList<>();
        ResultSet rs = ejecutar("SELECT * FROM venta;");
        
        Venta vt;
        
        while(rs.next()){
            vt = new Venta();
            
            vt.setId(1);
            vt.setTipo_venta(rs.getString(2));
            
            venta.add(vt);
        }
        return venta;
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
