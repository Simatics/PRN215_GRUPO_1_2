
package administracion;

/**
 *
 * @author Pedro Ernesto Alfaro Laínez
 */


public class SignIn {
    
    public SignIn ()
    {}
    
    // Declaracion de las variables de la clase
    
    private String user;
    private String password;
    private final String codAdmin = "01840297";
    
     /**
      * Este metodo se implementa para hacer la funcionalidad de crear un nuevo usuario
      * @param usuario es una variable de tipo cadena de acaracteres
      * @param contraseña es una variable de tipo cadena de caracteres
      */
     public void nuevoUsuario(String usuario,String contraseña)
    {
        this.user = usuario;
        this.password = contraseña;
        
        
    }
     
     /**
      * Este metodo se implementa para hacer la funcionalidad de ingresar al sistema
      * @param usuario es una variable de tipo cadena de acaracteres
      * @param contraseña es una variable de tipo cadena de caracteres
      */
    public void Ingresar(String usuario,String contraseña)
    {
        
    }
    
     /**
      * Este metodo se implementa para hacer la funcionalidad de cambiar la contraseña esta actividad solo la 
      * podra realizar el gerente del restaurante
      * @param codigo es una variable tipo entero para capturar el codigo que solo tendra el gerente del restauratante
      */
     public void CContra(int codigo)
    {
        
    }
    

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getCodAdmin() {
        return codAdmin;
    }


 
    
    
}
