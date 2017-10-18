/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetes.Institucion;

/**
 *
 * @author chris_000
 */
public class Asignatura {
    
    private String nombre;
    private int creditos;
    
    public void establecer_nombre(String n){
        nombre = n;
    }
    
    public void establecrer_creditos(int n){
        creditos = n;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public int obtener_creditos(){
        return creditos;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s con número de crédito %d", 
                obtener_nombre(), obtener_creditos());
        return cadena;
    }
    
}
