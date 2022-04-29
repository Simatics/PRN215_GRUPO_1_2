
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
    protected int dui;
    protected String nombre;
    protected String direccion;


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

    
    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
