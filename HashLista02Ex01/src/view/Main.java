package view;

import controller.ControllerNumeros;
import model.Numeros;

public class Main {

	public static void main(String[] args) {
		Numeros n0 =  new Numeros();
		Numeros n1 =  new Numeros();
		Numeros n2 =  new Numeros();
		Numeros n3 =  new Numeros();
		Numeros n4 =  new Numeros();
		Numeros n5 =  new Numeros();
		n5.numero = 0;
		n4.numero = 1;
		n3.numero = 2;
		n2.numero = 3;
		n1.numero = 4;
		n0.numero = 5;
		
		ControllerNumeros c = new ControllerNumeros();
		
		c.adicionarNumero(n5);
		c.adicionarNumero(n4);
		c.adicionarNumero(n3);
		c.adicionarNumero(n2);
		c.adicionarNumero(n1);
		c.adicionarNumero(n0);
		
		c.listarNumeros();
	}

}
