package atividade1;

import java.util.Scanner;

public class Algoritmo_55 {

	public static void main(String[] args) {
		//Criar um algoritmo que calcule e imprima a área de um losango. 
		
		float diagmaior, diagmenor, area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("medida da diagonal maior: ");
		diagmaior = sc.nextFloat();
		System.out.print("\nmedida da diagonal menor: ");
		diagmenor = sc.nextFloat();
		area = (diagmaior * diagmenor)/2;
		System.out.println("\narea = " + area);
		
		sc.close();
		
	}

}
