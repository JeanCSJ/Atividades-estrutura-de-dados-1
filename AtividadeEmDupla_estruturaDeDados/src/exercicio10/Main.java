package exercicio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de a: ");
		int a = sc.nextInt();
		System.out.print("Digite o valor de b: ");
		int b = sc.nextInt();
		System.out.print("O  valor de " +a + "^" + b + " é: ");
		System.out.println(Recursao.potencia(a, b));
		
		sc.close();
	}
}
