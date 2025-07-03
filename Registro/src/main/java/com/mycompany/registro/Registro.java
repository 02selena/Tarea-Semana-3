
package com.mycompany.registro;


public class Registro {

    public static void main(String[] args) {
        ListaVehiculos lista = new ListaVehiculos();
        
        //agrgar Vehiculos
         
        lista.agregar(new Vehiculo("PBC7863", "Toyota", "Land Cruiser", 2010, 24000));
        lista.agregar(new Vehiculo("ABC123", "Toyota", "Corolla", 2020, 15000));
        lista.agregar(new Vehiculo("XYZ789", "Honda", "Civic", 2021, 18000));
        lista.agregar(new Vehiculo("LMN456", "Ford", "Focus", 2020, 16000));
        
        // mostrar todo
        lista.mostrar();
        
        //Buscar por placa
        System.out.println("\n\nBuscar por placa XYZ789:");
        lista.buscarPorPlaca("XYZ789");
        
        
        // ver por año
         System.out.println("\n\nVehiculos del año 2020:");
        lista.verPoryear(2020);
        
        //Eliminar vehicuolo
         System.out.println("\n\nEliminar Vehiculo LMN456:");
        lista.eliminar("LMN456");
        
        
        //mostar todo
        System.out.println("\n\nLista actualizada:");
        lista.mostrar();
    }
    
}
