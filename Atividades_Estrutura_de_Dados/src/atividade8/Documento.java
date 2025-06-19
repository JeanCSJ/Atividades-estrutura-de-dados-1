package atividade8;

import java.util.ArrayList;
import java.util.Random;

public class Documento {
    int id;
    String tipo;
    int numPaginas;

    static ArrayList<Integer> ids = new ArrayList<>();
    static Random random = new Random();
    String tipos[] = {"PDF", "TXT", "JPG", "PNG", "DOCX", "XLSX"};

    static void gerarIds() {
        ArrayList<Integer> idsTemp = new ArrayList<>();

        for (int n = 1; n <= 1000; n++) {
            idsTemp.add(n);
        }

        for (int n = 0; n < 1000; n++) {
            int posicao = random.nextInt(idsTemp.size());
            ids.add(idsTemp.get(posicao));
            idsTemp.remove(posicao);
        }
    }
    Documento criarDocumento() {
    	this.id = ids.get(0);
    	ids.remove(0);
    	this.tipo = tipos[random.nextInt(tipos.length)];
    	this.numPaginas = random.nextInt(100 + 1);
    	return this;
    }
}
