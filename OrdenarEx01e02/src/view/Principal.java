package view;

import controller.OrdenarVetores;
public class Principal {

	public static void main(String[] args) {
		OrdenarVetores o = new OrdenarVetores();
		
		int vet [] = {74,20,74,87,81,16,25,99,44,58};
		int vet2 [] = {44,43,42,41,40,39,38};
		
		//Ex1
		o.ordenarBubble(vet);
		o.ordenarMerge(vet, 0, vet.length-1);
		//Ex2
		o.ordenarBubble(vet2);
		o.ordenarMerge(vet2, 0, vet2.length-1);
	}

}
