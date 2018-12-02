package model.dao;

import java.sql.SQLException;
import java.util.List;
import model.Conexion;
import Cliente_Director.Director;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO_Director extends Conexion implements DAO<Director> {

    public DAO_Director() throws ClassNotFoundException, SQLException {
        super("bdcinema");
    }

    @Override
    public void create(Director ob) throws SQLException {
        ejecutar("INSERT INTO director VALUES(NULL,"
                + "'" + ob.getNombre() + "',"
                + "'" + ob.getRut() + "',"
                + "'" + ob.getNacionalidad() + "');");
    }

    @Override
    public List<Director> read() throws SQLException {
      List<Director> director = new ArrayList<>();
      ResultSet rs = ejecutar("SELECT * FROM director;");
      
      Director dr;
      
      while(rs.next()){
          dr = new Director();
          
          dr.setId(1);
          dr.setRut(rs.getString(2));
          dr.setNombre(rs.getString(3));
          dr.setNacionalidad(rs.getString(4));
          
          director.add(dr);
      }
      return director;
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
