/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso1faridaraujo;
import javax.swing.JOptionPane;
/**
 *
 * @author Farid
 */
public class Caso1FaridAraujo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Declaración de variables
        String nombre;
        String nombreVendedor;

        double cedula;
        double cedulaVendedor;

        double codFactura;
        double montoFactura;
        double codVendedor;

        int numMes;

        String sucursalVendedor;
        String vehiculoVendedor;

        double prodElectricos;
        double prodAutomotrices;
        double prodConstruccion;

        int puntos = 0;
        double comisiones = 0;
        final double bonoExtra = 20000;

        
        // Solicitud de los datos requeridos al vendedor
        nombreVendedor = JOptionPane.showInputDialog("Bienvenido. Porfavor ingrese su nombre ");
        //Print
        JOptionPane.showMessageDialog(null, "Hola " + nombreVendedor + ". A continuación ingrese los datos que se le solicitan.");
        // Solicitud de los datos requeridos al vendedor
        cedulaVendedor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cedula: "));
        codVendedor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su codigo de vendedor: "));
        sucursalVendedor = JOptionPane.showInputDialog("Ingrese su sucursal de trabajo: ");
        vehiculoVendedor = JOptionPane.showInputDialog("¿Cuenta usted con vehiculo propio?");

        //Creamos el vendedor
        Vendedor vendedor = new Vendedor(nombreVendedor, cedulaVendedor, codVendedor, sucursalVendedor, vehiculoVendedor);

        //Print
        JOptionPane.showMessageDialog(null, nombreVendedor + ". A continuación ingrese los datos de la Factura que se le solicitan.");

        //Facturas por vendedor
        int totalFacturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de facturas que desea registrar: "));
        Facturas[] facturas = new Facturas[totalFacturas];

        double bonoCalculado = 0;
        int puntosSumados = 0;

        for (int i = 0; i < totalFacturas; i++) {

            nombre = JOptionPane.showInputDialog("Porfavor ingrese el nombre del cliente: ");
            // Solicitud los datos requeridos de la factura
            cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cedula del cliente: "));
            codFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la factura: "));
            montoFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de la factura: "));
            numMes = Integer.parseInt(JOptionPane.showInputDialog("Ahora, ingrese el numero del mes en el que se realizo la factura: (1 - 12)"));
            prodElectricos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos electricos compró el cliente?"));
            prodAutomotrices = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos automotrices compró el cliente?"));
            prodConstruccion = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos de construcción compró el cliente?"));

            // Creación de la factura
            String mes = calcularMes(numMes);
            Facturas factura = new Facturas(nombre, cedula, codFactura, montoFactura, mes, prodElectricos, prodAutomotrices, prodConstruccion);

            // Calculo de los puntos
            //Tres variedades
            if (factura.getProdElectricos() > 0 && factura.getProdAutomotrices() > 0 && factura.getProdConstruccion() > 0) {
                bonoCalculado = bonoCalculado + (montoFactura * 0.1);
                //Falta aclarar sobre facturas de 50000
                puntosSumados = puntosSumados + 3;
            }

            //Tres electricos
            if (factura.getProdElectricos() >= 3) {
                //4 porciento
                bonoCalculado = bonoCalculado + (montoFactura * 0.04);
                puntosSumados = puntosSumados + 1;
            } else {
                bonoCalculado = bonoCalculado + (montoFactura * 0.02);
            }

            //Cuatro automotrices
            if (factura.getProdAutomotrices() >= 4) {
                //4 porciento
                bonoCalculado = bonoCalculado + (montoFactura * 0.04);
                puntosSumados = puntosSumados + 1;
            } else {
                bonoCalculado = bonoCalculado + (montoFactura * 0.02);
            }

            //Construccion
            if (factura.getProdConstruccion() > 0) {
                bonoCalculado = bonoCalculado + (montoFactura * 0.04);
                puntosSumados = puntosSumados + 2;
            }

            //Mayor a 50,000, agrega 5% de impuesto
            if (montoFactura > 50000) {
                montoFactura = montoFactura + (montoFactura * 0.05);
            }

            // Guarda la factura
            facturas[i] = factura;

        }//for facturas

        //Registra facturas para el vendedor
        vendedor.setFacturas(facturas);

        //bono por venta de 10 facturas o 300.000 total
        if (vendedor.getTotalFacturas() > 10 || vendedor.getMontoFacturas() > 300000) {
            bonoCalculado = bonoCalculado + bonoExtra;
        }

        // Guardar datos calculados al vendedor
        vendedor.setBono(bonoCalculado);
        vendedor.setPuntos(puntosSumados);
        
        //print finales
        String datos = vendedor.imprimirDatos();
        JOptionPane.showMessageDialog(null, datos);

    }
        

    static String calcularMes(int numMes) {
        String meses[] = new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"};
        return meses[numMes - 1];
    }
}
