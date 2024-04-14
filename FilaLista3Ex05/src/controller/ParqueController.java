package controller;


import entity.Pessoa;
import model.Fila;

public class ParqueController {


	public ParqueController() {
		// TODO Auto-generated constructor stub
	}

	public void brinquedo(Fila fila) {
		Pessoa p = null;
		while (!fila.isEmpty()) {
			try {
				 p = (Pessoa) fila.remove();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (p.idade >= 16 && p.altura >= 1.60) {
				System.out.println(p + " Pode entrar no brinquedo");
			} else {
				System.out.println(p + " Não pode entrar no brinquedo");
			}
		}

	}
}
