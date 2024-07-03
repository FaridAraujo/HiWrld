/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicasrealizadas;

import java.util.Random;

/**
 *
 * @author Farid
 */
public class vehiculo {
    
    private String VIN;
    private int placa;
    private Combustible combustible;
    private float consumo;

    vehiculo(String combustible){
        this.VIN = generateRandomAlphanumericString(); // 12 caracteres
        this.placa = (int) (Math.random() * 1000000); // 6 digitos
        this.combustible = Combustible.valueOf(combustible); // enum
        this.consumo = 9.5F; // float
    }

    public String getVIN() {
        return VIN;
    }

    public int getPlaca() {
        return placa;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = Combustible.valueOf(combustible);
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        Random random = new Random();
        this.consumo = 9 + random.nextFloat() * (14 - 9);;
    }

    public String estatusConsumo() {
        if (this.consumo < 10) {
            return "Bajo";
        } else if (this.consumo >= 10 && this.consumo <= 12) {
            return "Medio";
        } else {
            return "Alto";
        }
    }

    public String getRestriccion() {

        String restriccion = "";

        if (this.combustible == Combustible.ELECTRICO) {
            return "No tiene restricciones";
        } else {
            int ultimoDigito = placa % 10;

            if (ultimoDigito == 1 || ultimoDigito == 2) {
                restriccion = "No puede circular los Lunes";
            }
            if (ultimoDigito == 3 || ultimoDigito == 4) {
                restriccion = "No puede circular los Martes";
            }
            if (ultimoDigito == 5 || ultimoDigito == 6) {
                restriccion = "No puede circular los Miercoles";
            }
            if (ultimoDigito == 7 || ultimoDigito == 8) {
                restriccion = "No puede circular los Jueves";
            }
            if (ultimoDigito == 9 || ultimoDigito == 0) {
                restriccion = "No puede circular los Viernes";
            }
            if (placa % 2 == 0) {
                return restriccion + " y taompoc los Sábados";
            }
            return restriccion + " y tampoco los Domingos";
        }
    }

    public String vehiculoToString(){
        return "VIN: " + this.VIN +
            "\nPlaca: " + this.placa +
            "\nCombustible: " + this.combustible.getCombustible() +
            "\nConsumo: " + this.consumo;
    }

    private String generateRandomAlphanumericString() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(12);
        for (int i = 0; i < 12; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            if ((randomLimitedInt <= 57 || randomLimitedInt >= 65) && (randomLimitedInt <= 90 || randomLimitedInt >= 97))
                buffer.append((char) randomLimitedInt);
            else
                i--;
        }
        return buffer.toString();
    }
}
    
    

