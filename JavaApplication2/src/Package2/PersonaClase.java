package Package2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laoratorio
 */
public class PersonaClase {
    private 
        String Nombre;
        int Edad;
        char Sexo;

    public PersonaClase(String Nombre, int Edad, char Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    @Override
    public String toString() {
        return "Nombre: "+ Nombre + "\nEdad: "+ Edad+ "\nSexo: "+Sexo; 
    }

    public PersonaClase() {
    }
    

}
