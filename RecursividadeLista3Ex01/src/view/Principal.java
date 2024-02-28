package view;
import controller.RecDigitos;
public class Principal {
	public static void main(String[] args) {
		
	
	RecDigitos d = new RecDigitos();
	int num = 12243;
	int digitos = 0;
	
	digitos = d.Digitos(num,digitos);
	System.out.println(digitos);
}}
