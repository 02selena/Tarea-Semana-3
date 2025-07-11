
package com.mycompany.usodepilas_parentesis_hanoi;

import java.util.Scanner;
public class UsoDePilas_Parentesis_Hanoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("====================================");
            System.out.println("   TAREA: USO DE PILAS EN JAVA");
            System.out.println("1. Verificar expresion balanceada");
            System.out.println("2. Resolver Torres de Hanoi");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); 
            
      // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese una expresion matematica: ");
                    String expresion = sc.nextLine();
                    if (Balanceador.estaBalanceada(expresion)) {
                        System.out.println("Formula balanceada.");
                    } else {
                        System.out.println("Formula desbalanceada.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el numero de discos: ");
                    int discos = sc.nextInt();
                    TorresHanoi hanoi = new TorresHanoi(discos);
                    hanoi.resolver(discos, 'A', 'C', 'B');
                    break;

                case 3:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 3);

        sc.close();
    }
}
  
