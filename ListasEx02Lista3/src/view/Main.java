package view;

import br.edu.fateczl.lista.listaObj.Lista;
import controller.ListasConjuntos;

public class Main {

	public static void main(String[] args) {
		Lista lA = new Lista();
		Lista lB = new Lista();
		ListasConjuntos c = new ListasConjuntos();
		try {
			lA.add(3,0);
			lA.add(5,1);
			lA.add(8,2);
			lA.add(12,3);
			lA.add(9,4);
			lA.add(7,5);
			lA.add(16,6);
			lB.add(9,0);
			lB.add(6,1);
			lB.add(2,2);
			lB.add(3,3);
			lB.add(7,4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.interseccao(lA,lB);
		c.uniao(lA,lB);
	}
	
	
	

}
