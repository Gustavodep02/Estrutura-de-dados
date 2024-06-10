package view;

import entity.Arvore;

public class Main {
	public static void main(String[] args) {
		int [] vetor = {30,15,60,10,20,40,80};
		Arvore arvore = new Arvore();
		int tamanho = vetor.length;
		for (int i = 0; i < tamanho; i++) {
            arvore.insertLeaf(vetor[i]);
        }
		try {
			arvore.prefixSearch();
			System.out.println("===================");
            arvore.infixSearch();
            System.out.println("===================");
            arvore.postfixSearch();
            
            arvore.removeChild(60);
            System.out.println("Removendo 60");
            System.out.println("===================");
            arvore.infixSearch();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
		}
	}
}
