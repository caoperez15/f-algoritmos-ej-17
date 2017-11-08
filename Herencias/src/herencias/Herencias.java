/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

import herencia_ejemplo.Asignatura;
import herencia_ejemplo.Asignatura_Presencial;

/**
 *
 * @author reroes
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Asignatura_Presencial asig1 = new Asignatura_Presencial("Programacion", "Comun", 100, 180);

        Asignatura_Presencial asig2 = new Asignatura_Presencial("Literatura", "Troncal", 300, 200);

        Asignatura[] asignatura = new Asignatura[2];
        asignatura[0] = asig1;
        asignatura[1] = asig2;

        Estudiante e = new Estudiante("Rene", "Elizalde", 34, asignatura);
        System.out.println(e);

    }

}
