package view;
import controller.RecBin;
public class Principal {

	public static void main(String[] args) {
		RecBin b = new RecBin();
		int n = 2000;
		int aux [] = new int[12];
		int cont = 0;
		String saida ="";
		
		if (n>2000) {
			System.out.println("Numero invalido");
		}else {
			saida = b.Binario(n,aux,cont,saida);
			System.out.println(saida);
		}
	}

}
