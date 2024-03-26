package view;

import javax.swing.JOptionPane;

import controller.Palindromo;

public class Main {

	public static void main(String[] args) {
		Palindromo p = new Palindromo();

		String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		String palavraInvertida = p.invertePalavra(palavra);
		boolean palindromo = p.comparaPalavras(palavra, palavraInvertida);
		if (palindromo) {
			JOptionPane.showMessageDialog(null, "A palavra é um palíndromo");
		} else {
			JOptionPane.showMessageDialog(null, "A palavra não é um palíndromo");
		}

	}

}
