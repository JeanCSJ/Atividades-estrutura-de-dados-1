package exercicio9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a lista: ");
		String lista = sc.nextLine();
		
		String[] numeros = lista.trim().split("\\s+");
		
		Recursao.soma(numeros, (numeros.length - 1));
		
		System.out.println("Resultado da soma dos numeros da lista: " + Recursao.total);
		
		sc.close();
	}
}
