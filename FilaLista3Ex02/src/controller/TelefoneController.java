package controller;

import model.Fila;

public class TelefoneController{

	public TelefoneController() {
		
	}
	
	public void insereLigacao(Fila<String> f, String numeroTelefone){
		f.insert(numeroTelefone);
	}
	public void consultaLigacao(Fila<String> f) throws Exception {
        if (f.isEmpty()) {
            throw new Exception("Fila vazia");	
        } else {
        	int tamanho = f.size();
    		for (int i = 0;i<tamanho;i++) {
    			f.remove();
    		}
        }
		
    }
	
}
