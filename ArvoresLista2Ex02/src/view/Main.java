package view;

import entity.Arvore;
import entity.No;

public class Main {
public static void main(String[] args) {
	int [] vetor = {12,4,2,8,6,16};
	Arvore arvore = new Arvore();
	int tamanho = vetor.length;
	for (int i = 0; i < tamanho; i++) {
		arvore.insertLeaf(vetor[i]);
	}
	try {
		arvore.search(6);
		arvore.removeChild(12);
		arvore.postfixSearch();
	}catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

}
}
