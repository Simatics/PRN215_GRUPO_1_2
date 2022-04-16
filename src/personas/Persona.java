
package personas;

/**
 *
 * @author Pedro Ernesto alfaro Laínez
 */


/**
 * Esta clase se utiliza para resumir los campos de clase que tiene en comun con la clase 
 * administrador y con la clase vendedor
 */
public class Persona {
   
    
    public Persona()
    {
    }
    private int dui;
    private String nombre;
    private char Correo;
    private int telefono;


    public int getDui() {
        return dui;
    }

    public void setDui(int dui) {
        this.dui = dui;
    }


    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public char getCorreo() {
        return Correo;
    }

    public void setCorreo(char Correo) {
        this.Correo = Correo;
    }


    public int getTelefono() {
        return telefono;
    }


    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
}
