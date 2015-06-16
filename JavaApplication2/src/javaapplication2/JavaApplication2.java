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

//    PersonaClase per1 = new PersonaClase("jose", 22, 'm');
//    Estudiante e1 = new Estudiante("23312311","Ing. Informatica",per1.getNombre(),per1.getEdad(),per1.getSexo());
//    Profesor pro1 = new Profesor("Ingeniero",14,per1.getNombre(),per1.getEdad(),per1.getSexo());
    
//        System.out.println("PERSONA \n"+per1);
//        System.out.println("ESTUDIANTE \n"+e1);
//        System.out.println("PROFESOR \n"+pro1);

          
        Universidad univ = new Universidad();
        Carrera carr = new Carrera();
        carr.setNombre("Ing. Informatica");
        univ.getCarreras().add(carr);
        
        
        Profesor prof = new Profesor("Ingeniero", 14, "Rafael", 37, 'M');
      
        Materia materia=new Materia();
        materia.setNombre("Programacion");
        for (int i = 0; i < 10; i++) {
            Seccion seccion = new Seccion();
            seccion.setNumeroSeccion(i+1);
            seccion.setProfesorAsignado(prof);
            for (int j = 0; j < 10; j++) {
                Estudiante e = new Estudiante("123",carr.getNombre(),
                "estudiante"+j,20,'m');
                
                seccion.getEstudiantes().add(e);
                
            }
        materia.getSecciones().add(seccion);
        }
        
    
        Pensum pensum=new Pensum();
        pensum.getMaterias().add(materia);
        carr.setPensum(pensum);
        
        
    }
    
}
