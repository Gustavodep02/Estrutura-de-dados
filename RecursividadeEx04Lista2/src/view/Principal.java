package view;
import controller.RecFatDuplo;
public class Principal {
	public static void main(String[] args) {
		RecFatDuplo c = new RecFatDuplo();
		int num = 7;
		int ver = 0;
		int total =1;
		if (num <=0 || num %2==0) {
			ver++;
		}
		if(ver !=0) {
			System.out.println("Numero invalido");
		}else {
			total = c.Calcular(num, total);
			System.out.println(total);
		}
	}
}
