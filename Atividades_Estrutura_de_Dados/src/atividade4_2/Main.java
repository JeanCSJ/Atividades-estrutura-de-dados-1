package atividade4_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha o tipo de notação:");
            System.out.println("1 - Infixa");
            System.out.println("2 - Pós-fixa");
            System.out.println("3 - Pré-fixa");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite a expressão infixa: ");
                    String expressao = sc.nextLine();

                    String posfixa = Conversor.infixaParaPosfixa(expressao);
                    String prefixa = Conversor.posfixaParaPrefixa(posfixa);

                    System.out.println("Infixa: " + expressao);
                    System.out.println("Pós-fixa: " + posfixa);
                    System.out.println("Pré-fixa: " + prefixa);

                    Calculadora.calcPosfixa(posfixa);
                }
                case 2 -> {
                    System.out.print("Digite a expressão pós-fixa: ");
                    String expressao = sc.nextLine();

                    String prefixa = Conversor.posfixaParaPrefixa(expressao);
                    String infixa = Conversor.prefixaParaInfixa(prefixa);

                    System.out.println("Infixa: " + infixa);
                    System.out.println("Pós-fixa: " + expressao);
                    System.out.println("Pré-fixa: " + prefixa);

                    Calculadora.calcPosfixa(expressao);
                }
                case 3 -> {
                    System.out.print("Digite a expressão pré-fixa: ");
                    String expressao = sc.nextLine();

                    String infixa = Conversor.prefixaParaInfixa(expressao);
                    String posfixa = Conversor.infixaParaPosfixa(infixa);

                    System.out.println("Infixa: " + infixa);
                    System.out.println("Pós-fixa: " + posfixa);
                    System.out.println("Pré-fixa: " + expressao);

                    Calculadora.calcPosfixa(posfixa);
                }
                case 0 -> System.out.println("Programa encerrado");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
