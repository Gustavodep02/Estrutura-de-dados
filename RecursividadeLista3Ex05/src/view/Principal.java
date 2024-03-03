package view;
import controller.RecFib;
public class Principal {

	public static void main(String[] args) {
		RecFib f = new RecFib();
		int n = 2;
		int saida = 0;
		
		if (n>20) {
			System.out.println("Numero Invalido");
		}else {
			saida = f.Fib(n);
			System.out.println(saida);
		}
	}

}
