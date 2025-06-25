
package com.mycompany.listas;


public class ListaSimple {
    Nodo primerElemento;
    
    public void agregar(int valor){
    
        Nodo nuevo=new Nodo(valor);
         if (primerElemento==null) {
             primerElemento=nuevo;  
         }else{
             Nodo actual=primerElemento;
             while(actual.siguiente!=null){
             actual=actual.siguiente;
            }
             actual.siguiente=nuevo;
        }
    }
    public void mostrar(){
        Nodo actual=primerElemento;
        while (actual!=null){
            System.out.print(actual.dato+",");
               actual=actual.siguiente;  
              
        }
        System.out.print("null");
    }
}
