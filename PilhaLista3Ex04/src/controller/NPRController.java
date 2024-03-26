package controller;

import javax.swing.JOptionPane;

import model.Pilha;

public class NPRController {

	public NPRController() {

	}

	Pilha p = new Pilha();

	public void insereValor(Pilha p, int valor) {// adiciona valor a pilha
		String[] opcoes = new String[] { "Sim", "Não" };
		p.push(valor);
		int retorno = 0;
		while (retorno == 0) {
			retorno = JOptionPane.showOptionDialog(null, "Vc deseja digitar mais numeros?", "Mensagem de Confirmação",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			if(retorno==0) {
				int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
				p.push(num);
			}
		}
	}

	public int npr(Pilha p, String op) {
		int valor1 = 0;
		int valor2 = 0;
		int res =0;
		if (p.size() >= 2) {
			try {//pega os valores a realizar o calculo
				valor1 = p.pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				valor2 = p.pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (op.equals("+")) {// realiza a soma

				res = valor1 + valor2;
			}else if(op.equals("-")) {//realiza a subtração
				res = valor2 - valor1;
			}else if(op.equals("*")) {//realiza a multiplicação
                res = valor1 * valor2;
		}else if (op.equals("/")) {//realiza a divisão
            	res = valor2 / valor1;
        }
	}else {
		JOptionPane.showMessageDialog(null, "Não há valores suficientes para realizar a operação");
		System.exit(0);
    }
	
		p.push(res);
		return res;
}
	}

