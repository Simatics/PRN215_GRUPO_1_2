

package Ventas;
// Esta clase es para generar la fecha y hora 
import java.util.Date;

/**
 *
 * @author Pedro Ernesto Alfaro Lainez
 */
public class Orden {
    
    // Declaracion de los campos de clase
    private int idOrden;
    private String hora;
    private String fecha;
    private String [] combos;
    private int [] Cantidad;
    
    public Orden ()
    {}
    
    public Orden(int idOrden,String hora, String fecha)
    {
      this.idOrden=idOrden;
      this.fecha=fecha;
      this.hora=hora;
    }
    
    // Campos de clase encapsulados

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }


    public String getHora() {
        return hora;
    }


    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String[] getCombos() {
        return combos;
    }


    public void setCombos(String[] combos) {
        this.combos = combos;
    }


    public int[] getCantidad() {
        return Cantidad;
    }


    public void setCantidad(int[] Cantidad) {
        this.Cantidad = Cantidad;
    }
    

    
    
    
}
