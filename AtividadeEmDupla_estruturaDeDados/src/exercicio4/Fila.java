package exercicio4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Fila {
	static Random sortear = new Random();
	static Queue<Integer> F1 = new LinkedList<>();
	static Queue<Integer> F2 = new LinkedList<>();
	static Stack<Integer> pilha = new Stack<>();
	
	static void criar() {
		for(int n = 100; n > 0; n--) {
			F1.add(sortear.nextInt(100));
		}
	}
	static void inverter() {
		if(F1.isEmpty()) {
			System.out.println("Ainda não foi criada uma fila");
		}else {
			while(!F1.isEmpty()) {
				pilha.push(F1.poll());
			}
			while(!pilha.isEmpty()) {
				F2.add(pilha.pop());
			}
		}
	}
	static void esvaziar() {
		for(int n = 100; n > 0; n--) {
			F1.remove();
		}
	}
}
