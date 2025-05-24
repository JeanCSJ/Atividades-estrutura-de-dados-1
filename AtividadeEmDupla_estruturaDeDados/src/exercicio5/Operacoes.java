package exercicio5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Operacoes {
	static Random sortear = new Random();
	
	static Queue<Integer> F = new LinkedList<>();
	static Stack<Integer> P = new Stack<>();
	
	static void inserirFila(int num) {
		F.add(num);
	}
	static void inserirPilha(int num) {
		P.push(num);
	}
	static int sorteio() {
		int numAleatorio = sortear.nextInt(100) + 1;
		return numAleatorio;
	}
}
