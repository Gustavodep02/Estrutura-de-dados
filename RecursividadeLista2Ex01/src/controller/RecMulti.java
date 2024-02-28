package controller;

public class RecMulti {
	public RecMulti() {
		
	}
	public int Calcular(int cont, int numA, int numB, int total) {
		if(cont >=numB) {
			return total;
		}else {
			cont++;
			total = total + numA;
			return Calcular(cont,numA,numB,total);
		}
	}
}
