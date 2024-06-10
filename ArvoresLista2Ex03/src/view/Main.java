package view;

import entity.Arvore;

public class Main {
	public static void main(String[] args) {
		char [] vetor = {'k','d','m','b','c','f','l','t','p','z','r'};
		Arvore arvore = new Arvore();
		int tamanho = vetor.length;
		for (int i = 0; i < tamanho; i++) {
			arvore.insertLeaf(vetor[i]);
		}
		try {
			arvore.removeChild('m');
			arvore.prefixSearch();
			System.out.println("===================");
			arvore.infixSearch();
			System.out.println("===================");
			arvore.postfixSearch();
			arvore.search('r');
		}catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
}
