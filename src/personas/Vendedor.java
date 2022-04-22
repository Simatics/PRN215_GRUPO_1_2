
package personas;

/**
 *
 * @author Pedro Ernesto Alfaro Laínez
 */
public class Vendedor extends Persona {
    
    // Declaracion de los campos de la clase
    private String idVendedor;
    private String tipoPago;
    private int idVenta;
    
    public Vendedor()
    {}

    
    public String getIdVendedor() {
        return idVendedor;
    }


    public void setIdVendedor(String idVendedor) {
        this.idVendedor = idVendedor;
    }


    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
        
    public int getIdVenta() {
        return idVenta;
    }
    

    
}
