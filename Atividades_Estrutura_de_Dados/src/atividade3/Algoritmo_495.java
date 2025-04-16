package atividade3;

import java.util.Scanner;

public class Algoritmo_495 {
	
	public static void ordena(String vet[], int tam) {
		for(int L1=0; L1<(tam-1); L1++) {
			for(int c1=(L1+1); c1<tam; c1++) {
				if(vet[L1].compareTo(vet[c1]) > 0) {
					String aux = vet[L1];
					vet[L1] = vet[c1];
					vet[c1] = aux;
				}
			}
		}
	}

	public static void main(String[] args) {
		String nome[] = new String[5];
		Scanner sc = new Scanner(System.in);
		
		for(int L=0; L<5; L++) {
			System.out.print("Digite nome ");
			nome[L] = sc.nextLine();
		}
		ordena(nome, 5);
		System.out.println("\n\nNOMES ORDENADOS\n");
		for(int L=0; L<5; L++) {
			System.out.println( + (L+1) + " - " + nome[L]);
		}
		System.out.println();
		
		sc.close();
	}

}
