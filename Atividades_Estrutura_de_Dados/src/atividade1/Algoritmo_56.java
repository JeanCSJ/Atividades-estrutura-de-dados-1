package atividade1;

import java.util.Scanner;

public class Algoritmo_56 {

	public static void main(String[] args) {
		// Entrar com nome e idade. Imprimir a seguinte saída:
		//nome:
		//idade:
		
		String nome;
		int idade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite nome: ");
		nome = sc.nextLine();
		System.out.print("Digite idade: ");
		idade = sc.nextInt();
		
		System.out.println("\n\n");
		System.out.println("nome = " + nome);
		System.out.println("idade = " + idade);
		
		sc.close();
		
	}

}
