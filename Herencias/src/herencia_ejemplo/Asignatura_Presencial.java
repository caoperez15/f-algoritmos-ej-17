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
public class Asignatura_Presencial extends Asignatura{
    private int numero_horas;

    public Asignatura_Presencial(String n, String t, double co, int num_h) {
        super(n, t, co);
        numero_horas = num_h;
        
    }

    public int getNumero_horas() {
        return numero_horas;
    }

    public void setNumero_horas(int num_ho) {
        numero_horas = num_ho;
    }
    
    
    @Override
    public String toString(){
        return String.format("%s \n Numero Horas: %d",super.toString(),getNumero_horas());
        
    }
    
    
}
