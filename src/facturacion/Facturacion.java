
package facturacion;
import personas.*;
import Ventas.*;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Pedro Ernesto ALfaro laínez
 */
public class Facturacion {
    
    private int idFactura;
    private double iva;
    private Vendedor vendedor;
    private Cliente clienteNuevo;
    private Orden orden;
    
    
    

    
    public Facturacion()
    {}
    public Facturacion(int idFactura)
    {
        this.idFactura=idFactura;
    
    }

 
    public int getIdFactura() {
        return idFactura;
    }


    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }
    
    /**
     * Este metodo se encarga de hacer una factura y guardarla en un documento de texto
     * @param item
     * @param cantidad 
     */
    public void hacerFactura(String item[], int cantidad [], String nombreVendedor, String idVendedor, String nombreCliente)
    {
        //Esta variable sera utilizada para generar numeros para el idOrden
        int nOrden=10000000;
        //FormPago pago= new FormPago();
        orden=new Orden(nOrden,LocalTime.now(),LocalDate.now(),item,cantidad);
        vendedor = new Vendedor(idVendedor, nombreVendedor,nombreCliente);
        clienteNuevo = new Cliente(nombreCliente);
        
        
        
        
    }


    public Vendedor getVendedor() {
        return vendedor;
    }


    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }


    public Cliente getClienteNuevo() {
        return clienteNuevo;
    }


    public void setClienteNuevo(Cliente clienteNuevo) {
        this.clienteNuevo = clienteNuevo;
    }

    public Orden getOrden() {
        return orden;
    }


    public void setOrden(Orden orden) {
        this.orden = orden;
    }


    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    


    
}
