package controller;

public class RecDigitos {
	public RecDigitos() {
		
	}
	public int Digitos(int num, int total) {
		if (num <=0) {
			return total;
		}else
			num = num/10;
			total ++;
			return Digitos(num,total);
	}
	
}
