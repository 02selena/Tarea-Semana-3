
package com.mycompany.registro;


public class Nodo {
    //Atributos
    Vehiculo vehiculo;
    Nodo siguiente;
    
    
    //constructor

    public Nodo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.siguiente = null;
    }
    
}
