package exercicio7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Fila {
	static Random sortear = new Random();
	static Queue<Integer> fila = new LinkedList<>();
	static Stack<Integer> pilha = new Stack<>();
	
	static void criar() {
		for(int n = 1; n <= 20; n++) {
			fila.add(n);
		}
	}
	static void inverter() {
		if(fila.isEmpty()) {
			System.out.println("Ainda não foi criada uma fila");
		}else {
			while(!fila.isEmpty()) {
				pilha.push(fila.poll());
			}
			while(!pilha.isEmpty()) {
				fila.add(pilha.pop());
			}
		}
	}
	static void esvaziar() {
		while(!fila.isEmpty()) {
			fila.remove();
		}
	}
}
