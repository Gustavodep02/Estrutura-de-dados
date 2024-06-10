package view;

import entity.Arvore;

public class Main {
	public static void main(String[] args) {
		int [] vetor = {33,15,41,38,57,34,49,43};
		Arvore arvore = new Arvore();
		int tamanho = vetor.length;
		for (int i = 0; i < tamanho; i++) {
            arvore.insertLeaf(vetor[i]);
        }
		try {
			arvore.prefixSearch();
			arvore.infixSearch();
			arvore.postfixSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
