
package personas;

/**
 *
 * @author Pedro Ernesto Alfaro Laínez
 */

/*
  clase vendedor
*/
public class Vendedor extends Persona {
    
    // Declaracion de los campos de la clase
    private String idVendedor;
    private String tipoPago;

    
    public Vendedor()
    {}
    

    public Vendedor( String idVendedor, String nombre, String direccion )
    {

      this.idVendedor=idVendedor;
      this.nombre=nombre;
      this.direccion=direccion;
    
    }

    
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


    

    
}
