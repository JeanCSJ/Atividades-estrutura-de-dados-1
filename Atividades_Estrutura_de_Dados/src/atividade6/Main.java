package atividade6;

public class Main {

	static int questao = 1;
	
	public static void main(String[] args) {
		//1
		numQuestao();
		ListaDe lista = new ListaDe();
		lista.inserir("Homer");
		lista.inserir("Marge");
		lista.exibir();
		//2
		numQuestao();
		lista.esvaziar();
		lista.exibir();
		//3
		numQuestao();
		lista.inserirNaPosicao("Bart", 0);
		lista.inserirNaPosicao("Moll", 1);
		lista.exibir();
		//4
		numQuestao();
		lista.esvaziar();
		//5
		numQuestao();
		lista.inserir("Homer");
		lista.inserir("Bart");
		lista.inserirNaPosicao("Lisa", 0);
		lista.exibir();
		System.out.println("Tamanho da lista: " + lista.tamanho());
		//6
		numQuestao();
		lista.esvaziar();
		lista.exibir();
		//7
		numQuestao();
		lista.inserir("Homer");
		lista.inserir("Maggie");
		lista.inserirNaPosicao("Bart", 0);
		lista.inserirNaPosicao("Marge", 1);
		lista.exibir();
		lista.verificarElemento("Lisa");
		//8
		numQuestao();
		lista.esvaziar();
		//9
		numQuestao();
		lista.inserir("Homer");
		lista.inserir("Bart");
		lista.exibir();
		System.out.println("Tamanho da lista: " + lista.tamanho());
		//10
		numQuestao();
		lista.verificarElemento("Marge");
		lista.verificarElemento("Homer");
		lista.verificarElemento("Bart");
		lista.verificarElemento("Maggie");
		//11
		numQuestao();
		lista.esvaziar();
		//12
		numQuestao();
		lista.inserirNaPosicao("Homer", 0);
		lista.inserirNaPosicao("Bart", 0);
		lista.inserir("Marge");
		lista.inserirNaPosicao("Maggie", 1);
		lista.inserirNaPosicao("Ned Flanders", 0);
		lista.inserir("Sr. Burns");
		lista.exibir();
		//13
		numQuestao();
		lista.removerNaPosicao(lista.tamanho() - 1);
		lista.exibir();
		//14
		numQuestao();
		lista.removerNaPosicao(1);
		lista.exibir();
		System.out.println("Tamanho da lista: " + lista.tamanho());
		//15
		numQuestao();
		lista.verificarElemento("Marge");
		lista.verificarElemento("Homer");
		lista.verificarElemento("Bart");
		lista.verificarElemento("Maggie");
		//16
		numQuestao();
		lista.removerNaPosicao(0);
		lista.exibir();
		System.out.println("Tamanho da lista: " + lista.tamanho());
		//17
		numQuestao();
		lista.verificarElemento("Marge");
		lista.verificarElemento("Homer");
		lista.verificarElemento("Bart");
		lista.verificarElemento("Maggie");
		//18
		numQuestao();
		lista.esvaziar();
		lista.exibir();
	}
	
	static void numQuestao() {
		System.out.println("\nQuestão " + questao + ": ");
		questao += 1;
	}
	
}
