/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicasrealizadas;

/**
 *
 * @author Farid
 */
public class PracticasRealizadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//------------------------------------------------------------------------------------------------------CLASE-1------------------------------------------------------------------------------------------------------//
        
//                                                                                                     PROBLEMA 1                                                                                                    //
/*
       // Definir la edad actual del usuario
        int edadActual = 25; // Puedes cambiar esto por el valor que desees

       // Calcular la edad en 5 años
        int edadFutura = edadActual + 5;

       // Mostrar el resultado
        System.out.println("Dentro de 5 años, tendrá: " + edadFutura + " años");
*/
        
      

/*                                                                                                     PROBLEMA 2                                                                                                    // 
       // Definir el ingreso mensual y el gasto en alimentación del usuario
        double ingresoMensual = 3000;
        double gastoAlimentacion = 750;

       // Calcular el porcentaje de gastos en alimentación y el porcentaje disponible para otros gastos
        double porcentajeAlimentacion = (gastoAlimentacion / ingresoMensual) * 100;
        double porcentajeOtrosGastos = 100 - porcentajeAlimentacion;

       // Mostrar los resultados
        System.out.printf("Porcentaje de gastos en alimentación: %.2f%%\n", porcentajeAlimentacion);
        System.out.printf("Porcentaje disponible para otros gastos: %.2f%%\n", porcentajeOtrosGastos);
*/
        
//                                                                                                     PROBLEMA 3                                                                                                    //
  //                                                                                                   extraClase                                                                                                    //
//                                                                                                     PROBLEMA 1                                                                                                    //
/*       
       // Definir el nombre del trabajador y su salario semanal
        String nombre = "Juan";
        double salarioSemanal = 500;

       // Calcular el salario mensual (4 semanas), las deducciones y el salario neto
        double salarioMensual = salarioSemanal * 4;
        double deducciones = salarioMensual * 0.0934;
        double salarioNeto = salarioMensual - deducciones;

       // Mostrar los resultados
        System.out.println("Estimado " + nombre + ", el salario de este mes se desglosa de la siguiente manera:");
        System.out.printf("Salario bruto: %.2f\n", salarioMensual);
        System.out.printf("Deducciones: %.2f\n", deducciones);
        System.out.printf("Salario Neto: %.2f\n", salarioNeto);
*/
//------------------------------------------------------------------------------------------------------CLASE-2------------------------------------------------------------------------------------------------------//

//                                                                                                     PROBLEMA 1                                                                                                    //
       /* int numeroDia = 3;  // Ejemplo: ingresamos el número 3, que representa Martes

       // Validar que el número esté en el rango correcto (1-7)
        if (numeroDia < 1 || numeroDia > 7) {
            System.out.println("Número de día inválido. Debe ser entre 1 y 7.");
        } else {
            // Determinar el nombre del día
            String nombreDia = "";
            switch (numeroDia) {
                case 1:
                    nombreDia = "Domingo";
                    break;
                case 2:
                    nombreDia = "Lunes";
                    break;
                case 3:
                    nombreDia = "Martes";
                    break;
                case 4:
                    nombreDia = "Miércoles";
                    break;
                case 5:
                    nombreDia = "Jueves";
                    break;
                case 6:
                    nombreDia = "Viernes";
                    break;
                case 7:
                    nombreDia = "Sábado";
                    break;
                default:
                    break;
            }

            // Mostrar el nombre del día
            System.out.println("El día correspondiente al número " + numeroDia + " es: " + nombreDia);
*/
        
      
/*                                                                                                     PROBLEMA 2                                                                                                    // 
       int numeroDia = 6;  // Ejemplo: ingresamos el número 6, que representa Viernes

        // Validar que el número esté en el rango correcto (1-7)
        if (numeroDia < 1 || numeroDia > 7) {
            System.out.println("Número de día inválido. Debe ser entre 1 y 7.");
        } else {
            // Determinar si el día es laborable o libre
            String tipoDia = "";
            if (numeroDia >= 1 && numeroDia <= 5) {
                tipoDia = "Laborable";
            } else {
                tipoDia = "Libre";
            }

            // Mostrar el tipo de día
            System.out.println("El día correspondiente al número " + numeroDia + " es: " + tipoDia);
*/
        
//                                                                                                     PROBLEMA 3                                                                                                    //
/*       
       int num1 = 12;
        int num2 = 8;
        int num3 = 15;
        int num4 = 10;

        // Encontrar el mayor de los cuatro números
        int mayor = num1; // Suponemos inicialmente que num1 es el mayor

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        if (num4 > mayor) {
            mayor = num4;
        }

        // Mostrar el número mayor
        System.out.println("El número mayor entre " + num1 + ", " + num2 + ", " + num3 + " y " + num4 + " es: " + mayor);
*/
//                                                                                                     PROBLEMA 4                                                                                                    //
  //                                                                                                   extraClase                                                                                                    //
