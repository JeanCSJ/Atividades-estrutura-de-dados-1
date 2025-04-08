package atividade2;

import java.util.Scanner;

public class Algoritmo_354 {

	public static void main(String[] args) {
		int num[] = new int [15];
		Scanner sc = new Scanner(System.in);
		
		for(int L = 0; L <= 14; L++) {
			System.out.print("\ndigite " + (L + 1) + " numero: ");
			num[L] = sc.nextInt();
		}
		
		System.out.println("\nRELACAO DOS NUMEROS	");
		for(int L = 0; L <= 14; L++) {
			System.out.print("\n" + (L+1) + "- " + num[L]);
			if(num[L] % 2 == 0) {
				System.out.println(" é par");
			} else {
				System.out.println(" é impar");
			}
		}
		sc.close();
	}

}
