package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conexion;
import pelicula.ProyeccionSalaPelicula;

public class DAO_Proyeccion extends Conexion implements DAO<ProyeccionSalaPelicula> {

    public DAO_Proyeccion(String bd) throws ClassNotFoundException, SQLException {
        super("bdcinema");
    }

    @Override
    public void create(ProyeccionSalaPelicula ob) throws SQLException {
        ejecutar("INSERT INTO proyeccion VALUES(NULL,"
                + "'" + ob.getPeliculaNombre() + "',"
                + "'" + ob.getHorario() + "',"
                + "'" + ob.getFecha() + "',"
                + "'" + ob.getSalaInfo() + "',"
                + "'" + ob.getLocalidad() + "',"
                + "'" + ob.getPrecio() + "');");

    }

    @Override
    public List<ProyeccionSalaPelicula> read() throws SQLException {
        List<ProyeccionSalaPelicula> cartelera = new ArrayList<>();

        ResultSet rs = ejecutar("SELECT * FROM proyeccion;");

        ProyeccionSalaPelicula p;

        while (rs.next()) {
            p = new ProyeccionSalaPelicula();

            p.setId(1);
            p.setPeliculaNombre(rs.getString(2));
            p.setHorario(rs.getString(3));
            p.setFecha(rs.getString(4));
            p.setSalaInfo(rs.getString(5));
            p.setLocalidad(rs.getString(6));
            p.setPrecio(7);

            cartelera.add(p);

        }
        return cartelera;
    }

    @Override
    public void update(ProyeccionSalaPelicula ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(ProyeccionSalaPelicula ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
