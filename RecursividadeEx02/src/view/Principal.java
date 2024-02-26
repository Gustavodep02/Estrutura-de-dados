package view;

import controller.RecVetor;
public class Principal {

	public static void main(String[] args) {
		RecVetor v = new RecVetor();
		int [] vetor = new int [10];
		for(int i=0;i<=9;i++) {
			vetor[i] = 10-i;
		}
		int tamanho = vetor.length;
		int ultimaPos = 0;
		int menor = 999;
		int resposta;
		
		resposta = v.Menor(vetor, tamanho, ultimaPos, menor);
		System.out.println(resposta);
	}

}
