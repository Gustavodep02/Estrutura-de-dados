package view;
import controller.RecNum;
public class Principal {

	public static void main(String[] args) {
		RecNum n = new RecNum();
		int numA = 438453;
		int numB = 3;
		int total=0;
		if(numA >=10 && numA<=999999 && numB>=0 && numB<=9) {
			total = n.Numeros(numA, numB, total);
			System.out.println(total);
		}
		else {
			System.out.println("numero invalido");
		}
	}

}
