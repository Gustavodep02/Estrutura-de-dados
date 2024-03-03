package controller;

public class RecBin {
	public RecBin() {
		
	}
	public String Binario(int n, int aux[], int cont, String saida) {
		if (n == 0) {// se o numero chegar numero chegar ao fim inicia um for para passar o resultado que esta dentro do vetor para uma string
			for (int i = cont;i>=0;i--) {
				saida = saida + String.valueOf(aux[i]);
			}
			return saida;
		}else{
			aux[cont] = n %2;// adiciona a valor do digito binario ao vetor 
			n = n/2; // divide o numero por 2 para passar ao proximo digito binario
			cont ++;// adiciona um ao contador
			return Binario(n,aux,cont,saida);
		}
	}
}
