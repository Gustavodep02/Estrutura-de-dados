package view;

import entity.Arvore;
public class Main {
	public static void main(String[] args) {
		int [] vetor = {7,8,3,4,2,1,6,5};
		Arvore arvore = new Arvore();
		int tamanho = vetor.length;
		for (int i = 0; i < tamanho; i++) {
            arvore.insertLeaf(vetor[i]);
        }
		try {
			arvore.removeChild(7);
			arvore.removeChild(6);
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