/*  
// Datos proporcionados por el usuario (ejemplo)
        int aniosAntiguedad = 12;  // Años de antigüedad
        int horasLaboradasPorSemana = 40;  // Horas laboradas por semana
        double precioPorHora = 15.5;  // Precio por hora

        // Calcular salario bruto
        double salarioBruto = horasLaboradasPorSemana * precioPorHora * 4.0;  // 4 semanas en un mes

        // Aplicar bonificación si tiene más de 10 años de antigüedad
        if (aniosAntiguedad > 10) {
            salarioBruto = salarioBruto * 1.2;  // Aumento del 20%
        }

        // Aplicar deducción según el salario bruto
        if (salarioBruto > 1000) {
            double deduccion = salarioBruto * 0.1;  // 10% de deducción
            if (salarioBruto > 2000) {
                deduccion = salarioBruto * 0.15;  // 15% de deducción adicional si supera los $2000
            }
            salarioBruto -= deduccion;
        }

        // Mostrar salario neto final
        System.out.printf("El salario neto final es: $%.2f\n", salarioBruto);
*/
//------------------------------------------------------------------------------------------------------Clase-3------------------------------------------------------------------------------------------------------//
        
//                                                                                                     PROBLEMA 1                                                                                                    //
/*
       // Imprimir un rectángulo de 10 símbolos en 5 líneas
        for (int i = 0; i < 5; i++) {
            System.out.println("@@@@@@@@@@");
        }
*/
        
        
//                                                                                                     PROBLEMA 2                                                                                                    //
/*
       // Mostrar la tabla de multiplicar de un número específico (en este caso, del número 7)
        int numero = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
*/

        
//                                                                                                     PROBLEMA 3                                                                                                    //
/*
       // Dibujar un triángulo con el número de filas especificado (en este caso, 5 filas)
        int filas = 5;
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/

        
//                                                                                                     PROBLEMA 4                                                                                                    //
/*
       // Mostrar los valores entre 20 y 30 y su cuadrado
        for (int i = 20; i <= 30; i++) {
            int cuadrado = i * i;
            System.out.println("Número: " + i + ", Cuadrado: " + cuadrado);
        }
*/

        
//                                                                                                     PROBLEMA 5                                                                                                    //
/*
       // Calcular estadísticas de notas de estudiantes predefinidas en un arreglo
        int[] notas = {75, 80, 65, 90, 70}; // Ejemplo: arreglo de notas predefinido

        int notaTotal = 0;
        int notaMayor = notas[0];
        int notaMenor = notas[0];
        int estudiantesAprobados = 0;

        for (int nota : notas) {
            notaTotal += nota;
            if (nota > notaMayor) {
                notaMayor = nota;
            }
            if (nota < notaMenor) {
                notaMenor = nota;
            }
            if (nota >= 70) {
                estudiantesAprobados++;
            }
        }

        double notaPromedio = (double) notaTotal / notas.length;

        System.out.println("Nota promedio: " + notaPromedio);
        System.out.println("Nota mayor: " + notaMayor);
        System.out.println("Nota menor: " + notaMenor);
        System.out.println("Estudiantes aprobados: " + estudiantesAprobados);
*/

        
//                                                                                                     PROBLEMA 6                                                                                                    //
/*
       // Calcular estadísticas de notas de estudiantes con detección de fin de ingreso
        int[] notas = {85, 60, 70, 95, 55}; // Ejemplo: arreglo de notas predefinido

        int notaTotal = 0;
        int notaMayor = notas[0];
        int notaMenor = notas[0];
        int estudiantesAprobados = 0;
        int cantidadEstudiantes = notas.length;

        for (int nota : notas) {
            notaTotal += nota;
            if (nota > notaMayor) {
                notaMayor = nota;
            }
            if (nota < notaMenor) {
                notaMenor = nota;
            }
            if (nota >= 70) {
                estudiantesAprobados++;
            }
        }

        double notaPromedio = (double) notaTotal / cantidadEstudiantes;

        System.out.println("Nota promedio: " + notaPromedio);
        System.out.println("Nota mayor: " + notaMayor);
        System.out.println("Nota menor: " + notaMenor);
        System.out.println("Estudiantes aprobados: " + estudiantesAprobados);
*/
//------------------------------------------------------------------------------------------------------Clase-4------------------------------------------------------------------------------------------------------//
//------------------------------------------------------------------------------------------------------Persona------------------------------------------------------------------------------------------------------//

/*                                                                                                     PROBLEMA 1                                                                                                    //
       
       // Definir la clase Persona con sus atributos
class Persona {
    private String nombre;
    private int edad;
    private String genero;

    // Constructor
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Método para saludar
    public void saludar() {
        System.out.println("¡Hola! Soy " + nombre);
    }

    // Método para incrementar la edad
    public void cumplirAnios() {
        edad++;
    }
}
*/

