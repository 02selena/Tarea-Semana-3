
package com.mycompany.usodepilas_parentesis_hanoi;

import java.util.Stack;

public class Balanceador {
    
    public static boolean estaBalanceada(String expresion) {
        Stack<Character> pila = new Stack<Character>();

        for (char c : expresion.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) return false;
                char apertura = pila.pop();
                if (!esPar(apertura, c)) return false;
            }
        }

        return pila.isEmpty();
    }

    private static boolean esPar(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '[' && cierre == ']') ||
               (apertura == '{' && cierre == '}');
    }
}
    

