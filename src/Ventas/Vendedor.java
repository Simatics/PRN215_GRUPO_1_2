
package Ventas;

/**
 *
 * @author Pedro Ernesto ALfaro Lainez
 */
public class Vendedor {
    
    //Decalracion de los campos de clase
    private String idVendedor;
    private String tipoPago;
    
    
    
    public Vendedor()
    {}
    
    public Vendedor(String idVendedor, String tipoPago)
    {
        this.idVendedor=idVendedor;
        this.tipoPago= tipoPago;
        
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
    

   
    public void registroCliente(int dui, String nombre)
    {
     
    }

    
//    public double totalVentas()
//    {  
//        double efectivoAlCierre;
//        double [] buscarPago;
//        return efectivoAlCierre;
//    }
//    
    
}
