package atividade2;

import java.util.Scanner;

public class Algoritmo_394 {

	public static void main(String[] args) {
		String nome[] = new String[50];
		float n1[] = new float[50];
		float n2[] = new float[50];
		float media[] = new float[50];
		int opcao, flag = 0, flag1 = 0, flag2 = 0, flag3 = 0;
		int[] tamanho = new int[50];
		Scanner scInt = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
		Scanner scFloat = new Scanner(System.in);
		
		do{
			System.out.println();
			System.out.println("MENU:");
			System.out.println("1 - Entrar nomes");
			System.out.println("2 - Entrar 1° notas");
			System.out.println("3 - Entrar 2° notas");
			System.out.println("4 - Calcular médias");
			System.out.println("5 - Listar no display");
			System.out.println("6 - sair");
			System.out.print("\tOpção: ");
			opcao = scInt.nextInt();
			switch(opcao){
				case 1:
					for(int i = 0; i < 50; i++) {
						System.out.print("Digite  o "+(i+1)+"° nome(com ate 30 caracteres e todas as letra maiusculas: ");
						nome[i] = scStr.nextLine();
						while(nome[i].length() > 30){
							System.out.print("Nome com ate 30 caracteres. Digite o "+(i+1)+"° nome(com ate 30 caracteres e todas as letra maiusculas: ");
							nome[i] = scStr.nextLine();
						}
						tamanho[i] = nome[i].length();
						for(int c = 0; c <= (30 - tamanho[i]); c++) {
							nome[i] += " ";
						}
						flag = 1;
					}
					break;
					
				case 2:
					if(flag == 0) {
						System.out.println("NÃO TEM NOME CADASTRADO");
					}else {
						for(int i = 0; i < 50; i++) {
							System.out.println("Digite a 1° nota: ");
							n1[i] = scFloat.nextFloat();
						}
						flag1 = 1;
					}
					break;
					
				case 3:
					if(flag == 0) {
						System.out.println("NÃO TEM NOME CADASTRADO");
					}else {
						for(int i = 0; i < 50; i++) {
							System.out.println("Digite a 2° nota: ");
							n2[i] = scFloat.nextFloat();
						}
						flag2 = 1;
					}
					break;
					
				case 4:
					if(flag==0 || flag1==0 || flag2 ==0) {
						System.out.println("NEM TODOS OS DADOS ESTAO CADASTRADOS");
					}else {
						for(int i = 0; i < 50; i++) {
							media[i] = (n1[i]*3 + n2[i]*7)/10;
						}
						System.out.println("Médias cadastradas.");
						flag3 = 1;
					}
					break;
					
				case 5:
					if(flag==0 || flag1==0 || flag2==0 || flag3==0) {
						System.out.println("NEM TODOS OS DADOS ESTAO CADASTRADOS");
					}else {
						System.out.println("\nNOME\t\t\t\tNOTA1\tNOTA2\tMEDIA");
						for(int i = 0; i < 50; i++) {
							System.out.println(nome[i] + "\t" + n1[i] + "\t" + n2[i]+  "\t" + media[i]);
						}
					}
					break;
					
				default:
					if(opcao != 6) {
						System.out.println("OPÇÃO NÃO DISPONIVEL");
					}else {
						System.out.println("Encerrando programa");
					}
					break;
			}
			
		} while(opcao != 6);
		scInt.close();
		scStr.close();
		scFloat.close();
	}

}
