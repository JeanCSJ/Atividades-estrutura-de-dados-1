package atividade5;

import java.util.Stack;

public class TorreAntiga {
    
    static int movimentos = 0;
    static Stack<Integer> torre1 = new Stack<>();
    static Stack<Integer> torre2 = new Stack<>();
    static Stack<Integer> torre3 = new Stack<>();
    
    static void criarTorre(int numPecas) {
        for (int n = numPecas; n > 0; n--) {
            torre1.push(n);
        }
        //imprimirTorres();
    }

    static int identificarTorre(int pecaAtual) {
        if (!torre1.isEmpty() && torre1.peek() == pecaAtual) {
            return 1;
        } else if (!torre2.isEmpty() && torre2.peek() == pecaAtual) {
            return 2;
        } else if (!torre3.isEmpty() && torre3.peek() == pecaAtual) {
            return 3;
        } else {
            return -1;
        }
    }

    static void moverPecas(int pecaAtual) {
        if (pecaAtual <= 0) {
            return;
        }

        moverPecas(pecaAtual - 1);

        int torreDaPeca = identificarTorre(pecaAtual);

        switch (torreDaPeca) {
            case 1 -> {
                if (torre2.isEmpty() || (torre2.peek() > pecaAtual && torre2.peek() % 2 != pecaAtual % 2)) {
                    torre2.push(torre1.pop());
                } else {
                    torre3.push(torre1.pop());
                }
            }
            case 2 -> {
                if (torre1.isEmpty() || (torre1.peek() > pecaAtual && torre1.peek() % 2 != pecaAtual % 2)) {
                    torre1.push(torre2.pop());
                } else {
                    torre3.push(torre2.pop());
                }
            }
            case 3 -> {
                if (torre1.isEmpty() || (torre1.peek() > pecaAtual && torre1.peek() % 2 != pecaAtual % 2)) {
                    torre1.push(torre3.pop());
                } else {
                    torre2.push(torre3.pop());
                }
            }
            default -> System.out.println("ERRO! Peca não encontrada");
        }

        movimentos++;
        //imprimirTorres();
        moverPecas(pecaAtual - 1);
    }

    static void imprimirTorres() {
        System.out.println("\nMovimento #" + movimentos);
        System.out.println("Torre 1: " + torre1);
        System.out.println("Torre 2: " + torre2);
        System.out.println("Torre 3: " + torre3);
    }
}
