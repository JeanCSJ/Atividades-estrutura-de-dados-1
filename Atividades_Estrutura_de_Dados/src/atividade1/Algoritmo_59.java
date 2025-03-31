package atividade1;

import java.util.Scanner;

public class Algoritmo_59 {

	public static void main(String[] args) {
		// Entrar com os valores dos catetos de um triângulo retângulo e imprimira hipotenusa 
		
		double a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrar com 1 cateto: ");
		b = sc.nextDouble();
		System.out.print("\nEntrar com 2 cateto: ");
		c = sc.nextDouble();
		a = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));
		System.out.println("\nA hipotenusa é: " + a);
		
		sc.close();
	}

}
