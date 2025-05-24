package exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        int contadorId = 1;
        Scanner sc = new Scanner(System.in);
        Fila fila = new Fila();

        do {
            System.out.println("\n\t\tMENU");
            System.out.println("Selecione a tarefa que deseja realizar:");
            System.out.println("1 - Listar o número de aviões aguardando na fila de decolagem");
            System.out.println("2 - Autorizar a decolagem do primeiro avião da fila");
            System.out.println("3 - Adicionar um avião à fila de espera");
            System.out.println("4 - Listar todos os aviões na fila de espera");
            System.out.println("5 - Listar as características do primeiro avião da fila");
            System.out.println("0 - Encerrar programa");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Número de aviões na fila: " + fila.tamanho());
                }
                case 2 -> {
                    Aviao removido = fila.remove();
                    if (removido != null) {
                        System.out.println("Avião autorizado para decolagem: ID " + removido.id + ", Nome: " + removido.nome);
                    } else {
                        System.out.println("Nenhum avião na fila.");
                    }
                }
                case 3 -> {
                    System.out.print("Digite o nome do avião: ");
                    String nome = sc.nextLine();
                    Aviao novoAviao = new Aviao();
                    novoAviao.nome = nome;
                    novoAviao.id = contadorId++;
                    fila.adicionar(novoAviao);
                    System.out.println("Avião adicionado à fila com sucesso.");
                }
                case 4 -> {
                    fila.listarTodos();
                }
                case 5 -> {
                    Aviao primeiro = fila.primeiro();
                    if (primeiro != null) {
                        System.out.println("Primeiro avião na fila:");
                        System.out.println("ID: " + primeiro.id + ", Nome: " + primeiro.nome);
                    } else {
                        System.out.println("Nenhum avião na fila.");
                    }
                }
                case 0 -> {
                    System.out.println("Encerrando programa...");
                }
                default -> {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }
        } while (opcao != 0);
        
        sc.close();
    }
}
