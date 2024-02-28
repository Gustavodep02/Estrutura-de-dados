package controller;

public class RecNum {
	public RecNum() {
		
	}
	public int Numeros(int numA, int numB,int total) {
		if (numA<=0) { //caso o primeiro numero seja menor ou igual a 0 retorna o valor
			return total;
		}
		else {
			if(numA%10==numB) {// caso o resto da divisao do primeiro numero por 10 seja igual ao segundo numero acrescenta um ao total
				total++;
			}
			numA= numA/10; // divide por 10 o primeiro numero para "retirar" o ultimo digito
			return Numeros(numA,numB,total);
		}
	}
}
