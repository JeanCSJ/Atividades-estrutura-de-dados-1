package atividade2;

import java.util.Scanner;

public class Algoritmo_370 {

	public static void main(String[] args) {
        int nv;
        String nvd;
        String nome[] = new String[1000];
        int voos[] = new int[1000];
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nEntre com o número de voos: ");
        nv = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < nv; i++) {
            System.out.print("\nEntre com a identificação do voo: ");
            nome[i] = scanner.nextLine();
            
            System.out.print("Entre com a quantidade de lugares disponíveis no voo " + nome[i] + ": ");
            voos[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.print("\nEntre com o número do voo desejado ou 0 para terminar: ");
        nvd = scanner.nextLine();
        
        while (!nvd.equals("0")) {
            int i = 0;
            while (i < nv - 1 && !nvd.equals(nome[i])) {
                i++;
            }
            
            if (nvd.equals(nome[i])) {
                if (voos[i] > 0) {
                    voos[i]--;
                    System.out.print("\nQual o número da identidade do cliente? ");
                    String id = scanner.nextLine();
                    System.out.println("\nIdentidade: " + id + " Voo: " + nvd + "\n");
                } else {
                    System.out.println("\nNão existem mais lugares neste voo.\n");
                }
            } else {
                System.out.println("\nNão existe este voo.\n");
            }
            
            System.out.print("\nEntre com o número do voo desejado ou 0 para terminar: ");
            nvd = scanner.nextLine();
        }
        
        System.out.println("\nFim do programa.");
        scanner.close();
    }

}
