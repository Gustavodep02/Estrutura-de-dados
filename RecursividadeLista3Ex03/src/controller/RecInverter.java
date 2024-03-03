package controller;

public class RecInverter {
	public RecInverter() {
		
	}
	public String Inverter(String texto, int cont, String res) {
		if (cont <=0) { // caso o contador chegue a 0 retorna a palavra ja invertida
			return res;
		}
		else {
			res = res + texto.substring(cont-1,cont); // adiciona a proxima letra na variavel res
			cont --; // diminui um no contador
			return Inverter(texto,cont,res);
		}
	}
	
}
