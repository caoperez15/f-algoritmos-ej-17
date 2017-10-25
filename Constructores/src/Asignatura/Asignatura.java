/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignatura;

/**
 *
 * @author chris
 */
public class Asignatura {
    private String nombre;
    private int creditos;
    private Carrera carrera;

    public Asignatura(Carrera c) {
        carrera = c;
        nombre="Informatica";
        creditos=5;
    }
     

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String n) {
       nombre = n;
    }

    public int obtener_creditos() {
        return creditos;
    }

    public void establecer_creditos(int cre) {
        creditos = cre;
    }

    public Carrera obtener_carrera() {
        return carrera;
    }

    public void establecer_carrera(Carrera ca) {
        carrera = ca;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Asignatura \n"
        +"\tNombre: %s\n"
        +"\tCreditos: %d\n"
        +"\tCarrera: %s\n"
        +"\tModalidad: %s\n"        
        ,obtener_nombre()
        ,obtener_creditos()
        ,obtener_carrera().obtener_modalidad()        
        ,obtener_carrera().obtener_nombre()
        );
        return cadena;
    }
    
    
    
    
    
    
    
    
}
