package exercicio6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Operacoes {
	static int quantPos;
	static int quantNeg;
	static Random sortear = new Random();
	
	static Stack<Integer> pilha = new Stack<>();
	static Queue<Integer> fila = new LinkedList<>();
	
	static void criarFila() {
		while(!pilha.isEmpty()) {
			pilha.pop();
		}
		
		for(int n = 2000; n > 0; n--) {
			int num = Operacoes.sorteio(100);
			int sinal = definirSinal();
			
			switch(sinal) {
			case 1 -> fila.add(num);
			case 2 -> fila.add(0 - num);
			}
		}
		System.out.print("Elementos retirados da pilha: ");
	}
	static void inserirPilha() {
		pilha.push(fila.poll());
	}
	
	static void removerPilha() {
		fila.poll();
		if(!pilha.isEmpty()) {
			System.out.print(pilha.pop() + " ");
		}
	}
	
	static int sorteio(int num) {
		int numAleatorio = sortear.nextInt(num) + 1;
		return numAleatorio;
	}
	
	static int definirSinal() {
		int sinal;
		
		if(quantPos != 1000 && quantNeg != 1000) {
			sinal = Operacoes.sorteio(2);
		}else if(quantPos == 1000) {
			sinal = 2;
		}else {
			sinal = 1;
		}
		
		switch(sinal) {
			case 1 -> quantPos += 1;
			case 2 -> quantNeg += 1;
		}
		
		return sinal;
	}
}
