package atividade1;
	
	import java.util.Scanner;

public class Algoritmo_23 {
	
	
	
	public static void main(String[] args) {
		int a,d;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número de três casas: ");
		a = sc.nextInt();
		
		sc.close();
		
		d = (a % 100)/10;
		
		System.out.println("\nalgarismo da casa das dezenas: " + d);

	}

}
