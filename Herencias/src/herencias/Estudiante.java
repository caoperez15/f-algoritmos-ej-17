/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import herencia_ejemplo.Asignatura;

/**
 *
 * @author reroes
 */
public class Estudiante extends Persona{
    private Asignatura [] asignaturas;

    public Estudiante(String n, String a, int e, Asignatura[]asig) {
        super(n, a, e);
        asignaturas = asig;
    }

    public Asignatura[] getAsignatura() {
        return asignaturas;
    }

    public void setAsignatura(Asignatura[] asig) {
        asignaturas = asig;
    }
    
    public double obtener_valor_matricula(){
    double valor =0;
    Asignatura[] arrayAsignaturas = getAsignatura();
        for (int i = 0; i < arrayAsignaturas.length; i++) {
            valor += arrayAsignaturas[i].getCosto();
            
        }
        
        
    return valor++;
    }
    
    public String imprimir_valor_matricula(){
    String cadena="";
    Asignatura[] arrayAsignatura =getAsignatura();
        for (int i = 0; i < arrayAsignatura.length; i++) {
            cadena += String.format("\nAsignatura Presencial:\n\tNombre: %s\n \tTipo: %s \n"
                    + " \tCosto: %.2f\n"
            ,arrayAsignatura[i].getNombre()
            ,arrayAsignatura[i].getTipo()
            ,arrayAsignatura[i].getCosto()
            );
            
        }
        
        
    
    return cadena;
    } 
    
    
    
    
    @Override
    public String toString(){
    
        return String.format("%s\n Costo: %.2f\nLista de asignaturas: %s "
                
        
        ,super.toString()
        ,obtener_valor_matricula()
        ,imprimir_valor_matricula()
        
        
       );
    }
    
    
    
}
