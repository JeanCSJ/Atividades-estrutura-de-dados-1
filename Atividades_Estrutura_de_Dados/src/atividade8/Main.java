package atividade8;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClasseDeque filaDocumentos = new ClasseDeque();
        int opcao;
        
        Documento.gerarIds();
        
        do {
            exibirMenu();
            opcao = sc.nextInt();
            switch (opcao) {
            	case 1:
            		System.out.println("Documento normal adicionado ao final da fila:");
            		filaDocumentos.adicionar_documento_normal();
            		break;
            	case 2:
            		System.out.println("Documento urgente adicionado ao início da fila:");
                	filaDocumentos.adicionar_documento_urgente();
                   	break;
            	case 3:
            		System.out.println("Primeiro documento da fila processado e retirado:");
            		filaDocumentos.processar_proximo();
                   	break;
               	case 4:
               		System.out.println("Ultimo documento da fila processado e retirado:");
                  	filaDocumentos.processar_ultimo();
                 	break;
              	case 5:
              		System.out.println("Fila de Documentos:");
              		System.out.println();
                 	filaDocumentos.visualizar_fila();
                 	break;
               	case 6:
                 	filaDocumentos.fila_vazia();
                   	break;
              	case 7:
              		System.out.print("Total de documentos na fila: ");
                  	filaDocumentos.total_documentos();
                   	break;
               	case 8:
               		System.out.print("Total de páginas na fila: ");
                 	filaDocumentos.total_paginas();
                   	break;
               	case 0:
                 	System.out.println("Encerrando programa");
                    break;
            	default:
                  	System.out.println("Opção inválida, escolha uma opção válida.");
                  	break;
            }
        } while (opcao != 0);

        sc.close();
    }

    private static void exibirMenu() {
        System.out.println("\n--- Menu de Gerenciamento de Documentos ---");
        System.out.println("1. Adicionar documento normal (final da fila)");
        System.out.println("2. Adicionar documento urgente (início da fila)");
        System.out.println("3. Processar próximo documento (remover do início)");
        System.out.println("4. Processar último documento (remover do final)");
        System.out.println("5. Visualizar fila de documentos");
        System.out.println("6. Verificar se a fila está vazia");
        System.out.println("7. Contar total de documentos na fila");
        System.out.println("8. Calcular total de páginas na fila");
        System.out.println("0. Sair");
        System.out.println("------------------------------------------");
    }
}