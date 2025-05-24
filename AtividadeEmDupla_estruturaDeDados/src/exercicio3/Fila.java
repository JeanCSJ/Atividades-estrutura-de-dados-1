package exercicio3;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    Queue<Aviao> filaAviao = new LinkedList<>();

    void adicionar(Aviao aviao) {
        filaAviao.add(aviao);
    }

    Aviao remove() {
        return filaAviao.poll();
    }

    int tamanho() {
        return filaAviao.size();
    }

    Aviao primeiro() {
        return filaAviao.peek();
    }

    void listarTodos() {
        if (filaAviao.isEmpty()) {
            System.out.println("Nenhum avião na fila.");
        } else {
            System.out.println("Aviões na fila:");
            for (Aviao a : filaAviao) {
                System.out.println("ID: " + a.id + " | Nome: " + a.nome);
            }
        }
    }
}
