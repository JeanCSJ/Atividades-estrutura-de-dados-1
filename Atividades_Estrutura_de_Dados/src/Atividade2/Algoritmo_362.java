package atividade2;

import java.util.Scanner;

public class Algoritmo_362 {

	public static void main(String[] args) {
        int L = 0;
        int vet1[] = new int[10];
        int vet2[] = new int[20];
        int vetc[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nEntrada de dados do vetor 1 (10 elementos)");
        for (int i = 0; i < 10; i++) {
            System.out.print("Entre com " + (i + 1) + "º elemento: ");
            vet1[i] = scanner.nextInt();
        }
        
        System.out.println("\nEntrada de dados do vetor 2 (20 elementos)");
        for (int i = 0; i < 20; i++) {
            System.out.print("Entre com " + (i + 1) + "º elemento: ");
            vet2[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            vetc[i] = -999999999;
        }
        for (int i = 0; i < 10; i++) {
            int c = 0;
            while (c < 20 && vet1[i] != vet2[c]) {
                c++;
            }
            
            if (c < 20) {
                int d = 0;
                while (d < L && vet1[i] != vetc[d]) {
                    d++;
                }
                
                if (d == L) {
                    vetc[d] = vet1[i];
                    L++;
                }
            }
        }
        
        if (L > 0) {
            System.out.println("\n\nElementos comuns:\n");
            for (int i = 0; i < L; i++) {
                System.out.println(vetc[i]);
            }
        } else {
            System.out.println("\n\nNão existem elementos comuns");
        }
        
        scanner.close();
    }

}
