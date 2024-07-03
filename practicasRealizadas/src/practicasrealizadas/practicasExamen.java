/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicasrealizadas;

import java.util.Scanner;

/**
 *
 * @author Farid
 */
public class practicasExamen {
        public static void main(String[] args) {

        vehiculo[] carros = new vehiculo[3];;

        for (int i = 0; i < carros.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el combustible del vehiculo: (GASOLINA, DIESEL, ELECTRICO)");
            String combustible = sc.nextLine();
            carros[i] = new vehiculo(combustible);
            System.out.println("Vehiculo "+ (i+1) + " creado.");
        }

        System.out.println("===================================");
        System.out.println("Datos de los vehiculos:");
        System.out.println("===================================");
        for (int i = 0; i < carros.length; i++) {
            carros[i].vehiculoToString();
        }


    }
}
    
