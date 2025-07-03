
package com.mycompany.estudiante;


public class Estudiante {
    

     String cedula;
     String nombre;
     String apellido;
     String correo;
     double nota;

    public Estudiante(String cedula, String nombre, String apellido, String correo, double nota) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.nota = nota;
    }

    
    public String toString() {
        return "Cedula: " + cedula + ", Nombre: " + nombre + " " + apellido +
               ", Correo: " + correo + ", Nota: " + nota;
    }
}


   
        
     
    


