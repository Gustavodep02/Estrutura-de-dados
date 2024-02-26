package view;
import controller.RecNegativos;
public class Principal {

	public static void main(String[] args) {
		RecNegativos n = new RecNegativos();
		
		int [] vetor = {-10,5,2,-9,7};
		int tamanho = vetor.length;
		int pos = 0;
		int res =0;
		int total;
		
		total = n.Negativos(vetor, tamanho,pos, res);
		System.out.println(total);
	}

}
