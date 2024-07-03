/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicepreporta;

import javax.swing.JOptionPane;

/**
 *
 * @author Farid
 */
public class PracticePrePorta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /** Elabore un programa que calcule cuántos años tendrá el
usuario en 5 años, al finalizar se imprime el siguiente mensaje
“Dentro de 5 años, tendrá: “ y se muestre el valor de la edad
proyectada. Debe solicitar como dato de entrada la edad actual.
        **/
        
        
        String nombre = " ";
        nombre = JOptionPane.showInputDialog("Digite su nombre: ");
        
        String lectura; 
        int edad;
        int edadAños;
        lectura = JOptionPane.showInputDialog("Digite su edad: "); 
        edad = Integer.parseInt(lectura);
        
        edadAños = edad+5;
        String mensaje = "Bienvenido" + nombre + ", y dentro de 5 años tendrá: " + edadAños + " años.";
        JOptionPane.showMessageDialog(null, mensaje);
       
        
        
        /** Desarrolle un programa que calcule el porcentaje de gastos por
concepto de alimentación y el porcentaje que queda disponible
para otros gastos. Debe proporcionar como datos de entrada el
monto de ingreso mensual y el gasto mensual por alimentación.
*       **/
        
        
        /**
        String nombre = " ";
        nombre = JOptionPane.showInputDialog("Digite su nombre: ");
        
        String lectura; 
        double ingresoSemana;
        lectura = JOptionPane.showInputDialog("Bienvenido " + nombre + ". Favor ingrese sus ingresos semanales: "); 
        ingresoSemana = Integer.parseInt(lectura);
        
        String lecturaDos; 
        double gastoSemanales;
        lecturaDos = JOptionPane.showInputDialog(nombre + ".De igual manera ingrese sus gastos por alimentación semanales: "); 
        gastoSemanales = Integer.parseInt(lecturaDos);
        
        double porcentajeAlimentacion = ((double) gastoSemanales / ingresoSemana) * 100;
        
        double porcentajeOtrosGastos = 100 - porcentajeAlimentacion;
        
        String mensaje = String.format("Hola " + nombre + ", el porcentaje de ingresos que gastas en alimentación es de :" + porcentajeAlimentacion + " y el porcentaje disponible para otros gastos es de :" + porcentajeOtrosGastos);
        JOptionPane.showMessageDialog(null, mensaje);
        * 
        **/
        
       
    }
    
}
