package view;

import javax.swing.JOptionPane;

import controller.PlayerController;
import entity.Musica;
import model.Lista;

public class Main {

	public static void main(String[] args) {
		Lista<Musica> lista = new Lista<>();
		PlayerController pc = new PlayerController();
		
		int opc = 0;
		
		while(opc!=9) {
			opc =Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar musica\n2 - Remover musica\n3 - Executar playlist\n9 - Sair"));
            
            switch(opc) {
            case 1:
                String nomeMusica= JOptionPane.showInputDialog("Informe o nome da musica");
                String artista = JOptionPane.showInputDialog("Informe o nome do artista");
                int duracao = Integer.parseInt(JOptionPane.showInputDialog("Informe a duracao da musica"));
                String musica = nomeMusica+";"+artista+";"+duracao;
                pc.adicionaMusica(lista, musica);
                break;
            case 2:
            	int posicao = Integer.parseInt(JOptionPane.showInputDialog("Informe a posicao da musica"));
                pc.removeMusica(lista, posicao);
                break;
            case 3:
                pc.executaPlaylist(lista);
                break;
            case 9:
            	System.out.println("Saindo");
                break;
            }
		}

	}

}
