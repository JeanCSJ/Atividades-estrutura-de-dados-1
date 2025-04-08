package atividade2;

import java.util.Scanner;

public class Algoritmo_358 {

	public static void main(String[] args) {
		float lucroBruto,lucroporcento;
		int totLucroMenor10 = 0, totLucroMenor20 = 0, totLucroMaior20 = 0;
		float[] precoCompra = new float[100];
		float[] precoVenda = new float[100];
		Scanner sc = new Scanner(System.in);

		for(int A = 0; A < 100; A++) {
			System.out.print("\nPreço de compra: ");
			precoCompra[A] = sc.nextFloat();
			System.out.print("Preço de venda: ");
			precoVenda[A] = sc.nextFloat();
			lucroBruto = (precoVenda[A] - precoCompra[A]);
			lucroporcento = (lucroBruto*100) / precoCompra[A];
			
			if(lucroporcento < 10) {
				totLucroMenor10++;
			} else if(lucroporcento <= 20) {
				totLucroMenor20++;
			} else {
				totLucroMaior20++;
			}
		}
		System.out.println("\nTotal de mercadorias com lucro < 10%: " + totLucroMenor10);
		System.out.println("Total de mercadorias com 10% <= lucro <= 20%: " + totLucroMenor20);
		System.out.println("Total de mercadorias com lucro > 20%: " + totLucroMaior20);

		sc.close();
	}
}
