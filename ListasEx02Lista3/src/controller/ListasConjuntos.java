package controller;

import br.edu.fateczl.lista.listaObj.Lista;

public class ListasConjuntos {

	public ListasConjuntos() {
		
		
	}
	
	public void interseccao(Lista a,Lista b) {
		Lista i = new Lista();
		for(int j = 0;j<7;j++) {
			for(int k = 0; k<5;k++) {
				int posA=9;
				int posB=8;
				try {
					posA = (int) a.get(j);
					posB = (int) b.get(k);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(posA == posB) {
					if(i.isEmpty()) {
						try {
							i.add(posA,0);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else {
					try {
						i.addLast(posA);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}
				}
			}
		}
	}
	
	public void uniao(Lista a, Lista b) {
		
	}
	
}
