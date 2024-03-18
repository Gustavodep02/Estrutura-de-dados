package view;

import controller.Ordenacao;
import gustavo.Ordenar;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Ordenar ord = new Ordenar();
		Ordenacao o =new Ordenacao();
		 int vetor[] = new int[1500];
		 long tInicial;
		 long tFinal;
		 long tTotal;
		 int tamanho = vetor.length;
		 Random random = new Random();
		 for (int i = 0; i < tamanho; i++) {
	            vetor[i] = random.nextInt(1000);
	        }
		 //quicksort
		 tInicial =System.nanoTime();
		 o.quickSort(vetor, 0, vetor.length-1);
		 tFinal = System.nanoTime();
		 tTotal = tFinal - tInicial;
		 System.out.println(tTotal/1000000.0+" ms");
		 
		 //mergesort
		 tInicial =System.nanoTime();
		 ord.mergeSort(vetor, 0, vetor.length-1);
		 tFinal = System.nanoTime();
		 tTotal = tFinal - tInicial;
		 System.out.println(tTotal/1000000.0+" ms");
		 
		 //bubblesort
		 tInicial =System.nanoTime();
		 ord.bubbleSort(vetor);
		 tFinal = System.nanoTime();
		 tTotal = tFinal - tInicial;
		 System.out.println(tTotal/1000000.0+" ms");
	}

}
