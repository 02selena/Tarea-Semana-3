
package com.mycompany.estudiante;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEstudiantes lista = new ListaEstudiantes();

        while (true) {
            System.out.println("\n1. Agregar estudiante");
            System.out.println("2. Buscar estudiante por cédula");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Mostrar todos");
            System.out.println("5. Contar aprobados y reprobados");
            System.out.println("6. Salir");
            System.out.print("Seleccione opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Cédula: ");
                    String cedula = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();

                    System.out.print("Correo: ");
                    String correo = sc.nextLine();

                    System.out.print("Nota definitiva (1-10): ");
                    double nota = sc.nextDouble();
                    sc.nextLine();

                    Estudiante e = new Estudiante(cedula, nombre, apellido, correo, nota);

                    if (nota >= 6.0) {
                        lista.agregarInicio(e);  // Aprobados al inicio
                        System.out.println("Estudiante aprobado agregado al inicio.");
                    } else {
                        lista.agregarFinal(e);    // Reprobados al final
                        System.out.println("Estudiante reprobado agregado al final.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese cédula para buscar: ");
                    String buscarCed = sc.nextLine();
                    Estudiante encontrado = lista.buscar(buscarCed);
                    if (encontrado != null) {
                        System.out.println("Estudiante encontrado: " + encontrado);
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese cédula para eliminar: ");
                    String eliminarCed = sc.nextLine();
                    boolean eliminado = lista.eliminar(eliminarCed);
                    if (eliminado) {
                        System.out.println("Estudiante eliminado.");
                    } else {
                        System.out.println("No se encontró el estudiante para eliminar.");
                    }
                    break;

                case 4:
                    System.out.println("Listado de estudiantes:");
                    lista.mostrarTodos();
                    break;

                case 5:
                    int aprobados = lista.contarAprobados();
                    int reprobados = lista.contarReprobados();
                    System.out.println("Total aprobados: " + aprobados);
                    System.out.println("Total reprobados: " + reprobados);
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}

    
     