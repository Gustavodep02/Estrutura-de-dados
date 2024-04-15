package view;

import controller.RecController;

public class Principal {

	public static void main(String[] args) {
		RecController rc = new RecController();
		
		int num = 100;
		int result = rc.recDigitos(num);
		
		System.out.println("O numero " + num + " possui " + result+" digitos.");

	}

}
