package controller;

public class RecVetor {
	public RecVetor() {
		super();
	}
	public int Menor(int[] vet,int tamanho, int ultimaPos, int menor) {
			if (ultimaPos>tamanho-1) {
				return menor;
			}else {
				if (menor > vet[ultimaPos]) {
					menor = vet[ultimaPos];
				}
				ultimaPos ++;
				return Menor(vet,tamanho,ultimaPos,menor);
			}
	}
}
