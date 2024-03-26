package view;

import javax.swing.JOptionPane;

import controller.NPRController;
import model.Pilha;

public class Main {

	public static void main(String[] args) {
		NPRController npr = new NPRController();
		Pilha p = new Pilha();

		int retorno = 0;
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digitar um numero "));
		npr.insereValor(p, num);
		String op = JOptionPane.showInputDialog("Digite a operação:");
		int res = npr.npr(p, op);
		System.out.println(res);
		while (retorno != 9) {
			int opc = Integer
					.parseInt(JOptionPane.showInputDialog("1- Digitar mais numeros\n2- Digitar operacao\n9- sair: "));
			switch (opc) {
			case 1:
				num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
				npr.insereValor(p, num);
				break;
			case 2:
				op = JOptionPane.showInputDialog("Digite a operação: ");
				res = npr.npr(p, op);
				System.out.println(res);
				break;
				case 9:
					retorno = 9;
                    break;
			default:
				break;
			}
		}
	}
}
