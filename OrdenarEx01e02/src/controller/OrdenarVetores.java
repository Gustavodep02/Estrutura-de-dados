package controller;
import java.util.Arrays;
import gustavo.Ordenar;

public class OrdenarVetores {
	public OrdenarVetores() {
		
	}
	public void ordenarBubble(int vet[]) {
		Ordenar o = new Ordenar();
		int ret[] = o.bubbleSort(vet);
		System.out.println(Arrays.toString(ret));
	}
	public void ordenarMerge(int vet[],int inicio, int fim) {
		Ordenar o = new Ordenar();
		int ret[] = o.mergeSort(vet, inicio, fim);
		System.out.println(Arrays.toString(ret));
	}
}
