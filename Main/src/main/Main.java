/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Farid
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion = new Cancion(1, "Titulo1", "Autor1", 241, 2001);
        Cancion cancion2 = new Cancion(2, "Titulo2", "Autor2", 242, 2002);
        Cancion cancion3 = new Cancion(3, "Titulo3", "Autor3", 243, 2003);
        Cancion cancion4 = new Cancion(4, "Titulo3", "Autor3", 244, 2004);
        Cancion cancion5 = new Cancion(5, "Titulo3", "Autor3", 245, 2005);

        System.out.println("Primer cancion sin cambios (titulo): " + cancion.getTitulo());
        cancion.setTitulo("Titulo1 cambiado");
        System.out.println("Primer cancion con cambios: " + cancion.getTitulo());

        System.out.println("Segunda cancion sin cambios (autor): " + cancion2.getAutor());
        cancion2.setAutor("Autor2 cambiado");
        System.out.println("Segunda cancion con cambios: " + cancion2.getAutor());

        System.out.println("Tercera cancion sin cambios (duracion): " + cancion3.getDuracion());
        cancion3.setDuracion(233);
        System.out.println("Tercera cancion con cambios: " + cancion3.getDuracion());

        System.out.println("Cuarta cancion sin cambios (anio): " + cancion4.getAño());
        cancion4.setAño(2444);
        System.out.println("Cuarta cancion con cambios: " + cancion4.getAño());

        System.out.println("Quinta cancion sin cambios (id): " + cancion5.getId());
        cancion5.setId(55);
        System.out.println("Quinta cancion con cambios: " + cancion5.getId());
    }
}