package controller;

import model.Pilha;

public class PilhaSequencia {

	public PilhaSequencia() {
		
	}
	Pilha p = new Pilha();
	
	public void sequencia (String[] vetor) {
		int tamanho = vetor.length;
		String topo =null;
		for (int j = 0 ; j<tamanho; j++) {
			p.push(vetor[j]);
		}
		for (int i = 0 ; i<tamanho; i++) {
			try {
				topo = p.top();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (topo.equals("R") || topo.equals("W")) {
				try {
					System.out.println(p.pop());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				try {
					String descarte = p.pop();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		p.push("L");
		p.push("B");
		p.push("M");
		p.push("G");
		p.push("K");
	}
}
