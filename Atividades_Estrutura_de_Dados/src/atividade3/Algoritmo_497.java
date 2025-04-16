package atividade3;

import java.util.Scanner;

public class Algoritmo_497 {
	
	public static void ordena(int vet[], int tam) {
        for (int L1 = 0; L1 < tam - 1; L1++) {
            for (int c1 = L1 + 1; c1 < tam; c1++) {
                if (vet[L1] > vet[c1]) {
                    int aux = vet[L1];
                    vet[L1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }

    public static int busca(int vet[], int tam, int chave) {
        int ini = 0;
        int fim = tam - 1;
        int meio;

        while (ini <= fim) {
            meio = (ini + fim) / 2;
            if (chave == vet[meio]) {
                return meio;
            } else {
                if (chave < vet[meio]) {
                    fim = meio - 1;
                } else {
                    ini = meio + 1;
                }
            }
        }

        return -1;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int n, c;

        for (int L = 0; L < 10; L++) {
            System.out.print("Digite numero " + (L + 1) + ": ");
            num[L] = sc.nextInt();
        }

        System.out.print("Digite numero de busca: ");
        n = sc.nextInt();

        ordena(num, 10);
        c = busca(num, 10, n);

        System.out.println("\nVETOR");
        for (int L = 0; L < 10; L++) {
            System.out.println((L + 1) + " - " + num[L]);
        }

        c++;

        if (c != 0) {
            System.out.println("\n\nPosição no vetor: " + c);
        } else {
            System.out.println("\n\nNÃO ENCONTRADO");
        }

        sc.close();

	}

}
