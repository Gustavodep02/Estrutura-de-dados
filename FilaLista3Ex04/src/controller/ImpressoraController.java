package controller;

import model.Fila;

public class ImpressoraController {
	
	public ImpressoraController() {
		// TODO Auto-generated constructor stub
	}
	public void insereDocumento(Fila f, String documento) {
		f.insert(documento);
	}
	public void imprime(Fila f) {
		Object removido = null;
		try {
			removido = f.remove();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Imprimindo: "+removido.toString());
		int tempo =  (int) (Math.random()*1000+1000);
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
