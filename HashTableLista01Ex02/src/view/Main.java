package view;

import controller.ControllerChocolate;
import entity.Chocolate;

public class Main {

	public static void main(String[] args) {
        Chocolate c1 = new Chocolate();
        c1.volume = 55;
        c1.tipo = "bombons";
        
        Chocolate c2 = new Chocolate();
        c2.volume = 105;
        c2.tipo = "paves";
        
        Chocolate c3 = new Chocolate();
        c3.volume = 155;
        c3.tipo = "brigadeiros";
        
        Chocolate c4 = new Chocolate();
        c4.volume = 205;
        c4.tipo = "bolos";
        
        Chocolate c5 = new Chocolate();
        c5.volume = 250;
        c5.tipo = "ovos de pascoa";
        
        ControllerChocolate controller = new ControllerChocolate();
        controller.adicionarChocolate(c1);
        controller.adicionarChocolate(c2);
        controller.adicionarChocolate(c3);
        controller.adicionarChocolate(c4);
        controller.adicionarChocolate(c5);
        
        try {
            Chocolate c = controller.buscarChocolate(c2);
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();

        }
        controller.removerChocolate(c2);
        
	}

}
