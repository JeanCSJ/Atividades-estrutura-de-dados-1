package atividade5;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o numero de peças na primeira torre: ");
        int numPecas = sc.nextInt();
        
        long inicio = System.nanoTime();
        
        Torre.criarTorre(numPecas);
        Torre.moverPecas(numPecas);
        
        long fim = System.nanoTime();
        long duracao = fim - inicio;
        
        long millis = duracao / 1_000_000;
        long horas = millis / (1000 * 60 * 60);
        long minutos = (millis / (1000 * 60)) % 60;
        long segundos = (millis / 1000) % 60;
        long milissegundos = millis % 1000;
        
        System.out.printf("\nTempo de execução: %02d:%02d:%02d:%03d\n", horas, minutos, segundos, milissegundos);
        System.out.println("\nQuantidade total de movimentos: " + Torre.movimentos);
        
        sc.close();
    }
}