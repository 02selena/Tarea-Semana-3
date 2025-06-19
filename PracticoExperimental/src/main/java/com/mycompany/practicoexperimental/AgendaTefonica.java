
package com.mycompany.practicoexperimental;


public class AgendaTefonica {
    
     /*Registro: para represenatar cada contacto
        vector: almacenar los contactos de los registros. 
    */
     //Atributos
     public Contacto[] contatos;
     public int totalContantos;

     
     //constructor 
     
    public AgendaTefonica(int capacidad) {
        contatos= new Contacto[capacidad];
        totalContantos=0;
            
    }

    //Agregar Contantos 
    public boolean agregarContacto(String nombre, String telefono, String correo){
       if(totalContantos>=contatos.length){
           System.out.println("Ya no tienes espacio para mas contactos");
          return false;
       }else{
      contatos[totalContantos]=new Contacto(nombre, telefono, correo);
      totalContantos=totalContantos+1;
      return true;
       }
            
    }
   
    //mostar contactos 
    public void mostarContactos(){
        if (totalContantos==0){
            
            System.out.println("no tiene registro");
        }else{
            for(int i=0;i<totalContantos;i++){
            Contacto c=contatos[i];
            System.out.println("DATOS DEL CONTACTO"+(i+1));
            System.out.println("Nombre"+c.nombre());
            System.out.println("Telefono"+c.telefono());
            System.out.println("Correo"+c.correo());
            }
        }
    
    }
    
        
    //buscar mi contacto nombre 
    public Contacto buscarporNombre(String nombre){
    
    return null;
    }
     
     
}
