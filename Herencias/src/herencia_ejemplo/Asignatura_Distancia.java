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
public class Asignatura_Distancia extends Asignatura{
    private int numero_creditos;

    public Asignatura_Distancia(String n, String t, double co, int num_cre) {
        super(n, t, co);
        numero_creditos=num_cre;
    }

    public int getNumero_creditos() {
        return numero_creditos;
    }

    public void setNumero_creditos(int num_cre) {
        numero_creditos = num_cre;
    }
    
    @Override
    public String toString(){
        return String.format("%s \n Numero Creditos: %d",super.toString(),getNumero_creditos());
        
    }
    
}
