package controller;

public class RecFat {
	public RecFat() {
		
	}
	public int Calcular(int num, int soma) {
		if (num <=0 || num>=12) {
			return soma;
		}
		else {
			soma = soma * num;
			num--;
			return Calcular(num,soma);
		}
	}
}
