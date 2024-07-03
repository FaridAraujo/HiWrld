/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicasrealizadas;


/**
 *
 * @author Farid
 */
public enum Combustible {

    GASOLINA("GASOLINA"),
    DIESEL("DIESEL"),
    ELECTRICO("ELECTRICO");

    private String combustible;

    Combustible(String combustible) {
        this.combustible = combustible;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
}    
    
