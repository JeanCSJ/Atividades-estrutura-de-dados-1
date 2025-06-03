package atividade6;

class ListaDe {
    No inicio;
    No fim;
    
    public ListaDe() {
        this.inicio = null;
        this.fim = null;
    }

    public void inserir(String valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public void exibir() {
    	System.out.print("Conteúdo da lista: ");
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
    
    public void inserirNaPosicao(String valor, int posicao) {
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
    
    public int tamanho() {
    	System.out.print("Tamanho da lista: ");
        int contador = 0;
        No atual = inicio;
        while (atual != null) {
            contador++;
            atual = atual.proximo;
        }
        return contador;
    }
    
    public void esvaziar() {
        inicio = null;
        fim = null;
        System.out.println("Lista esvaziada");
    }
    
    public void verificarElemento(String valor) {
        No atual = inicio;
        boolean encontrado = false;

        while (atual != null) {
            if (atual.valor.equals(valor)) {
                System.out.println(valor + " está na lista");
                encontrado = true;
                break;
            }
            atual = atual.proximo;
        }

        if (!encontrado) {
            System.out.println(valor + " não está na lista");
        }
    }
    
    public void removerNaPosicao(int posicao) {
        if (posicao < 0) return;

        No atual = inicio;
        for (int i = 0; i < posicao && atual != null; i++) {
            atual = atual.proximo;
        }

        if (atual == null) return;

        if (atual.anterior != null) {
            atual.anterior.proximo = atual.proximo;
        } else {
            inicio = atual.proximo;
        }

        if (atual.proximo != null) {
            atual.proximo.anterior = atual.anterior;
        } else {
            fim = atual.anterior;
        }

        atual = null;
    }

}
