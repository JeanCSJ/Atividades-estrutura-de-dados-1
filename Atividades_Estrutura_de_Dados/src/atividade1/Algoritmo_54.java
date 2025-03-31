package atividade1;

import java.util.Scanner;

public class Algoritmo_54 {

	public static void main(String[] args) {
		
		float a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a base: ");
		
		
		b = sc.nextFloat();
		System.out.print("\nEntre a altura do um triângulo: ");
		a = sc.nextFloat();
		System.out.println("\nArea = " + (a * b)/2);
		
		sc.close();
		
		
		
		//						Versão mais completa
		
		//do {
			//b = sc.nextFloat();
			//if (b <= 0)
				//System.out.print("\nValor inválido, entre com o valor da base novamente: ");
		//}
		//while (b <= 0);
		
		//System.out.print("\nEntre a altura do um triângulo: ");
		
		//do {
			//a = sc.nextFloat();
			//if (a <= 0)
				//System.out.print("\nValor inválido, entre com o valor da base novamente: ");
		//}
		//while (a <= 0);
		
		//System.out.println("\nArea = " + (a * b)/2);
		
		//sc.close();
		
	}

}
