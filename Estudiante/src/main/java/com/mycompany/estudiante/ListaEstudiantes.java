
package com.mycompany.estudiante;

public class ListaEstudiantes {

Nodo primerElemento;

    public ListaEstudiantes() {
        primerElemento = null;
    }

    // Agregar al inicio (para estudiantes aprobados)
    public void agregarInicio(Estudiante e) {
        Nodo nuevo = new Nodo(e);
        nuevo.siguiente = primerElemento;
        primerElemento = nuevo;
    }

    // Agregar al final (para estudiantes reprobados)
    public void agregarFinal(Estudiante e) {
        Nodo nuevo = new Nodo(e);
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

    // Buscar estudiante por cédula
    public Estudiante buscar(String cedula) {
        Nodo actual = primerElemento;
        while (actual != null) {
            if (actual.estudiante.cedula.equals(cedula)) {
                return actual.estudiante;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    // Eliminar estudiante por cédula
    public boolean eliminar(String cedula) {
        if (primerElemento == null) return false;

        if (primerElemento.estudiante.cedula.equals(cedula)) {
            primerElemento = primerElemento.siguiente;
            return true;
        }

        Nodo actual = primerElemento;
        while (actual.siguiente != null) {
            if (actual.siguiente.estudiante.cedula.equals(cedula)) {
                actual.siguiente = actual.siguiente.siguiente;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Mostrar todos los estudiantes
    public void mostrarTodos() {
        Nodo actual = primerElemento;
        while (actual != null) {
            System.out.println(actual.estudiante);
            actual = actual.siguiente;
        }
    }

    // Contar aprobados (nota >= 6)
    public int contarAprobados() {
        int count = 0;
        Nodo actual = primerElemento;
        while (actual != null) {
            if (actual.estudiante.nota >= 6.0) count++;
            actual = actual.siguiente;
        }
        return count;
    }

    // Contar reprobados (nota < 6)
    public int contarReprobados() {
        int count = 0;
        Nodo actual = primerElemento;
        while (actual != null) {
            if (actual.estudiante.nota < 6.0) count++;
            actual = actual.siguiente;
        }
        return count;
    }
}

    
   