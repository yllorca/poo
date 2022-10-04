package POO;
import java.sql.*;

/**
 *
 * @author yllorca
 */
public class Conexion {
    
    Connection conectar = null;

    public Connection conectar(){
        try {

            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:efe.db");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        } 
        
        return conectar;
    }
    
}
