package Atividade2;

import java.util.Scanner;

public class Algoritmo_346 {

	public static void main(String[] args) {
		String frase;
		int op, x, tam;
		Scanner scint = new Scanner(System.in);
		Scanner scstr = new Scanner(System.in);
		
		do {
			System.out.println("MENU");
			System.out.println("1 - Imprime o comprimento da frase");
			System.out.println("2 - Imprime os dois primeiros e os dois ultimos caracteres da frase");
			System.out.println("3 - Imprime a frase espelhada");
			System.out.println("4 - Termina o algoritmo");
			System.out.print("OPÇÃO: ");
			op = scint.nextInt();
			switch (op) {
				case 1:
					//Imprime o comprimento da frase
					System.out.print("Digite uma frase: ");
					frase = scstr.nextLine();
					System.out.println("numero de caracteres da frase: " + frase.length() + "\n");
					break;
				case 2:
					//Imprime os dois primeiros e os dois ultimos caracteres da frase
					System.out.print("Digite uma frase: ");
					frase = scstr.nextLine();
					System.out.println("nos dois primeiros caracteres: " + frase.charAt(0) + frase.charAt(1));
					tam = frase.length();
					System.out.println("nos dois ultimos caracteres: " + frase.charAt(tam-2) + frase.charAt(tam-1)+"\n");
					break;
				case 3:
					//Imprime a frase espelhada
					System.out.print("Digite uma frase: ");
					frase = scstr.nextLine();
					System.out.print("frase espelhada: ");
					for(x = frase.length()-1; x>=0; x--) {
						System.out.print(frase.charAt(x));
					}
					System.out.println("\n");
					break;
				default:
					//Termina o algoritmo
					if(op == 4) {
						System.out.print("Fim do algoritimo");
					} else {
						System.out.println("Opção inválida");
					}
					break;
			}
			
		} while (op != 4);
		
		scint.close();
		scstr.close();
	}

}
