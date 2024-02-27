package controller;

public class RecPares {
	public RecPares() {
		
	}
	public int Pares(int vet[],int tamanho, int atual, int total) {
		if (tamanho<=atual) {
			return total;
		}else {
			if(vet[atual] % 2 == 0) {
				total ++;	
			}
			atual++;
			return Pares(vet,tamanho,atual,total);
		}
	}
}
