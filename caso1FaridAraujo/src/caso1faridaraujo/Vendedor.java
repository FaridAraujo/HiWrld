/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1faridaraujo;

/**
 *
 * @author Farid
 */
public class Vendedor {
    private String nombreVendedor;
    private double cedulaVendedor;
    private double codVendedor;
    private String sucursalVendedor;
    private String vehiculoVendedor;
    private int puntos = 0;
    private double bonos = 0;
    private int bonoExtra = 0;
            
    private Facturas[] facturas;

    Vendedor(String nombreVendedor, double cedulaVendedor,  double codVendedor, String sucursalVendedor, String vehiculoVendedor){
        this.nombreVendedor = nombreVendedor;
        this.cedulaVendedor = cedulaVendedor;
        this.codVendedor = codVendedor;
        this.sucursalVendedor = sucursalVendedor;
        this.vehiculoVendedor = vehiculoVendedor;
    }
    
    public void setFacturas(Facturas[] facturas){
        this.facturas = facturas;
    }
    
    public void setBono(double bono){
        this.bonos = bono;
    }
    
    public int getBonoExtra(){
        return this.bonoExtra;
    }
    
    public int getTotalFacturas(){
        return this.facturas.length;
    }
    
    public double getMontoFacturas(){
        double total = 0;
        for (int i = 0; i < this.facturas.length; i++){
            total = total + this.facturas[i].getMontoFactura();
        }
        return total;
    }
    
    public void setPuntos(int puntos){
        this.puntos = puntos;
    }
    
    public String imprimirDatos(){
        String printEnPantalla = "";
        printEnPantalla = printEnPantalla + ("El Agente Vendedor " + this.nombreVendedor + " Codigo: " + this.codVendedor) + "\n";
        printEnPantalla = printEnPantalla +("Vendio un total de " + this.getMontoFacturas() + " en Facturas" + "\n");
        printEnPantalla = printEnPantalla +("Obtuvo un total en comisiones de "+ this.bonos + "\n");
        if (bonoExtra != 0){
            printEnPantalla = printEnPantalla +("El agente vendedor SI logro el objetivo de llegar al BONO EXTRA" + "\n");
        }else{
            printEnPantalla = printEnPantalla +("El agente vendedor NO logro el objetivo de llegar al BONO EXTRA" + "\n");
        }
        
        printEnPantalla = printEnPantalla +("Puntos obtenidos por el vendedor "+ this.puntos + "\n");
        
        if (this.vehiculoVendedor == "si"){
            printEnPantalla = printEnPantalla +("El Agente Vendedor SI cuenta con vehiculo propio" + "\n");
        }
        else{
            printEnPantalla = printEnPantalla +("El Agente Vendedor NO cuenta con vehiculo propio" + "\n");
        }
        printEnPantalla = printEnPantalla +"Sucursal: "+this.sucursalVendedor;
        
        return printEnPantalla;
    }
    
}
