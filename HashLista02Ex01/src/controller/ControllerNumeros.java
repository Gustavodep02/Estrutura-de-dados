package controller;

import br.edu.fateczl.Lista;
import model.Numeros;

public class ControllerNumeros {
	Lista[] hashNumeros ;
	
	public ControllerNumeros() {
		hashNumeros = new Lista[2];
		inicializar();
	}
	private void inicializar() {
		int tamanho = hashNumeros.length;
		for(int i =0; i<tamanho;i++) {
			hashNumeros[i] = new Lista();	
		}
	}
	
	public void adicionarNumero(Numeros numero) {
		int hash = numero.hashCode();
		hashNumeros[hash].addFirst(numero);
		
	}
	
	public void listarNumeros() {
		int tamanho = hashNumeros[0].size();
		for(int i =0 ; i<tamanho; i++) {
			try {
				System.out.println("par: "+hashNumeros[0].get(i));

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		tamanho = hashNumeros[1].size();
		for(int j = 0; j< tamanho;j++) {
			try {
				System.out.println("impar: "+hashNumeros[1].get(j));

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
