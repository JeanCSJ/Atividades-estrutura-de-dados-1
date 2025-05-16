package atividade4_2;

import java.util.Stack;

public class Conversor {

    private static int precedencia(String operador) {
        return switch (operador) {
            case "+", "-" -> 1;
            case "*", "/" -> 2;
            default -> 0;
        };
    }

    public static String infixaParaPosfixa(String expressao) {
        StringBuilder saida = new StringBuilder();
        Stack<String> pilhaSinais = new Stack<>();
        String[] pedacos = expressao.trim().split("\\s+");
        for (String pedaco : pedacos) {
        	if (pedaco.matches("-?\\d+")) {
        		saida.append(pedaco).append(" ");
        	} else {
        	    switch (pedaco) {
        	     	case "(" -> pilhaSinais.push(pedaco);
        	        case ")" -> {
        	        	while (!pilhaSinais.isEmpty() && !pilhaSinais.peek().equals("(")) {
        	        		saida.append(pilhaSinais.pop()).append(" ");
        	            }
        	            if (!pilhaSinais.isEmpty()) {
        	            	pilhaSinais.pop(); // remove "("
        	            }
        	        }
        	        default -> {
        	            while (!pilhaSinais.isEmpty() && precedencia(pedaco) <= precedencia(pilhaSinais.peek())) {
        	            	saida.append(pilhaSinais.pop()).append(" ");
        	            }
        	            pilhaSinais.push(pedaco);
        	        }
        	    }
        	}
        }

        while (!pilhaSinais.isEmpty()) {
            saida.append(pilhaSinais.pop()).append(" ");
        }

        return saida.toString().trim();
    }

    public static String posfixaParaPrefixa(String expressao) {
        Stack<String> pilha = new Stack<>();
        String[] pedacos = expressao.trim().split("\\s+");

        for (String pedaco : pedacos) {
            if (pedaco.matches("-?\\d+")) {
                pilha.push(pedaco);
            } else {
                String b = pilha.pop();
                String a = pilha.pop();
                pilha.push(pedaco + " " + a + " " + b);
            }
        }

        return pilha.pop();
    }

    public static String prefixaParaInfixa(String expressao) {
        Stack<String> pilha = new Stack<>();
        String[] pedacos = expressao.trim().split("\\s+");

        for (int n = pedacos.length - 1; n >= 0; n--) {
            String pedaco = pedacos[n];
            if (pedaco.matches("-?\\d+")) {
                pilha.push(pedaco);
            } else {
                String a = pilha.pop();
                String b = pilha.pop();
                pilha.push("( " + a + " " + pedaco + " " + b + " )");
            }
        }

        return pilha.pop();
    }
}
