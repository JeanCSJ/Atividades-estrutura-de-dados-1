package atividade4_2;

import java.util.Stack;

public class Calculadora {

    public static void calcPosfixa(String expressao) {
        Stack<Integer> pilha = new Stack<>();
        String pedacos[] = expressao.trim().split("\\s+");

        for (String pedaco : pedacos) {
            if (pedaco.matches("-?\\d+")) {
                pilha.push(Integer.parseInt(pedaco));
            } else {
                int b = pilha.pop();
                int a = pilha.pop();
                int resultado = switch (pedaco) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> a / b;
                default -> {
                    System.out.println("Operador inválido encontrado: " + pedaco);
                    System.exit(1);
                    yield 0;
                }
            };

                pilha.push(resultado);
            }
        }

        System.out.println("Resultado: " + pilha.pop());
    }
}
