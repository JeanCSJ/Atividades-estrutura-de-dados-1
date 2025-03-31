package atividade1;

import java.util.Scanner;

public class Algoritmo_57 {

	public static void main(String[] args) {
		//Entrar com as notas da PR 1 e PR2 e imprimir a média final: 
		//truncada:
		//arredondada:
		
		float pr1, pr2, mf;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite pr1: ");
		pr1 = sc.nextFloat();
		System.out.print("\ndigite pr2: ");
		pr2 = sc.nextFloat();
			
		sc.close();
		
		mf = (pr1 + pr2)/2;
		
		System.out.println("\nmedia truncada = " + (int)mf);
		System.out.println("media arredondada = " + Math.round(mf));	
		
	}

}
