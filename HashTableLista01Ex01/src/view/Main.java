package view;

import controller.ControllerAcessoCarros;
import entity.Morador;

public class Main {

	public static void main(String[] args) {
		Morador m0 = new Morador();
		m0.nome = "Joao";
		m0.numeroApartamento = 101;
		m0.modeloCarro = "Fiat";
		m0.placaCarro = "ABC-1234";
		m0.corCarro = "Preto";
		
		Morador m1 = new Morador();
		m1.nome = "Maria";
		m1.numeroApartamento = 201;
		m1.modeloCarro = "Chevrolet";
		m1.placaCarro = "DEF-5678";
		m1.corCarro = "Branco";
		
		Morador m2 = new Morador();
		m2.nome = "Jose";
		m2.numeroApartamento = 301;
		m2.modeloCarro = "Ford";
		m2.placaCarro = "GHI-9012";
		m2.corCarro = "Vermelho";
		
		ControllerAcessoCarros controller = new ControllerAcessoCarros();
		controller.adicionarMorador(m0);
		controller.adicionarMorador(m1);
		controller.adicionarMorador(m2);
		
		try {
            Morador m = controller.buscarMorador(m1);
            System.out.println(m);
        } catch (Exception e) {
            e.printStackTrace();
        }
		controller.listarAndar(201);
		controller.removeMorador(m1);
		
	}

}
