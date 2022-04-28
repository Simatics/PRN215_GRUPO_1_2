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
    
    //Declaracion de los campos de clase
    final int cAdmin= 56565656;
    private String fecha;
    private String hora;
    // Es es dinero con el que inicia la caja para dar los cambios.
    private double saldoInicialCaja;
    private double salidaDeDinero;
    
    public  Administracion ()
    {
    }
    
    /**
     * Este metodo se encarga de realizar el cuadra de caja diario
     */
    private void cuadreDiario(double saldoInicialCaja, double salidaDeDinero )
    {
        // Declaracion de las variables del metodo 
        this.saldoInicialCaja=saldoInicialCaja;
        this.salidaDeDinero= salidaDeDinero;
        double ventasDiarias;
        double efectivoAlCierre;
        double pagoConTarjeta;
        
        // Esta ecuacion calculara el cuadre de caja diario
        
        //VentasDiarias = efectivoAlCierre + saldoInicialCaja + pagoConTarjeta - salidaDeDinero ;
    }
    
    /**
     * Este metodo se encargara de genarar el historial de ventas
     */
    private void genHistoFacturacion()
    {
    }
    
    private String Promociones(String valor)
    {
       
      return valor;
    }
    
    
    

    
}
