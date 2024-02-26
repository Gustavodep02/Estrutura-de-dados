package controller;

public class RecSoma {
	public RecSoma() {
		
	}
	public double Soma(int num ,double soma) {
		if (num <= 0  ) {
			return soma;
		}else {
			soma = soma + (1.0/num);
			num--;
			return Soma(num,soma);
		}
	}
}
