
package com.mycompany.tareasemna3;

public class Tareasemna3 {

    public static void main(String[] args) {
    
        /*Elabore un documento PDF que contenga la definición de las clases,
        arrays y/o matrices necesarias en C# o Java para manejar el registro de
        un estudiante que posea los siguientes datos (id, nombres, apellidos,
        dirección y tres teléfonos ). */
        
        String [] telefonos ={"0997234561", "0986389912", "0954673738"};
       
        // Crear objeto Estudiante con sus datos
     Estudiante estudiante = new Estudiante(1, "Selena Brigith", "Mora Cardenas", "Duvino", telefonos); 
     
     //estudiants.mostrarDatos();
      estudiante.mostrarDatos();
    }
}
