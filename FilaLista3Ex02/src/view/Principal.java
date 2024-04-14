package view;

import javax.swing.JOptionPane;

import controller.TelefoneController;
import model.Fila;

public class Principal {

	public static void main(String[] args) {
		TelefoneController tc = new TelefoneController();
		Fila<String> f = new Fila();
		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir Ligação\n2 - Consultar Ligação\n9 - Sair"));
			switch (opc) {
			case 1:
                String numeroTelefone = JOptionPane.showInputDialog("Digite o número do telefone");
                tc.insereLigacao(f, numeroTelefone);
                break;
			case 2:
				try {
                    tc.consultaLigacao(f);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break;
			case 9:
				System.out.println("Saindo...");
                break;
            default:
            	break;
			}
		}

	}
}
