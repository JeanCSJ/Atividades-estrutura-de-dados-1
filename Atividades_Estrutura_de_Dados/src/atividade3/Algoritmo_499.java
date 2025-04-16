package atividade3;

import java.util.Scanner;

public class Algoritmo_499 {
	
	static void entrada(int vet[], int t, Scanner sc) {
		System.out.println("\nEntrada do VETOR");
		for(int L = 0; L < t; L++) {
			System.out.print("Digite o " + (L+1) + "° numero: ");
			vet[L] = sc.nextInt();
		}
	}
	
	static void imprime(int vet[], int t) {
		System.out.println("\nVetor");
		for(int L = 0; L < t; L++) {
			System.out.println((L+1) + " - " + vet[L]);
		}
	}
	
	static void ordena(int vet[], int tam) {
		for(int L1 = 0; L1 < tam - 1; L1++) {
			for(int c1 = L1 + 1; c1 < tam; c1++) {
				if(vet[L1] > vet[c1]) {
					int aux = vet[L1];
					vet[L1] = vet[c1];
					vet[c1] = aux;
				}
			}
		}
		System.out.println("\nVetor ordenado com sucesso!");
	}
	
	public static void main(String[] args) {
		int num[] = new int[5];
		int flag = 0;
		int op;
		Scanner sc = new Scanner(System.in);
		
		for(int L = 0; L < 5; L++) {
			num[L] = 0;
		}
		
		do {
			System.out.println("\n\n\n");
			System.out.println("MENU VETOR - FUNÇÃO \n");
			System.out.println("1 - Dados do VETOR");
			System.out.println("2 - Ordenar VETOR");
			System.out.println("3 - Imprime VETOR");
			System.out.println("4 - Sai do programa");
			System.out.print("OPÇÃO: ");
			op = sc.nextInt();
			
			switch(op){
				case 1:
					entrada(num, 5, sc);
					flag = 1;
					break;
				case 2:
					if(flag == 1) {
						ordena(num, 5);
					} else {
						System.out.println("\nEscolha primeiro opcao 1");
					}
					break;
				case 3:
					if(flag == 1) {
						imprime(num, 5);
					} else {
						System.out.println("\nEscolha primeiro opcao 1");
					}
					break;
				case 4:
					System.out.println("\nSaindo do algoritmo");
					break;
				default:
					System.out.println("\nOpcão inválida");
					break;
			}
		} while(op != 4);
		
		sc.close();
		System.out.println();
	}
}
