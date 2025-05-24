package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao;
		int verificacao = 0;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("\n\t\tMENU");
			System.out.println("1 - Criar pilha");
			System.out.println("2 - Exibir pilha");
			System.out.println("3 - Remover chave");
			System.out.println("4 - Remover pilha");
			System.out.println("0 - Encerrar programa");
			System.out.println();
			System.out.print("O que deseja fazer: ");
			opcao = sc.nextInt();
			switch(opcao){
				case 1 -> {
					if(verificacao == 1) {
						System.out.println("Apilha já foi criada anteriormente");
					}else {
						verificacao = Pilha.criarpilha();
					}
				}
				case 2 -> {
					if(verificacao == 0) {
						System.out.println("A pilha deve ser criada antes de realizar essa ação.");
					}else {
						Pilha.exibirPilha();
					}
				}
				case 3 -> {
					if(verificacao == 0) {
						System.out.println("A pilha deve ser criada antes de realizar essa ação.");
					}else {
						System.out.println("Digite o numero que deseja remover da pilha: ");
						int chave = sc.nextInt();
						if(Pilha.procurarChave(chave) == -1) {
							System.out.print("Esse elemento não se encontra na pilha");
						}else {
							Pilha.removerChave(chave);
						}
					}
					
				}
				case 4 -> {
					if(verificacao == 0) {
						System.out.println("Não há uma pilha para remover");
					}else {
						verificacao = Pilha.removerPilha();
					}
				}
				case 0 -> {
					System.out.println();
					System.out.println("FIM PROGRAMA");
				}
				default -> {
					System.out.println("Opção inexistente");
				}
			}
			
		}while(opcao != 0);
		
		sc.close();
	}

}
