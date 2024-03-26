package controller;

import model.No;

public class FatController {
	
	No topo;
	public FatController() {
	}
	public long fatorial(int valor){
		push(valor);
		long total = 1;
		try {
			while(top()-1 >=1 ) {
				long ultimo = top();
				total *=  ultimo; 
				push(top()-1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return total;
	}
	public boolean isEmpty(	) {
		if (topo == null) {
			return true;
		}else {
			return false;
		}
	}
	public void push(int e) {
		No elemento = new No();
		elemento.dado = e;
		elemento.proximo = topo;
		topo = elemento;
	}
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception ("Não há elementos para desempilhar");
		}
		else {
			int valor = topo.dado;
			topo = topo.proximo;
			return valor;
		}
	}
	public int top() throws Exception{
		if(isEmpty()) {
			throw new Exception ("Pilha vazia");
		}else {
			int valor = topo.dado;
			return valor;
		}
	}
	
		
}
