/*
 *Esta clase se implementa para imprimir el cuadre de caja diario y el 
 * historial de facturacion.
 */
package administracion;
import personas.Persona;

/**
 *
 * @author Pedro Ernesto Alfaro Laínez
 * @since 15/04/22
 */
public class Administracion extends Persona {
    // Constructor de la clase Administrasion 
    public  Administracion ()
    {
    }
    
    /**
     * Este metodo se encarga de realizar el cuadra de caja diario
     */
    private void cuadreDiario()
    {
    }
    
    /**
     * Este metodo se encargara de genarar el historial de ventas
     */
    private void genHistoFacturacion()
    {
    }
    
    // Este metodo se utiliza para evaluar si una entrada es numerica 
    public boolean isNumeric(String Cadena)
    {
        try {
            Integer.parseInt(Cadena);
            return true;
        
        }catch(NumberFormatException Error)
        {
            return false;
        }
    
    }
    
}
