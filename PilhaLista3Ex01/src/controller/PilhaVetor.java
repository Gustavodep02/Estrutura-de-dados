package controller;

import model.Pilha;

public class PilhaVetor {

	public PilhaVetor() {
		// TODO Auto-generated constructor stub
	}
	Pilha p = new Pilha();
	public void pilha (int[] vetor) {
		int valor1=0;
		int valor2=0;
		int tamanho = vetor.length;
		for(int i = 0; i<tamanho;i++) {
			if (vetor[i] >=0) {
				p.push(vetor[i]);
			}else {
				
				try {
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
				int res = valor1+valor2;
				p.push(vetor[i]);
				p.push(res);
				
			}
		}
		System.out.println(p.size());
	}
}
