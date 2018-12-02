package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conexion;
import sala.Sala;

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
        List<Sala> sala = new ArrayList<>();
        ResultSet rs = ejecutar("SELECT * FROM sala;");
        
        Sala sl;
        
        while(rs.next()){
            sl = new Sala();
            
            sl.setId(1);
            sl.setTipo_sala(rs.getString(2));
            sl.setFkasientos(3);
            
            sala.add(sl);
        }
        return sala;
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
