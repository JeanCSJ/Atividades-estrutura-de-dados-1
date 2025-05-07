package atividade4;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> pilha = new Stack<>();
		
		System.out.println("Digite o texto a ser modificado:");
		String texto = sc.nextLine();
		System.out.println("\nResultado:");
		
		for(int posicao = 0; posicao < texto.length(); posicao++) {
			if(texto.charAt(posicao) != ' ') {
				pilha.push(texto.charAt(posicao));
			}else {
				while(pilha.empty() == false){
					System.out.print(pilha.pop());
				}
				System.out.print(' ');
			}
		}
		while(pilha.empty() == false){
			System.out.print(pilha.pop());
		}
		sc.close();
	}
}
