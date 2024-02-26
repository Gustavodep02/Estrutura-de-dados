package controller;

public class RecNegativos {
	public RecNegativos() {
		
	}
	public int Negativos(int vet[], int tamanho, int pos, int res) {
		if (pos >=tamanho) {
			return res;
		}else {
			if(vet[pos] <0)
			{
				res++;
			}
			pos++;
			return Negativos(vet, tamanho,pos, res);
		}
	}
}
