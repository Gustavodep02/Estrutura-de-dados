package view;

import controller.EscalonadorController;
import entity.Processo;
import model.Fila;

public class Principal {

	public static void main(String[] args) {
		Fila<Processo> f = new Fila();
		EscalonadorController ec = new EscalonadorController();
		Processo p1 = new Processo();
		p1.nome = "notepad.exe";
		p1.qtdRetorno = 14;
		Processo p2 = new Processo();
		p2.nome = "write.exe";
		p2.qtdRetorno = 35;
		Processo p3 = new Processo();
		p3.nome = "chrome.exe";
		p3.qtdRetorno = 27;
		f.insert(p1);
		while(p1.qtdRetorno > 0  ) {
			
            ec.escalonador(f,p1);
		}
		try {
			f.remove();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f.insert(p2);
		while(p2.qtdRetorno > 0) {
			
            ec.escalonador(f,p2);
        }
		try {
			f.remove();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
		}
		f.insert(p3);
		while(p3.qtdRetorno > 0) {
			
            ec.escalonador(f,p3);
		}
		try {
            f.remove();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
