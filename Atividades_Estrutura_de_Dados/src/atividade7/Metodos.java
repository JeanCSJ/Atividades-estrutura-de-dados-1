package atividade7;

import java.util.concurrent.ThreadLocalRandom;

public class Metodos {
	static int vetor[] = new int[1000];
	static ListaDe lista = new ListaDe();
	
	static void gerarNum() {
		for(int n = 0; n < vetor.length; n++) {
			vetor[n] = ThreadLocalRandom.current().nextInt(-9999, 9999);
		}
	}
	static void printVetor() {
		System.out.print("Vetor => [");
		for(int n = 0; n < vetor.length; n++) {
			if(n != 0) {
				System.out.print(", " + vetor[n]);
				
			}else {
				System.out.print(vetor[n]);
			}
		}
		System.out.println("]");
	}
	static void inserirLista() {
		for (int n = 0; n < vetor.length; n++) {
	        int valor = vetor[n];
	        No atual = lista.inicio;
	        int posicao = 0;

	        while (atual != null && atual.valor < valor) {
	            atual = atual.proximo;
	            posicao++;
	        }

	        lista.inserirNaPosicao(valor, posicao);
	    }
	}
}
