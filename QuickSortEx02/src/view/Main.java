package view;

import java.util.Arrays;

import controller.Ordenacao;

public class Main {

	public static void main(String[] args) {
		Ordenacao o =new Ordenacao();
		 int[] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		 int[] vetor2 = {44,43,42,41,40,39,38};
		 int[] vetor3 = {31,32,33,34,99,98,97,96};
		 vetor1 = o.quickSort(vetor1, 0, vetor1.length-1);
		 vetor2 = o.quickSort(vetor2, 0, vetor2.length-1);
		 vetor3 = o.quickSort(vetor3, 0, vetor3.length-1);
		 System.out.println(Arrays.toString(vetor1));
		 System.out.println(Arrays.toString(vetor2));
		 System.out.println(Arrays.toString(vetor3));
	}

}
