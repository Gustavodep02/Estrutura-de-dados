package view;
import controller.RecSeq;
public class Principal {

	public static void main(String[] args) {
		RecSeq s = new RecSeq();
		int n = 5;
		double total = 0;
		
		total = s.Seq(n, total);
		System.out.println(total);
	}

}
