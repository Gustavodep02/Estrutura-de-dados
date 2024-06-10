package view;

import entity.Arvore;

public class Main {
	public static void main(String[] args) {
		char [] vetor = {'M','F','S','D','J','P','U','A','E','H','Q','T','W','L'};
		Arvore arvore = new Arvore();
		int tamanho = vetor.length;
		for (int i = 0; i < tamanho; i++) {
            arvore.insertLeaf(vetor[i]);
        }
		try {
			arvore.removeChild('F');
			arvore.removeChild('U');
			arvore.prefixSearch();
			System.out.println("===================");
            arvore.infixSearch();
            System.out.println("===================");
            arvore.postfixSearch();
            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
		}
	}

}
