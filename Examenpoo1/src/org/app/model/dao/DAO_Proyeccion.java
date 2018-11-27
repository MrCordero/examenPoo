package org.app.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        List<Proyeccion> cartelera = new ArrayList<>();
        
        ResultSet rs = ejecutar("SELECT * FROM proyeccion");
        
        Proyeccion p;
        
        while(rs.next()){
            p = new Proyeccion();
            
            p.setId(1);
            p.setFkpelicula(2);
            p.setHorario(rs.getString(3));
            p.setFecha(rs.getString(4));
            p.setFksala(5);
            p.setLocalidad(rs.getString(6));
            p.setPrecio(7);
            
            cartelera.add(p);
            
        }
        return cartelera;
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
