package atividade3;

import java.util.Scanner;

public class Algoritmo_500 {
	
	static void entrada(int vet[], int t, String c, Scanner sc) {
		System.out.println("\nEntrada do VETOR " + c);
		for(int L = 0; L < t; L++) {
			System.out.print("Digite o " + (L + 1) + "º número: ");
			vet[L] = sc.nextInt();
		}
	}
	
	static void imprime(int vet[], int t, String c) {
		System.out.println("\nVETOR " + c + "\n");
		for(int L = 0; L < t; L++) {
			System.out.println((L + 1) + " - " + vet[L]);
		}
	}
	
	static void soma(int vet[], int vet1[], int t) {
		System.out.println("\nSOMA\n");
		for(int L = 0; L < t; L++) {
			int s = vet[L] + vet1[L];
			System.out.println(s);
		}
	}
	
	static void subtrai(int vet[], int vet1[], int t) {
		System.out.println("\nDIFERENÇA\n");
		for(int L = 0; L < t; L++) {
			int d = vet[L] - vet1[L];
			System.out.println(d);
		}
	}

	public static void main(String[] args) {
		int num[] = new int[5];
		int num1[] = new int[5];
		int flag = 0, flag1 = 0, op;
		Scanner sc = new Scanner(System.in);

		for(int L = 0; L < 5; L++) {
			num[L] = 0;
			num1[L] = 0;
		}
		
		do {
			System.out.println("\n\n\n");
			System.out.println("VETORES\n");
			System.out.println("1 - Dados do VETOR A");
			System.out.println("2 - Dados do VETOR B");
			System.out.println("3 - Imprime VETORES");
			System.out.println("4 - Soma VETORES");
			System.out.println("5 - Subtrai VETORES");
			System.out.println("6 - Sai do programa");
			System.out.print("OPÇÃO: ");
			op = sc.nextInt();
			
			switch(op) {
				case 1:
					entrada(num, 5, "A", sc);
					flag = 1;
					break;
				case 2:
					entrada(num1, 5, "B", sc);
					flag1 = 1;
					break;
				case 3:
					if(flag != 0 && flag1 != 0) {
						imprime(num, 5, "A");
						imprime(num1, 5, "B");
					} else {
						System.out.println("\nEscolha primeiro opcoes 1 e 2");
					}
					break;
				case 4:
					if(flag != 0 && flag1 != 0) {
						soma(num, num1, 5);
					} else {
						System.out.println("\nEscolha primeiro opcoes 1 e 2");
					}
					break;
				case 5:
					if(flag != 0 && flag1 != 0) {
						subtrai(num, num1, 5);
					} else {
						System.out.println("\nEscolha primeiro opcoes 1 e 2");
					}
					break;
				case 6:
					System.out.println("\nSaindo do Algoritmo");
					break;
				default:
					System.out.println("\nOpção inválida");
					break;
			}
		} while(op != 6);
		
		System.out.println();
		sc.close();
	}

}
