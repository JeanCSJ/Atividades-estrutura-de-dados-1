package atividade2;

import java.util.Scanner;

public class Algoritmo_413 {

	public static void main(String[] args) {
		int n[][] = new int[5][5];
		int soma = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(int L = 0; L < 5; L++){
			for(int c = 0; c < 5; c++){
				System.out.print("\nDigite elemento " + L + "-" + c + ": ");
				n[L][c] = scanner.nextInt();
			}
		}
		System.out.println("\nToda a matriz	");
		for(int L = 0; L < 5; L++){
			for(int c = 0; c < 5; c++){
				System.out.print(n[L][c] + "\t");
			}
			System.out.println();
		}

		for(int L = 1; L < 5; L++){
			for(int c = 5 - L; c < 5; c++){
				if(n[L][c] % 2 == 1){
					soma += (n[L][c] * n[L][c]);
				}
			}
		}

		System.out.println("\n\nRaiz quadrada da soma dos quadrados dos numeros impares: " + Math.sqrt(soma));

		scanner.close();
	}
}