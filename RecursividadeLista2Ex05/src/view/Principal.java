package view;
import controller.RecMDC;
public class Principal {
	public static void main(String[] args) {
		RecMDC m = new RecMDC();
		int numA=12;
		int numB=10;
		int total;
		
		total = m.MDC(numA,numB);
		System.out.println(total);
		
		
	}
}
