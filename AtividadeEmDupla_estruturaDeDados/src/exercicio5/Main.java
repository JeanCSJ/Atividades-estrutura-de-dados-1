package exercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1 - Sortear e armazenar números");
			System.out.println("0 - Encerrar programa");
			opcao = sc.nextInt();
			
			switch(opcao) {
			case 1 -> {
				for(int n = 1000; n > 0; n--) {
					int num = Operacoes.sorteio();
					
					if(Operacoes.F.isEmpty() || !Operacoes.F.contains(num)) {
						Operacoes.inserirFila(num);
					}else {
						Operacoes.inserirPilha(num);
					}
				}
				
				System.out.println("Fila F: " + Operacoes.F);
				System.out.println("Pilha P: " + Operacoes.P);
			}
			case 0 -> System.out.println("Programa encerrado");
			default -> System.out.println("Opção inválida");
			}
		}while(opcao != 0);
		sc.close();
	}
}
