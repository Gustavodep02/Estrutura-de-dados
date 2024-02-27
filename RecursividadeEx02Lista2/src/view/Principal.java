package view;
import controller.RecDiv;
public class Principal {
	public static void main(String[] args) {
		RecDiv d = new RecDiv();
		int dividendo = 20;
		int divisor = 3;
		int resto;
		
		resto = d.Calcular(dividendo, divisor);
		System.out.println(resto);
	}
}
