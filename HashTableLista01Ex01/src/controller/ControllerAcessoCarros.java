package controller;

import entity.Morador;
import model.Lista;

public class ControllerAcessoCarros {
	
	Lista[] hashTableAcesso;
	
	public ControllerAcessoCarros() {
        hashTableAcesso = new Lista[20];
        inicializarHashTable();
    }

	private void inicializarHashTable() {
		int tamanho = hashTableAcesso.length;
		for (int i = 0; i < tamanho; i++) {
            hashTableAcesso[i] = new Lista();
        }
		
	}
    
    public void adicionarMorador(Morador numeroApartamento) {
    	int hash = numeroApartamento.hashCode();
    	try {
			hashTableAcesso[hash].addLast(numeroApartamento);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public Morador buscarMorador(Morador numeroApartamento) throws Exception {
    	int hash = numeroApartamento.hashCode();
    	int tamanho = hashTableAcesso[hash].size();
    	for (int i = 0; i < tamanho; i++) {
    		Morador m;
			try {
				m = (Morador) hashTableAcesso[hash].get(i);
				if (m.numeroApartamento == numeroApartamento.numeroApartamento) {
					numeroApartamento.nome = m.nome;
					numeroApartamento.modeloCarro = m.modeloCarro;
					numeroApartamento.placaCarro = m.placaCarro;
					numeroApartamento.corCarro = m.corCarro;
					break;
			}} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
    		}
    	}
    	if (numeroApartamento.nome == null) {
    		throw new Exception("Morador nao encontrado");
    	}
    	return numeroApartamento; 
    }
    
    public void removeMorador(Morador numeroApartamento) {
    	int hash = numeroApartamento.hashCode();
    	int tamanho = hashTableAcesso[hash].size();
    	for (int i = 0; i < tamanho; i++) {
    		Morador m;
    		try {
				m = (Morador) hashTableAcesso[hash].get(i);
				if (m.numeroApartamento == numeroApartamento.numeroApartamento) {
					hashTableAcesso[hash].remove(i);
					break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    	

}
    public void listarAndar(int andar) {
		int hash = (andar / 100) - 1;
		int tamanho = hashTableAcesso[hash].size();
		for (int i = 0; i < tamanho; i++) {
            Morador m;
            try {
                m = (Morador) hashTableAcesso[hash].get(i);
                System.out.println(m.toString());
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
		
	}
}