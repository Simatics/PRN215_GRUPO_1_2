package conexionMySQL;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Ernesto Alfaro Laínez
 * @since 15/04/22
 */

/*
  Esta clase se implenta para realizar la conexion con la base de datos en Mysql
*/
public class ConexionMySQL {
    
    Connection conectar = null;
    private final String ruta ="jdbc:mysql://localhost/prn215_grupo_1_2";
    private final String usuarioC= "root";
    private final String passwordC= "root";
    
    
    /**
     * Este metodo se implenta para crear el acceso del programa hacia la base de datos en MySQL
     * @return conexion entre el programa y la base de datos
     */
    public Connection conexion()
    {
        try{
           Class.forName("com.mysql.jbdc.Driver");
           conectar = (Connection) DriverManager.getConnection(ruta, usuarioC, passwordC);
            
        }catch(ClassNotFoundException | SQLException error)
        {
            JOptionPane.showMessageDialog(null, "Error de conexion con la base de datos" + error.getMessage());
            
        }
            
             
          return conectar;
           
    
    }
}
