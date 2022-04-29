

package Ventas;
import java.time.LocalDate;
import java.time.LocalTime;
// Esta clase es para generar la fecha y hora 


/**
 *
 * @author Pedro Ernesto Alfaro Lainez
 */
public class Orden {
    
    // Declaracion de los campos de clase
    private int idOrden;
    private LocalTime hora;
    private LocalDate fecha;
    private String [] combos;
    private int [] Cantidad;
    
    public Orden ()
    {}
    
    public Orden(int idOrden, LocalTime hora, LocalDate fecha, String [] combos, int [] cantidad)
    {
      
      
      this.idOrden=idOrden;
      this.fecha=fecha;
      this.hora=hora;
      this.combos=combos;
      this.Cantidad=cantidad;
    }
    
    
    // Campos de clase encapsulados

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }


    public LocalTime getHora() {
        return hora;
    }


    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    /**
     * @return the fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }


    public void setFecha(LocalDate fecha) {
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
