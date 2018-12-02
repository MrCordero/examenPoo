package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sala.Asiento;
import model.Conexion;

public class DAO_Asiento extends Conexion implements DAO<Asiento> {

    public DAO_Asiento(String bd) throws ClassNotFoundException, SQLException {
        super("bdcinema");
    }

    @Override
    public void create(Asiento ob) throws SQLException {
        ejecutar("INSERT INTO cliente VALUES("
                + "'" + ob.getFila() + "',"
                + "'" + ob.getNumero() + "',"
                + "'" + ob.isEstado() + "');");
    }

    @Override
    public List<Asiento> read() throws SQLException {
        List<Asiento> asiento = new ArrayList<>();
        ResultSet rs = ejecutar("SELECT * FROM asiento;");
        
        Asiento ast;
        
        while(rs.next()){
            ast = new Asiento();
            
            ast.setFila(1);
            ast.setNumero(2);
            ast.setEstado(true);
            
            asiento.add(ast);
        }
        return asiento;
    }

    @Override
    public void update(Asiento ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Asiento ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
