package exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		
		do {
			System.out.println("\n\t\tMENU");
			System.out.println("Digite 1 para criar uma fila contendo números aleatórios");
			System.out.println("Digite 2 para inverter a ultima fila criada");
			System.out.println("Digite 0 encerrar o programa");
			opcao = sc.nextInt();
			
			switch (opcao) {
				case 1 -> {
					if(!Fila.F1.isEmpty()) {
						Fila.esvaziar();
					}
					Fila.criar();
					System.out.println("Fila criada: " + Fila.F1);
				}
				case 2 -> {
					if(Fila.F1.isEmpty()) {
						System.out.println("Você precisa criar uma nova fila para selecionar esta opção");
					}else {
						Fila.inverter();
						System.out.println("Fila invertida: " + Fila.F2);
					}
				}
				case 0 -> {System.out.println("Programa encerrado");}
				default -> {System.out.println("Opçaõ inválida");}
			}
			
			
		}while(opcao != 0);
		
		sc.close();
	}

}
