package controller;

import entity.Chocolate;
import model.Lista;

public class ControllerChocolate {
	Lista[] hashTableChocolate;
	public ControllerChocolate() {
		hashTableChocolate = new Lista[5];
        inicializarHashTable();
	}
	private void inicializarHashTable() {
        int tamanho = hashTableChocolate.length;
        for (int i = 0; i < tamanho; i++) {
            hashTableChocolate[i] = new Lista();
        }
    }
	
	public void adicionarChocolate(Chocolate chocolate) {
		int hash = chocolate.hashCode();
		try {
            hashTableChocolate[hash].addLast(chocolate);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public Chocolate buscarChocolate(Chocolate chocolate) throws Exception {
        int hash = chocolate.hashCode();
        int tamanho = hashTableChocolate[hash].size();
        for (int i = 0; i < tamanho; i++) {
            Chocolate c;
            try {
                c = (Chocolate) hashTableChocolate[hash].get(i);
                if (c.volume == chocolate.volume) {
                    chocolate.tipo = c.tipo;
                    break;
            }} catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (chocolate.tipo == null) {
            throw new Exception("Chocolate nao encontrado");
        }
        return chocolate; 
    }
	
	public void removerChocolate(Chocolate volume) {
		int hash = volume.hashCode();
		int tamanho = hashTableChocolate[hash].size();
        for (int i = 0; i < tamanho; i++) {
            Chocolate c;
            try {
                c = (Chocolate) hashTableChocolate[hash].get(i);
                if (c.volume == volume.volume) {
                    hashTableChocolate[hash].remove(i);
                    break;
            }} catch (Exception e) {
                e.printStackTrace();
            }
        }
	}
	
}
