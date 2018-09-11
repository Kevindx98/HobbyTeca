package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class controllerBD {
    
    private Connection conexion;
    private Statement sentencia;      
    private final String nombre_bd = "HobbyTeca.accdb";
 
    public controllerBD() throws SQLException{
        try{
            this.conexion=DriverManager.getConnection("jdbc:ucanaccess://"+this.nombre_bd); 
        }catch (SQLException e){
             JOptionPane.showMessageDialog(null,"Error al realizar la conexion " + e);
        }
        try { 
            this.sentencia=this.conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        }catch (SQLException e) { 
            JOptionPane.showMessageDialog(null,"Error al crear el objeto sentencia " + e);
        }
    }
    
    public ResultSet EjecutarSentencia(String sql) throws SQLException{
        return this.sentencia.executeQuery(sql);
    }

    public int EjecutarOtro(String sql) throws SQLException {
        return this.sentencia.executeUpdate(sql);
    }
}
