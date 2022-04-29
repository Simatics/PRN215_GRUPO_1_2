
package personas;

/**
 *
 * @author Pedro Ernesto Alfaro Laínez
 */
public class Cliente extends Persona {
    
    public Cliente()
    { }
    
    public Cliente(String nombre)
    {
      this.nombre=nombre;
    }
    
    public Cliente(int dui, String nombre)
    {
        this.dui=dui;
        this.nombre=nombre;
    
    }
   
    
    
    
}
