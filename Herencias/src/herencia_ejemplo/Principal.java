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
public class Principal {
    
    public static void main(String[] args) {
  Asignatura_Presencial asig1 = new Asignatura_Presencial("Programacion", "comun", 100, 180);
        System.out.println(asig1);
  Asignatura_Distancia asig2 = new Asignatura_Distancia("Literatura", "Troncal", 300, 6);
        System.out.println(asig2);
        
        
    }

  
  
    
    
    
    
}
