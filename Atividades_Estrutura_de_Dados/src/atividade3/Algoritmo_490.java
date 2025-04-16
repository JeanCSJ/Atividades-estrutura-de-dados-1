package atividade3;

import java.util.Scanner;

public class Algoritmo_490 {
	
	public static int restantes(StringBuilder vet, int tam, String x) {
		int cont = 0;
		for (int i = 0; i < tam; i++) {
			if (vet.charAt(i) == x.charAt(0)) {
				vet.setCharAt(i, '*');
				cont++;
			}
		}
		return cont;
	}

	public static void main(String[] args) {
		String nome[] = new String[10];
		Scanner sc = new Scanner(System.in);
		
		for (int L = 0; L < 10; L++) {
			System.out.print("digite palavra em letras minusculas " + (L + 1) + ": ");
			String entrada = sc.nextLine();
			StringBuilder sb = new StringBuilder(entrada);
			
			int quantidade = restantes(sb, sb.length(), "c");
			nome[L] = sb.toString();
			
			System.out.println("Letras 'c' substituídas: " + quantidade);
		}
		
		for (int L = 0; L < 10; L++) {
			System.out.println("\n" + (L + 1) + " - " + nome[L]);
		}
		
		sc.close();
	}
}
