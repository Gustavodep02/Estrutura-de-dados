package view;
import controller.RecSoma;
public class Principal {

	public static void main(String[] args) {
		RecSoma s = new RecSoma();
        int num = 6;
        int total;

        total = s.Calcular(num);
        System.out.println(total);
	}

}
