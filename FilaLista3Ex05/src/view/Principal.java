package view;

import controller.ParqueController;
import entity.Pessoa;
import model.Fila;

public class Principal {

	public static void main(String[] args) {
		
		ParqueController pc = new ParqueController();
		Fila<Pessoa> f = new Fila();
		for (int i = 0; i < 30; i++) {
			Pessoa p = new Pessoa();
			int idade = (int) (Math.random() * 30 + 10);
			double alturaD =  1.35 + Math.random() * (2.0 - 1.35);
			float altura = (float) alturaD;
			p.nome = "Pessoa " + (i+1);
			p.idade = idade;
			p.altura = altura;
            f.insert(p);
        }
		pc.brinquedo(f);
	}

}
