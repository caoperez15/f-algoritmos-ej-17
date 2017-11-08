/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;


/**
 *
 * @author reroes
 */
public class Estudiante extends Persona{
    private double matricula;
    
    public Estudiante(String n, String a, int e, double mat){
        super(n, a, e);
        setMatricula(mat);
    }
    
    public void setMatricula(double mat){
        matricula = mat;
    }
    
    public double getMatricula(){
        return matricula;
    }
    
    /* @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(), getMatricula());
    }
    */
    
    @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(), getMatricula());
    }
}
