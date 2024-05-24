package view;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		long[] tabela = new long[88];
		long telefone = Long.parseLong(JOptionPane.showInputDialog("Digite o telefone"));
		
		int hash = (int)telefone / 1000000000;
		
		tabela[hash] = telefone;
		System.out.println("Telefone: " + tabela[hash]+ ", posicao "+hash);
	}

}
