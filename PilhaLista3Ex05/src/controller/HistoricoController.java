package controller;

import model.Pilha;

public class HistoricoController {
	Pilha p = new Pilha();

	public HistoricoController() {
		// TODO Auto-generated constructor stub
	}

	public void removerUltimo(Pilha p) {
		if (p.isEmpty()) {
            System.out.println("Pilha vazia");
        }
		try {
			p.pop();
			if (p.isEmpty()) {
				System.out.println("Ultimo endereco removido");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e = new Exception("Pilha vazia");
		}
	}

	public void adicionarHistorico(Pilha p, String endereco) {
		if (endereco.contains("https://www.") && endereco.contains(".com")) {
			p.push(endereco);
		} else {
			System.out.println("Endereco invalido");
		}
	}

	public void verificarUltimo(Pilha p) {
		try {
			System.out.println(p.top());
			if (p.size() == 1) {
				System.out.println("Ultimo endereco");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (p.isEmpty()) {
            System.out.println("Pilha vazia");
        }
	}
}
