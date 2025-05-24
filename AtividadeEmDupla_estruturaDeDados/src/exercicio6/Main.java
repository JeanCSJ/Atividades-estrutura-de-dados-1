package exercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao;
		Scanner sc = new Scanner(System.in);
		
		do {
			Operacoes.quantNeg = 0;
			Operacoes.quantPos = 0;
			
			System.out.println("1 - Sortear e armazenar números");
			System.out.println("2 - visualizar pilha");
			System.out.println("0 - Encerrar programa");
			opcao = sc.nextInt();
			
			switch(opcao) {
			case 1 -> {
				Operacoes.criarFila();
				
				while(!Operacoes.fila.isEmpty()) {
					if(Operacoes.fila.peek() > 0) {
						Operacoes.inserirPilha();
					}else {
						Operacoes.removerPilha();
					}
				}
				
				System.out.println("Pilha: " + Operacoes.pilha);
			}
			case 2 -> {
				if(Operacoes.pilha.isEmpty()) {
					System.out.println("A pilha está vazia");
				}else {
					System.out.println("Pilha: " + Operacoes.pilha);
				}
			}
			case 0 -> System.out.println("Programa encerrado");
			default -> System.out.println("Opção inválida");
			}
		}while(opcao != 0);
		sc.close();
	}
}
