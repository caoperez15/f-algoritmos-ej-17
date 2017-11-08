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
public class Estudiante extends Persona {

    private Asignatura[] asignaturas;

    public Estudiante(String n, String a, int e, Asignatura[] asig) {
        super(n, a, e);
        asignaturas = asig;
    }

    public Asignatura[] getAsignatura() {
        return asignaturas;
    }

    public void setAsignatura(Asignatura[] asig) {
        asignaturas = asig;
    }

    public double obtener_valor_matricula() {
        double valor = 0;
        Asignatura[] arrayAsignaturas = getAsignatura();
        for (int i = 0; i < arrayAsignaturas.length; i++) {
            valor += arrayAsignaturas[i].getCosto();

        }

        return valor++;
    }

    public String obtener_lista_asignatura() {
        String cadena = "";
        Asignatura[] arrayAsignatura = getAsignatura();
        for (int i = 0; i < arrayAsignatura.length; i++) {
            cadena += String.format("\nAsignatura prensencial: %s\n",
                    arrayAsignatura[i].toString()
            );

        }

        return cadena;
    }

    @Override
    public String toString() {

        return String.format("%s\nCosto Matricula: $%.0f\nLista de Asignaturas: %s ",
                super.toString(),
                obtener_valor_matricula(),
                obtener_lista_asignatura()
        );
    }

}
