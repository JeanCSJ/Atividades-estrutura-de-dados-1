package atividade3;

import java.util.Scanner;

public class Algoritmo_470 {

	public static int primo(int num) {	
		int c = 0;
		int p = 2;
		while(c == 0 && p <= (num/2)) {
			if(num % p == 0) {
				c = 1;
			}
			p++;
		}
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número > 0: ");
		int num = sc.nextInt();
		if(num != 1) {
			int primo = primo(num);
			if(primo == 0) {
				System.out.println("\n" + num + " é primo");
			}else {
				System.out.println("\n" + num + " não é primo");
			}
		}else {
			System.out.println("\n" + num + " não é primo");
		}
		
		System.out.println();
		
		sc.close();
	}

}
