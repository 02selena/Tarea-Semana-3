
package com.mycompany.ejercicios;

public class Ejercicios {

  
class Asignatura {
    String nombre;
    double nota;

    public Asignatura(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void mostrarNota() {
        System.out.println("En " + nombre + " has sacado " + nota);
    }

    @Override
    public String toString() {
        return nombre;
    }
}


public class Alumno {
    String nombre;
    ist=new asignaturas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.asignaturas = new ArrayList<>();
        String[] materias = {"Matemáticas", "Física", "Química", "Historia", "Lengua"};
        for (String materia : materias) {
            asignaturas.add(new Asignatura(materia));
        }
    }

    public void ingresarNotas(Scanner sc) {
        for (Asignatura a : asignaturas) {
            System.out.print("Introduce la nota de " + a.nombre + ": ");
            double nota = sc.nextDouble();
            a.setNota(nota);
        }
    }

    public void mostrarNotas() {
        System.out.println("Notas de " + nombre + ":");
        for (Asignatura a : asignaturas) {
            a.mostrarNota();
        }
    }

    public void mostrarAsignaturas() {
        System.out.println("Asignaturas:");
        for (Asignatura a : asignaturas) {
            System.out.println("- " + a.nombre);
        }
    }
}



public class EjerciciosLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumno alumno = new Alumno("Carlos");

        int opcion;
        do {
            System.out.println("\n--- MENÚ DE EJERCICIOS ---");
            System.out.println("1. Mostrar asignaturas");
            System.out.println("2. Ingresar y mostrar notas");
            System.out.println("3. Números ganadores de la lotería");
            System.out.println("4. Mostrar números del 1 al 10 en orden inverso");
            System.out.println("5. Mostrar materias y notas (como objeto Alumno)");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    alumno.mostrarAsignaturas();
                    break;
                case 2:
                    alumno.ingresarNotas(sc);
                    alumno.mostrarNotas();
                    break;
                case 3:
                    loteria(sc);
                    break;
                case 4:
                    mostrarInverso();
                    break;
                case 5:
                    alumno.ingresarNotas(sc);
                    alumno.mostrarNotas();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }

    public static void loteria(Scanner sc) {
        List<Integer> numeros = new ArrayList<>();
        System.out.println("Introduce los 6 números ganadores:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros.add(sc.nextInt());
        }
        Collections.sort(numeros);
        System.out.println("Números ganadores ordenados: " + numeros);
    }

    public static void mostrarInverso() {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        Collections.reverse(numeros);
        System.out.println("Números del 10 al 1: " +
                String.join(", ", numeros.stream().map(String::valueOf).toArray(String[]::new)));
    }
}

    }

