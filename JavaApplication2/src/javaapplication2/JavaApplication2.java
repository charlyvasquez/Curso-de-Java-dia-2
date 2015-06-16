/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author laoratorio
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    PersonaClase per1 = new PersonaClase("jose", 22, 'm');
    Estudiante e1 = new Estudiante("23312311","Ing. Informatica",per1.getNombre(),per1.getEdad(),per1.getSexo());
    Profesor pro1 = new Profesor("Ingeniero",14,per1.getNombre(),per1.getEdad(),per1.getSexo());
    
    
    
    
    }
    
}
