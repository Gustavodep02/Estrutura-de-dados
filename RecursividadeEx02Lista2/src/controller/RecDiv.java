package controller;

public class RecDiv {
	public RecDiv() {
		
	}
	public int Calcular(int dividendo, int divisor) {
		if (divisor==dividendo) {
			return 0;
		}
		else {
			if(divisor>dividendo) {
				return dividendo;
			}else {
				dividendo = dividendo - divisor;
				return Calcular(dividendo,divisor);
			}
			
		}
	}
}
