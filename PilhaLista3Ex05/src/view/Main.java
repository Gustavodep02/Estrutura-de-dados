package view;

import javax.swing.JOptionPane;

import controller.HistoricoController;
import model.Pilha;

public class Main {

	public static void main(String[] args) {
		HistoricoController h = new HistoricoController();
		Pilha historico = new Pilha();
		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"1 - Adicionar Historico\n2- Remover ultimo endereco\n3- Verificar ultimo endereco\n9- Sair"));
			switch (opc) {
			case 1:
				h.adicionarHistorico(historico, JOptionPane.showInputDialog("Digite o endereco"));
				break;

			case 2:
				h.removerUltimo(historico);
				break;
			case 3:
				h.verificarUltimo(historico);
				break;
			default:
				break;

			}
		}

	}
}
