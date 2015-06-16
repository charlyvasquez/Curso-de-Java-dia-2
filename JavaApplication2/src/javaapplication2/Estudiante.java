package javaapplication2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laoratorio
 */
public class Estudiante extends PersonaClase{
    private String FichaAcademica, Carrera;

    public Estudiante(String FichaAcademica, String Carrera, String Nombre, int Edad, char Sexo) {
        super(Nombre, Edad, Sexo);
        this.FichaAcademica = FichaAcademica;
        this.Carrera = Carrera;
    }

    
    public Estudiante(String FichaAcademica, String Carrera) {
    super();
    this.FichaAcademica = FichaAcademica;
    this.Carrera = Carrera;
    }

    
       
    public Estudiante() {
        super();
    }


    
    
    public String getFichaAcademica() {
        return FichaAcademica;
    }

    public void setFichaAcademica(String FichaAcademica) {
        this.FichaAcademica = FichaAcademica;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    
    
     @Override
    public String toString() {
        return super.toString()+"\nFicha Academica: "+ FichaAcademica
                + "\nCarrera: "+Carrera; 
    }
    
    
    
}
