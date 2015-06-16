package javaapplication2;


import javaapplication2.PersonaClase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laoratorio
 */
public class Profesor extends PersonaClase{
    private
            String Profesion;
            int Años_de_Experiencia;

    public Profesor(String Profesion, int Años_de_Experiencia, String Nombre, int Edad, char Sexo) {
        super(Nombre, Edad, Sexo);
        this.Profesion = Profesion;
        this.Años_de_Experiencia = Años_de_Experiencia;
    }

            
            

            
            
            
    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public int getAños_de_Experiencia() {
        return Años_de_Experiencia;
    }

    public void setAños_de_Experiencia(int Años_de_Experiencia) {
        this.Años_de_Experiencia = Años_de_Experiencia;
    }




     @Override
    public String toString() {
        return super.toString()+"\nProfesion: "+ Profesion
                + "\nAños de Experiencia: "+Años_de_Experiencia; 
    }



}
