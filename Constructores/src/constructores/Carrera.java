/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author chris
 */
public class Carrera {
    
    private String nombre;
    private String modalidad;

    public Carrera() {//Constructor vacio
        modalidad = "Distancia";
    }

    public Carrera(String md) {//constructor con un parametro
        modalidad = md;
    }
    
    

    public Carrera(String n, String md) {// constructor con 2 parametrtos
        nombre = n;
        modalidad = md;
    }

    public String obtner_nombre() {
        return nombre;
    }

    public void establecer_nombre(String n) {
        nombre = n;
    }

    public String obtener_modalidad() {
        return modalidad;
    }

    public void establecer_modalidad(String md) {
        modalidad = md;
    }
    
    
    
    
}
