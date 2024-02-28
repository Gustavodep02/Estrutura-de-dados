package controller;

public class RecFatDuplo {
	public RecFatDuplo() {
		
	}
	public int Calcular(int num, int total) {
		if (num<=0) {
			return total;
		}else {
			total = total * num;
			num = num-2;
			return Calcular(num,total);
		}
	}
}
