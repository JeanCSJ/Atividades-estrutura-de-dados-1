package exercicio8;

import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

public class TestaPilha {
	static Stack<Integer> N = new Stack<>();
	static Stack<Integer> P = new Stack<>();
	static Stack<Integer> numAleatorios = new Stack<>();
	static Stack<Integer> numRemovidos = new Stack<>();
	
	static void criarpilha(){
		for(int n = 1000; n > 0; n--) {
			int num = ThreadLocalRandom.current().nextInt(-100, 101);
			numAleatorios.push(num);
		}
		System.out.print("Numeros sorteados: " + numAleatorios);
		System.out.println();
		
		while(!numAleatorios.isEmpty()) {
			if(numAleatorios.peek() > 0) {
				P.push(numAleatorios.pop());
			}else if(numAleatorios.peek() < 0) {
				N.push(numAleatorios.pop());
			}else {
				numAleatorios.pop();
				if(!P.isEmpty()) {
					numRemovidos.push(P.pop());
				}
				
				if(!N.isEmpty()) {
					numRemovidos.push(P.pop());
				}
			}
		}
	}
	
	static void imprimirPilhas() {
		System.out.println("Pilha P: " + P);
        System.out.println("Pilha N: " + N);
        System.out.println("Números removidos das pilhas P e N: " + numRemovidos);
	}
}