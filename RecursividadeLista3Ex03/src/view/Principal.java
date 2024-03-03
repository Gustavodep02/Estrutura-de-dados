package view;
import controller.RecInverter;
public class Principal {

	public static void main(String[] args) {
		RecInverter i = new RecInverter();
		String palavra = "teste";
		int cont = palavra.length();
		String res="";
		
		res = i.Inverter(palavra, cont, res);
		System.out.println(res);

	}

}
