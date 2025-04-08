package atividade2;

import java.util.Scanner;

public class Algoritmo_348 {

	public static void main(String[] args) {
		String nomes[] = new String[5];
		float pr1[] = new float[5];
		float pr2[] = new float[5];
		float media[] = new float[5];
		Scanner scfloat = new Scanner(System.in);
		Scanner scstr = new Scanner(System.in);
		
		for(int L = 0; L <= 4; L++) {
			System.out.print("\nDigite " + (L + 1) + "° nome: ");
			nomes[L] = scstr.nextLine();
			System.out.print("Digite 1° nota: ");
			pr1[L] = scfloat.nextFloat();
			System.out.print("Digite 2° nota: ");
			pr2[L] = scfloat.nextFloat();
			media[L] = (pr1[L] + pr2[L])/2;
		}
		scfloat.close();
		scstr.close();
		
		System.out.println("\n\n\n\t\t\t\tRELACAO FINAL");
		for(int L = 0; L <= 4; L++) {
			System.out.println("\n" + (L+1) + "- " + nomes[L]);
			System.out.println(pr1[L] + "\t" + pr2[L] + "\t" + media[L]);
		}
	}

}
