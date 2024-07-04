/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1faridaraujo;

/**
 *
 * @author Farid
 */
public class Facturas {
    private final String nombre;
    private final double cedula;
    private final double codFactura;
    private final double montoFactura;
    private final String mes;
    private final double prodElectricos;
    private final double prodAutomotrices;
    private final double prodConstruccion;

    Facturas(String nombre, double cedula, double codFactura, double montoFactura, String mes, double prodElectricos, double prodAutomotrices, double prodConstruccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codFactura = codFactura;
        this.montoFactura = montoFactura;
        this.mes = mes;
        this.prodElectricos = prodElectricos;
        this.prodAutomotrices = prodAutomotrices;
        this.prodConstruccion = prodConstruccion;
    }

    public double getProdElectricos() {
        return prodElectricos;
    }

    public double getProdAutomotrices() {
        return prodAutomotrices;
    }

    public double getProdConstruccion() {
        return prodConstruccion;
    }

    public double getMontoFactura() {
        return this.montoFactura;
    }

}
