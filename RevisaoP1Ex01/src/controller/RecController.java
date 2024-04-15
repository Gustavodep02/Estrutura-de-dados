package controller;

public class RecController {

	public RecController() {
		// TODO Auto-generated constructor stub
	}
	
	public int recDigitos(int num) {
		if (num <10) {
			return 1;
		}else {
			return 1 + recDigitos(num/10);
		}
	}
}
