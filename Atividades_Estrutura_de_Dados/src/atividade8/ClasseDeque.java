package atividade8;

import java.util.ArrayDeque;
import java.util.Deque;

public class ClasseDeque {
	Deque<Documento> deque = new ArrayDeque<>();
	
	void adicionar_documento_normal(){
		Documento documento = new Documento();
		deque.addLast(documento.criarDocumento());
		System.out.println("Id: " + deque.getLast().id);
		System.out.println("Tipo: " + deque.getLast().tipo);
		System.out.println("Número de páginas: " + deque.getLast().numPaginas);
	}
	void adicionar_documento_urgente() {
		Documento documento = new Documento();
		deque.addFirst(documento.criarDocumento());
		System.out.println("Id: " + deque.getFirst().id);
		System.out.println("Tipo: " + deque.getFirst().tipo);
		System.out.println("Número de páginas: " + deque.getFirst().numPaginas);
	}
	void processar_proximo() {
		System.out.println("Id: " + deque.getFirst().id);
		System.out.println("Tipo: " + deque.getFirst().tipo);
		System.out.println("Número de páginas: " + deque.getFirst().numPaginas);
		System.out.println();
		deque.removeFirst();
	}
	void processar_ultimo() {
		System.out.println("Id: " + deque.getLast().id);
		System.out.println("Tipo: " + deque.getLast().tipo);
		System.out.println("Número de páginas: " + deque.getLast().numPaginas);
		System.out.println();
		deque.removeLast();
	}
	void visualizar_fila() {
		int n = 1;
		
		for(Documento doc : deque) {
			System.out.println("\tDocumento " + n);
			System.out.println("Id: " + doc.id);
			System.out.println("Tipo: " + doc.tipo);
			System.out.println("Número de páginas: " + doc.numPaginas);
			System.out.println();
			n++;
		}
	}
	void fila_vazia() {
		if(deque.isEmpty()) {
			System.out.println("Fila vazia");
		}else {
			System.out.println("Fila ainda contem documentos");
		}
	}
	void total_documentos() {
		System.out.println(deque.size());
	}
	void total_paginas() {
		int totalPaginas = 0;
		
		for (Documento doc : deque) {
			totalPaginas += doc.numPaginas;
		}
		System.out.println("Total de páginas a serem impressas: " + totalPaginas);
	}
}
