

package com.mycompany.practicoexperimental;


public class PracticoExperimental {

    public static void main(String[] args) {
         /*
        AGENDA TELEFONICA
        Requeriminetos.
        vectores matrices, registros y estructuras:
        Registro: para represenatar cada contacto
        vector: almacenar los contactos de los registros. */
      
         //scanner
         
         AgendaTefonica agenda=new AgendaTefonica(4);
        
        String nombre="selena Mora";
        String telefono="09863888892";
        String correo="sb.morac.uea.edu.ec";
        
        String nombre1="Devanny Taco";
        String telefono1="0998786892";
        String correo1="Ds.suarez.uea.edu.ec";
        
        String nombreDOS="Maria Cardenas";
        String telefonoDOS="098300292";
        String correoDOS="ms.cardenas.uea.edu.ec";
        
        String nombreTRES="Rosa perez";
        String telefonoTRES="098675432";
        String correoTRES="rs.perez.uea.edu.ec";
        
        agenda.agregarContacto( nombre, telefono, correo);
        agenda.agregarContacto(nombre1, telefono1, correo1);
        agenda.agregarContacto(nombreDOS, telefonoDOS, correoDOS);
        agenda.agregarContacto(nombreTRES, telefonoTRES, correoTRES);
        agenda.mostarContactos();
    }
           
}
