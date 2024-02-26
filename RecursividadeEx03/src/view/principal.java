package view;
import controller.RecFat;
public class principal {

	public static void main(String[] args) {
		RecFat c = new RecFat();
		
		int num = 4;
		int soma =1;
		int total;
		
		total = c.Calcular(num, soma);
		System.out.println(total);
		
		
	}

}
