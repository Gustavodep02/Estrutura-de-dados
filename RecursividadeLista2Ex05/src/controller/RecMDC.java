package controller;

public class RecMDC {
	public RecMDC() {
		
	}
	public int MDC(int numA, int numB) {
		if (numA>numB ) {
			numA = numA-numB;
			return MDC(numA,numB);
		}else if (numA == numB) {
			return numA;
		}else {
			return MDC(numB,numA);
		}
}}