//------------------------------------------------------------------------------------------------------Libro------------------------------------------------------------------------------------------------------//

/*                                                                                                     PROBLEMA 2                                                                                                    //
       
       // Definir la clase Libro con sus atributos
class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    // Método para prestar el libro
    public void prestar() {
        System.out.println("El libro '" + titulo + "' ha sido prestado.");
    }

    // Método para devolver el libro
    public void devolver() {
        System.out.println("El libro '" + titulo + "' ha sido devuelto.");
    }
}
*/

//------------------------------------------------------------------------------------------------------Automovil------------------------------------------------------------------------------------------------------//

/*                                                                                                     PROBLEMA 3                                                                                                    //
       
       // Definir la clase Automovil con sus atributos
class Automovil {
    private String marca;
    private String modelo;
    private int anioFabricacion;

    // Constructor
    public Automovil(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    // Método para arrancar el automóvil
    public void arrancar() {
        System.out.println("El automóvil " + marca + " " + modelo + " ha arrancado.");
    }

    // Método para detener el automóvil
    public void detener() {
        System.out.println("El automóvil " + marca + " " + modelo + " se ha detenido.");
    }
}
*/

//------------------------------------------------------------------------------------------------------Producto------------------------------------------------------------------------------------------------------//

/*                                                                                                     PROBLEMA 4                                                                                                    //
       
       // Definir la clase Producto con sus atributos
class Producto {
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método para mostrar la información del producto
    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock disponible: " + stock + " unidades");
    }

    // Método para vender una cantidad específica del producto
    public void vender(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Se han vendido " + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("No hay suficiente stock para realizar la venta.");
        }
    }
}
*/

/*
Diagrama de clases:

+----------------+     +----------------+     +----------------+     +----------------+
|    Persona     |     |     Libro      |     |   Automovil    |     |    Producto    |
+----------------+     +----------------+     +----------------+     +----------------+
| - nombre       |     | - titulo       |     | - marca        |     | - nombre       |
| - edad         |     | - autor        |     | - modelo       |     | - precio       |
| - genero       |     | - anioPublicac.|     | - anioFabricac.|     | - stock        |
+----------------+     +----------------+     +----------------+     +----------------+
| + saludar()    |     | + prestar()    |     | + arrancar()   |     | + mostrarInfo()|
| + cumplirAnios()|     | + devolver()   |     | + detener()    |     | + vender()     |
+----------------+     +----------------+     +----------------+     +----------------+
*/

//------------------------------------------------------------------------------------------------------Clase-6------------------------------------------------------------------------------------------------------//
//------------------------------------------------------------------------------------------------------Clase Usuario------------------------------------------------------------------------------------------------------//

/*                                                                                                     PROBLEMA 1                                                                                                    //
       
       // Definir la clase Usuario con sus atributos
class Usuario {
    private String username;
    private String password;
    private String email;
    private Rol rol;

    // Enumeración para los roles
    public enum Rol {
        ADMINISTRADOR,
        ASISTENTE,
        CAJERO,
        SUPERVISOR
    }

    // Constructor 1: Recibe una contraseña y la valida
    public Usuario(String username, String password, String email, Rol rol) {
        this.username = username;
        this.email = email;
        this.rol = rol;
        setPassword(password); // Llama al método setPassword para validar y establecer la contraseña
    }

    // Constructor 2: Genera una contraseña aleatoria
    public Usuario(String username, String email, Rol rol) {
        this.username = username;
        this.email = email;
        this.rol = rol;
        generarPasswordAleatoria(); // Llama al método para generar una contraseña aleatoria
    }

    // Encapsulador para obtener la contraseña (devuelve asteriscos)
    public String getPassword() {
        return "*".repeat(password.length());
    }

    // Encapsulador para establecer la contraseña (validación)
    public void setPassword(String password) {
        // Validación de longitud mínima
        if (password.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return;
        }

        // Validación de caracteres consecutivos iguales
        for (int i = 0; i < password.length() - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) {
                System.out.println("La contraseña no puede contener caracteres consecutivos iguales.");
                return;
            }
        }

        // Si pasa las validaciones, establecer la nueva contraseña
        this.password = password;
        System.out.println("Contraseña actualizada correctamente.");
    }

    // Método para generar una contraseña aleatoria
    private void generarPasswordAleatoria() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        
        // Generar una contraseña de al menos 10 caracteres
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }
        
        // Establecer la contraseña generada aleatoriamente
        this.password = sb.toString();
        System.out.println("Contraseña generada aleatoriamente: " + this.password);
    }

    // Encapsuladores para el atributo rol
    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    // Otros métodos de la clase Usuario
}
*/
    }
}

    





