
package com.mycompany.registro;


public class ListaVehiculos {
     Nodo primerElemento;

    public void agregar(Vehiculo vehiculo) {
        Nodo nuevo = new Nodo(vehiculo);
        if (primerElemento == null) {
            primerElemento = nuevo;
        } else {
            Nodo actual = primerElemento;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void mostrar() {
        Nodo actual = primerElemento;
        while (actual != null) {
            System.out.println(actual.vehiculo);
            actual = actual.siguiente;
        }
    }

    public void buscarPorPlaca(String placa) {
        Nodo actual = primerElemento;
        boolean encontrado = false;
        while (actual != null) {
            if (actual.vehiculo.placa.equalsIgnoreCase(placa)) {
                System.out.println("Encontrado: " + actual.vehiculo);
                encontrado = true;
                break;
            }
            actual = actual.siguiente;
        }
        if (!encontrado) {
            System.out.println("No se encontró vehículo con placa " + placa);
        }
    }

    public void verPoryear(int year) {
        Nodo actual = primerElemento;
        boolean encontrado = false;
        while (actual != null) {
           if (actual.vehiculo.year == year) {

                System.out.println(actual.vehiculo);
                encontrado = true;
            }
            actual = actual.siguiente;
        }
        if (!encontrado) {
            System.out.println("No hay vehículos del año " + year);
        }
    }

    public void eliminar(String placa) {
        Nodo actual = primerElemento;
        Nodo anterior = null;

        while (actual != null) {
            if (actual.vehiculo.placa.equalsIgnoreCase(placa)) {
                if (anterior == null) {
                    primerElemento = actual.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }
                System.out.println("Vehículo eliminado.");
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
        }

        System.out.println("No se encontró vehículo con placa " + placa);
    }
}