package exercicio2;

import java.util.Stack;
import java.util.Random;

public class Pilha {
	static Stack<Integer> pilha1 = new Stack<>();
	static Stack<Integer> pilha2 = new Stack<>();
	static Random numAleatorio = new Random();
	
	static int criarpilha(){
		
		for(int n = 20; n > 0; n--) {
			pilha1.push(numAleatorio.nextInt(10)+1);
		}
		System.out.println("A pilha foi criada");
		return 1;
	}
	
	static void exibirPilha(){
		System.out.println();
		int tam = pilha1.size();
		for(int n = tam; n > 0; n--) {
			System.out.print(pilha1.peek() + " ");
			pilha2.push(pilha1.pop());
			
		}
		System.out.println();
		
		for(int n = tam; n > 0; n--)
			pilha1.push(pilha2.pop());
	}
	
	static int procurarChave(int chave) {
		return pilha1.search(chave);
	}
	
	static void removerChave(int chave) {
		int tam = pilha1.size();
		for(int n = tam; n > 0; n--) {
			if(pilha1.peek() == chave) {
				pilha1.pop();
			}else {
				pilha2.push(pilha1.pop());
			}
		}
		
		tam = pilha2.size();
		for(int n = tam; n > 0; n--) {
			pilha1.push(pilha2.pop());
		}
		System.out.println("Chave removida, Selecione 2 para visualizar a nova pilha");
	}
	
	static int removerPilha() {
		while(!pilha1.isEmpty()) {
			pilha1.pop();
		}
		System.out.println("A pilha foi removida");
		return 0;
	}
}
