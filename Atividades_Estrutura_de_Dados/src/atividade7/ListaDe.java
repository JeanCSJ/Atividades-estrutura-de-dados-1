package atividade7;

class ListaDe {
    No inicio;
    No fim;
    
    public ListaDe() {
        this.inicio = null;
        this.fim = null;
    }

    public void exibir() {
        System.out.print("Lista(crescente) => ");
        No atual = inicio;
        while (atual != null) {
            if (atual != inicio) {
                System.out.print(", " + atual.valor);
            } else {
                System.out.print(atual.valor);
            }
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void exibirReverso() {
        System.out.print("Lista(decrescente) => ");
        No atual = fim;
        while (atual != null) {
            if (atual != fim) {
                System.out.print(", " + atual.valor);
            } else {
                System.out.print(atual.valor);
            }
            atual = atual.anterior;
        }
        System.out.println();
    }

    
    public void inserirNaPosicao(int valor, int posicao) {
        No novoNo = new No(valor);

        if (posicao == 0 || inicio == null) {
            novoNo.proximo = inicio;
            if (inicio != null) {
                inicio.anterior = novoNo;
            } else {
                fim = novoNo;
            }
            inicio = novoNo;
            return;
        }
        No atual = inicio;
        int n = 0;

        while (atual != null && n < posicao) {
            atual = atual.proximo;
            n++;
        }

        if (atual == null) {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        } else {
            No anterior = atual.anterior;
            anterior.proximo = novoNo;
            novoNo.anterior = anterior;
            novoNo.proximo = atual;
            atual.anterior = novoNo;
        }
    }

}
