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
    public void remover(int posicao) {
        if (posicao < 0) return;

        No atual = inicio;
        int n = 0;

        while (atual != null && n < posicao) {
            atual = atual.proximo;
            n++;
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
    }
    public void removerPrimos() {
        No atual = inicio;
        int posicao = 0;

        while (atual != null) {
            int valor = atual.valor;
            boolean primo = false;
            No proximo = atual.proximo;

            if (valor > 1) {
                if (valor == 2) {
                    primo = true;
                } else if (valor % 2 != 0) {
                    for (int i = 3; i <= Math.sqrt(valor); i += 2) {
                        if (valor % i == 0) {
                        	primo = true;
                            break;
                        }
                    }
                }
            }

            if (primo) {
                remover(posicao);
                atual = proximo;
            } else {
                atual = proximo;
                posicao++;
            }
        }
    }
}
