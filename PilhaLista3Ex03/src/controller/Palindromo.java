package controller;

import model.Pilha;

public class Palindromo {

	public Palindromo() {
		// TODO Auto-generated constructor stub
	}

	Pilha p = new Pilha();

	public boolean comparaPalavras(String palavra, String palavraInvertida) {
		if (palavra.equals(palavraInvertida)) {
			return true;
		} else {
			return false;
		}
	}

	public String invertePalavra(String palavra) {
		String palavraInvertida = "";
		int tamanho = palavra.length();
		for (int i = 0; i < tamanho; i++) {
			p.push(palavra.substring(i,i+1));
		}
		for (int j = 0; j < tamanho; j++) {
			try {
				palavraInvertida += p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return palavraInvertida;
	}
}
