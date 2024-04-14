package controller;

import entity.Processo;
import model.Fila;

public class EscalonadorController {

	public EscalonadorController() {

	}

	public void escalonador(Fila<Processo> f, Processo p) {

		if (p.qtdRetorno >= 1) {
			try {
				p = f.remove();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			p.qtdRetorno--;
			f.insert(p);

		}
		
	}
}
