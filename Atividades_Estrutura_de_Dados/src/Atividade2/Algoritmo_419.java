package atividade2;

import java.util.Scanner;

public class Algoritmo_419 {

	public static void main(String[] args) {
		int A[][] = new int[5][5];
		int B[][] = new int[5][5];
		int DIF[][] = new int[5][5];
		Scanner sc = new Scanner(System.in);

		for(int L = 0; L < 5; L++){
			for(int c = 0; c < 5; c++){
				System.out.print("Digite elemento de A[" + (L + 1) + "][" + (c + 1) + "]: ");
				A[L][c] = sc.nextInt();
			}
		}

		for(int L = 0; L < 5; L++){
			for(int c = 0; c < 5; c++){
				System.out.print("Digite elemento de B[" + (L + 1) + "][" + (c + 1) + "]: ");
				B[L][c] = sc.nextInt();
				DIF[L][c] = A[L][c] - B[L][c];
			}
		}

		System.out.println("\n\tMATRIZ DIFERENÇA");
		for(int L = 0; L < 5; L++){
			for(int c = 0; c < 5; c++){
				System.out.print("\t" + DIF[L][c]);
			}
			System.out.println();
		}
		sc.close();
	}
}
