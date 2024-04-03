package view;

import javax.swing.JOptionPane;

import controller.FilaController;
import entity.Cliente;
import entity.ClientePrioritario;
import model.Fila;

public class Principal {

	public static void main(String[] args)throws Exception {
		Fila<Cliente> fila = new Fila<>();
		Fila<ClientePrioritario> filaPrioritarios = new Fila<>();
		FilaController f = new FilaController(fila,filaPrioritarios);
		
		int opc = 0;
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1- Adicionar cliente\n2- Adicionar cliente prioritário\n3- Atender cliente\n9- Sair"));
			switch(opc) {
			case 1:
                f.adicionarCliente();
                break;
			case 2:
				f.adicionarClientePrioritario();
				break;
			case 3:
				f.atenderCliente();
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
