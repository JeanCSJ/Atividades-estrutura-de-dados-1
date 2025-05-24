package exercicio1;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<Character> pilha1 = new Stack<>();
		Stack<Character> pilha2 = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int igualdades = 0;
		int verificacoes = 0;
		int tam;
		int extra = 0;
		
		System.out.println("Digite a String que deseja verificar");
		String string = sc.nextLine();
		
		for(int n = 0; n < string.length(); n++) {
			char letra = string.charAt(n);
			pilha1.push(letra);
		}
		
		System.out.print("Inverso: ");
		for(int n = string.length(); n > 0; n--) {
			
			System.out.print(pilha1.pop());
			
			if(string.charAt(n-1) != ' ') {
				char letra = string.charAt(n-1);
				pilha2.push(letra);
				
			}
		}
		
		if(pilha2.size() % 2 == 1) {
			extra = 1;
		}
			
		tam = pilha2.size();
		for(int n = tam/ 2; n > 0; n--) {
			pilha1.push(pilha2.pop());
		}
		
		if(extra == 1) {
			pilha2.pop();
		}
		tam = pilha1.size();
		for(int n = tam; n > 0; n--) {
			verificacoes += 1;
			if(pilha1.pop() == pilha2.pop()) {
				igualdades += 1;
			}
		}
		
		System.out.println();
		System.out.print("É palindromo: ");
		
		if(verificacoes == igualdades) {
			System.out.println("Sim");
		}else {
			System.out.println("Não");
		}
		
		sc.close();
	}
}
