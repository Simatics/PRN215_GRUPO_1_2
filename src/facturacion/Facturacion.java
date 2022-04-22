
package facturacion;
import java.util.Arrays;

/**
 *
 * @author Pedro Ernesto ALfaro laínez
 */
public class Facturacion {
    
    public Facturacion()
    {}
    
    private int idFactura;
    private double totalPlatillos;
    private double totalBebida;
    private double totalPostres;
    private double totalCompra;
    
    private double totalPlatillos(String platillos[])
    {
        return getTotalPlatillos();
    }
    
    private double  totalVevidas(String bebidas[])
    {
     return getTotalBebida();
    }


    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

 
    public double getTotalPlatillos() {
        return totalPlatillos;
    }

    public void setTotalPlatillos(double totalPlatillos) {
        this.totalPlatillos = totalPlatillos;
    }


    public double getTotalBebida() {
        return totalBebida;
    }


    public void setTotalBebida(double totalBebida) {
        this.totalBebida = totalBebida;
    }


    public double getTotalPostres() {
        return totalPostres;
    }



    public void setTotalPostres(double totalPostres) {
        this.totalPostres = totalPostres;
    }


    public double getTotalCompra() {
        return totalCompra;
    }


    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }
    
}
