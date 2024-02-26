package view;
import controller.RecSoma;
public class Principal {

	public static void main(String[] args) {
		RecSoma s = new RecSoma();
		int num = 6;
		double soma =0;
		double total;
		
		total = s.Soma(num, soma);
		System.out.println(total);
	}

}
