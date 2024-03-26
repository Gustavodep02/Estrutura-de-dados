package view;
import javax.swing.JOptionPane;

import controller.FatController;
public class Main {

	public static void main(String[] args) {
		FatController f = new FatController();
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 0 a 10"));
		while(valor >10 ||  valor <0) {
			System.out.println("Valor invalido, digite novamente");
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 0 a 10"));
		}
		long res = f.fatorial(valor);
		System.out.println("total : "+res);
	}

}
