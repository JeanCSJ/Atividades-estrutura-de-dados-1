package atividade3;

import java.util.Scanner;

public class Algoritmo_460 {
	
	static int dob(int a) {
		return a = (a*2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int c = 1; c <= 3; c++) {
			System.out.print("\n\ndigite numero: ");
			int a = sc.nextInt();
			System.out.println("dobro: " + dob(a));
		}
		
		sc.close();
	}
}
