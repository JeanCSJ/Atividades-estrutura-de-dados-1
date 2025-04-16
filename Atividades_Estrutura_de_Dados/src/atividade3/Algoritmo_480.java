package atividade3;

import java.util.Scanner;

public class Algoritmo_480 {
	
	public static int reverso(int n) {
		int r, soma = 0;
		
		while(n != 0) {
			r = n % 10;
			soma = (soma * 10) + r;
			n /= 10;
		}
		return soma;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\ndigite numero: ");
		int n = sc.nextInt();
		int x = reverso(n);
		System.out.println("\n" + n + "-" + x);
		if(x == n) {
			System.out.println("É um numero capicua");
		}else {
			System.out.println("Não é um numero capicua");
		}
		System.out.println();
		
		sc.close();
	}

}
