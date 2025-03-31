package atividade1;

import java.util.Scanner;

public class Algoritmo_161 {

	public static void main(String[] args) {
		// Criar um algoritmo que entre com cinco números e imprimir o quadrado de cada número.
		
		int c;
		float num;
		
		Scanner sc = new Scanner(System.in);
		
		for(	c = 1; c <= 5; c++) {
			System.out.print("\nnumero: ");
			num = sc.nextFloat();
			System.out.println("quadrado: " + Math.pow(num, 2));
		}
		
		sc.close();
		
	}
	
	

}
