package view;

import java.util.regex.Matcher;
import javax.swing.JOptionPane;

import controller.ImpressoraController;
import model.Fila;

public class Principal {

	public static void main(String[] args) {
		Fila f = new Fila();
		ImpressoraController ic = new ImpressoraController();
		
		int opc = 0;
		while(opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar documento\n2 - Imprimir\n9 - Sair"));
			switch(opc) {
			case 1:
                String documento = JOptionPane.showInputDialog("Digite o documento");
                if(documento.contains(";")) {
                	ic.insereDocumento(f, documento);
                	System.out.println("Documento inserido");
                }else {
                	JOptionPane.showMessageDialog(null, "Formato inválido");
                }
                
                break;
			case 2:
				ic.imprime(f);
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
