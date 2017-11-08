/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ejemplo;

/**
 *
 * @author Chris
 */
public class Asignatura {
    private String nombre;
    private String tipo;
    private double costo;

    public Asignatura(String n, String t, double co) {
    
        setNombre(n);
        setTipo(t);
        setCosto(co);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double co) {
        costo = co;
    }
    
    @Override
    public String toString(){
        return String.format("Nombre: %s \n\t\t\tTipo: %s \n\t\t\tCosto: $%.0f"
        ,getNombre()
        ,getTipo()
        ,getCosto()
        );
    }
}
