package view;
import controller.ConverteController;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int valor = (Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro ate 1000: ")));
		if (valor>1000) {
            JOptionPane.showMessageDialog(null, "Valor invalido");
            System.exit(0);
        }
		ConverteController c = new ConverteController();
		String binario = c.decToBin(valor);
		JOptionPane.showMessageDialog(null, "Valor em binário: " + binario);

	}

}
