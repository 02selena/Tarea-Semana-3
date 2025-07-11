
package com.mycompany.usodepilas_parentesis_hanoi;


import java.util.Stack;

public class TorresHanoi {
    private Stack<Integer> torreA;
    private Stack<Integer> torreB;
    private Stack<Integer> torreC;
    
    public TorresHanoi(int numDiscos) {
        torreA = new Stack<>();
        torreB = new Stack<>();
        torreC = new Stack<>();
        
        
        for (int i = numDiscos; i >= 1; i--) {
            torreA.push(i);
        }
    }

    public void resolver(int n, char origen, char destino, char auxiliar) {
        if (n == 1) {
            moverDisco(origen, destino);
            return;
        }

        resolver(n - 1, origen, auxiliar, destino);
        moverDisco(origen, destino);
        resolver(n - 1, auxiliar, destino, origen);
    }

    private void moverDisco(char desde, char hasta) {
        Stack<Integer> torreDesde = obtenerTorre(desde);
        Stack<Integer> torreHasta = obtenerTorre(hasta);

        if (!torreDesde.isEmpty()) {
            int disco = torreDesde.pop();
            torreHasta.push(disco);
            System.out.println("Mover disco " + disco + " de " + desde + " a " + hasta);
        }
    }

    private Stack<Integer> obtenerTorre(char nombre) {
        switch (nombre) {
            case 'A': return torreA;
            case 'B': return torreB;
            case 'C': return torreC;
            default: return null;
        }
    }
}

