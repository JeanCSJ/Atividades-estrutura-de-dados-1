package atividade2;

import java.util.Scanner;

public class Algoritmo_360 {

	public static void main(String[] args) {
		String signo[] = new String[12];
		int ultDia[] = new int[12];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 12; i++) {
			System.out.print("\nDigite o signo: ");
			signo[i] = sc.nextLine();
			System.out.print("Digite o último dia do signo: ");
			ultDia[i] = Integer.parseInt(sc.nextLine());
		}
		while (true) {
			System.out.print("\nDigite a data no formato ddmm ou 9999 para terminar: ");
			int data = Integer.parseInt(sc.nextLine());
			if (data == 9999) {
				break;
			}
			int dia = data / 100;
			int mes = (data % 100) - 1;
			if (dia > ultDia[mes]) {
				mes = (mes + 1) % 12;
			}
			System.out.println("Signo: " + signo[mes]);
		}
		sc.close();
	}

}
