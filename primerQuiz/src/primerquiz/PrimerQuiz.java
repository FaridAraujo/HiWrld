/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerquiz;

import javax.swing.JOptionPane;

/**
 *
 * @author Farid
 */
public class PrimerQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Declaracion de Variables
        String lectura;
        double totalEF = 0;
        double totalIVM = 0;
        double totalSalario = 0;

        int cantidadEmpleados = 0;
        int salario = 0;

        // Solicitud de datos del empleado
        lectura = JOptionPane.showInputDialog("Ingrese la cantidad de empleados: ");
        cantidadEmpleados = Integer.parseInt(lectura);

        for (int i = 1; i <= cantidadEmpleados; i++) {

            // Solicitud de salarios
            salario = Integer.parseInt(JOptionPane.showInputDialog("Indique el salario del empleado: " + i));

            // Calcular montos de seguros
            double seguroEF = salario*0.0925;
           double seguroIVM = salario*0.0508;

         // Declaracion de montos individual.
         JOptionPane.showMessageDialog(null, "El salario del empleado " + i + " es: " + salario
                    + "\nEl total por Seguro de Enfermedad y Maternidad a pagar por el empleado es: " + seguroEF
                    + "\nEl monto a pagar por el seguro de Invalidez, Vejez y Muerte es:" + seguroIVM);

            // Suma total de los montos 
            totalEF += seguroEF;
            totalIVM += seguroIVM;
            totalSalario += salario;

        }
        //Print
        JOptionPane.showMessageDialog(null, "La empresa debe pagar un total de: " + (totalEF + totalIVM) + " por concepto SEM e IVM");

    }
}
