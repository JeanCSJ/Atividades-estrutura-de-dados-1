package atividade2;

import java.util.Scanner;

public class Algoritmo_351 {

	public static void main(String[] args) {
		int num;
		String nomes[] = new String[5];
		Scanner scint = new Scanner(System.in);
		Scanner scstr = new Scanner(System.in);
		
		for(int L = 0; L <= 4; L++) {
			System.out.print("\nnome " + (L+1) + ": ");
			nomes[L] = scstr.nextLine();
		}
		
		System.out.print("\nDigite o numero da pessoa: ");
		num = scint.nextInt();
		while(num < 1 || num > 5) {
			System.out.println(" \n Numero fora do intervalo");
			System.out.print("\nDigite o numero da pessoa: ");
			num = scint.nextInt();
		}
		
		System.out.println(nomes[num-1]);
		
		scint.close();
		scstr.close();
	}

}
