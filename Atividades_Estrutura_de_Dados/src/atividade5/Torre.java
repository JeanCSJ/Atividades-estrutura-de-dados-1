package atividade5;

import java.util.ArrayDeque;
import java.util.Deque;

public class Torre {

    static long movimentos = 0;
    static Deque<Integer> torre1 = new ArrayDeque<>();
    static Deque<Integer> torre2 = new ArrayDeque<>();
    static Deque<Integer> torre3 = new ArrayDeque<>();
    static int[] posicaoDasPecas;

    static void criarTorre(int numPecas) {
        posicaoDasPecas = new int[numPecas + 1];
        for (int n = numPecas; n > 0; n--) {
            torre1.push(n);
            posicaoDasPecas[n] = 1; // torre1
        }
        //imprimirTorres();
    }

    static void moverPecas(int pecaAtual) {
        if (pecaAtual <= 0) {
            return;
        }

        moverPecas(pecaAtual - 1);

        if (pecaAtual % 2 == 1) {
            moverImpar(pecaAtual);
        } else {
            moverPar(pecaAtual);
        }

        movimentos++;
        
        //imprimirTorres();

        moverPecas(pecaAtual - 1);
    }

    static void moverImpar(int pecaAtual) {
        int torre = posicaoDasPecas[pecaAtual];

        switch (torre) {
            case 1 -> {
                torre2.push(torre1.pop());
                posicaoDasPecas[pecaAtual] = 2;
            }
            case 2 -> {
                torre3.push(torre2.pop());
                posicaoDasPecas[pecaAtual] = 3;
            }
            case 3 -> {
                torre1.push(torre3.pop());
                posicaoDasPecas[pecaAtual] = 1;
            }
        }
    }

    static void moverPar(int pecaAtual) {
        int torre = posicaoDasPecas[pecaAtual];

        switch (torre) {
            case 1 -> {
                if (torre2.isEmpty() || pecaAtual < torre2.peek()) {
                    torre2.push(torre1.pop());
                    posicaoDasPecas[pecaAtual] = 2;
                } else {
                    torre3.push(torre1.pop());
                    posicaoDasPecas[pecaAtual] = 3;
                }
            }
            case 2 -> {
                if (torre1.isEmpty() || pecaAtual < torre1.peek()) {
                    torre1.push(torre2.pop());
                    posicaoDasPecas[pecaAtual] = 1;
                } else {
                    torre3.push(torre2.pop());
                    posicaoDasPecas[pecaAtual] = 3;
                }
            }
            case 3 -> {
                if (torre1.isEmpty() || pecaAtual < torre1.peek()) {
                    torre1.push(torre3.pop());
                    posicaoDasPecas[pecaAtual] = 1;
                } else {
                    torre2.push(torre3.pop());
                    posicaoDasPecas[pecaAtual] = 2;
                }
            }
        }
    }

    static void imprimirTorres() {
        System.out.println("\nMovimento #" + movimentos);
        System.out.println("Torre 1: " + torre1);
        System.out.println("Torre 2: " + torre2);
        System.out.println("Torre 3: " + torre3);
    }
}
