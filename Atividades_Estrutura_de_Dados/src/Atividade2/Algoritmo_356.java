package Atividade2;

import java.util.Scanner;

public class Algoritmo_356 {

	public static void main(String[] args) {
		float pr1[] = new float[15];
		float pr2[] = new float[15];
		int media[] = new int[15];
		String sit[] = new String[15];
		String nome[] = new String[15];
		int L, t, c;
		Scanner scfloat = new Scanner(System.in);
		Scanner scstr = new Scanner(System.in);
		
		for(L = 0; L < 15; L++) {
			System.out.print("Digite " + (L+1) + "° nome: ");
			nome[L] = scstr.nextLine();
			while(nome[L].length() > 30) {
				System.out.println("Nomes com até 30 caracteres");
				System.out.print("Digite " + (L+1) + "nome: ");
				nome[L] = scstr.nextLine();
			}
			t = 30 - nome.length;
			for(c = 1; c <= t; c++) {
				nome[L] += " ";
			}
			System.out.print("Digite a 1° nota: ");
			pr1[L] = scfloat.nextFloat();
			System.out.print("Digite a 2° nota: ");
			pr2[L] = scfloat.nextFloat();
			System.out.println();
			media[L] = Math.round((pr1[L]+pr2[L])/2);
			if(media[L] >= 5) {
				sit[L] = "AP";
			} else {
				sit[L] = "RP";
			}
		}
		scfloat.close();
		scstr.close();
		
		System.out.println("\n\n\n\t\t\t\tRELACAO FINAL\n");

		for (L = 0; L <= 14; L++) {
		    System.out.println((L + 1) + " - " + nome[L] + "\t" + pr1[L] + "\t" + pr2[L] + "\t" + media[L] + "\t" + sit[L]);
		}

	}

}
