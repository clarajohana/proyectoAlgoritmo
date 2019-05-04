
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private final String user = "";
    private final String password = "";
    private final String url = "C:\\Users\\kadmi\\Desktop\\Banco 2.0\\Banco 2.0\\src\\xdatabase\\bankTadeo.accdb";
    private Connection con = null;
    
    public Connection getConexion()
    {
        
        try{
            con = (Connection) DriverManager.getConnection("jdbc:ucanaccess://"+this.url,this.user,this.password);
            
        } catch(SQLException e){
            System.err.println(e);
        } catch(Exception e) {
        	System.out.println("Algun error en algun sitio");
        }
      return con;  
    }

}
