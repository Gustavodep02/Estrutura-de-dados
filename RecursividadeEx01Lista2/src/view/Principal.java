package view;
import controller.RecMulti;
public class Principal {
	public static void main(String[] args) {
	RecMulti m = new RecMulti();
	
	int cont = 0;
	int total = 0;
	int numA = 4;
	int numB = 5;
	
	total = m.Calcular(cont,numA,numB,total);
	System.out.println(total);
}
}
