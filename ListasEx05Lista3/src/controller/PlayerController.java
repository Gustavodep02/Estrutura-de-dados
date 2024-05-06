package controller;

import entity.Musica;
import model.Lista;

public class PlayerController {
	
	public PlayerController() {
		
    }
	public void adicionaMusica(Lista<Musica> lista, String musica) {
		
		Musica m = new Musica();
		m.nome = musica.split(";")[0];
		m.nomeArtista = musica.split(";")[1];
		m.duracao = Integer.parseInt(musica.split(";")[2]);
		if (lista.isEmpty()) {
            try {
				lista.add(m, 0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } else {
            try {
				lista.addLast(m);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
	}
	public void removeMusica(Lista<Musica> lista, int posicao) {
		try {
			lista.remove(posicao);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void executaPlaylist(Lista<Musica> lista) {
		if (lista.isEmpty()) {
            System.out.println("Playlist vazia");
        }else {
        for (int i = 0; i < lista.size(); i++) {
            try {
				System.out.println(lista.get(i).toString());
				Thread.sleep(lista.get(i).duracao*1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
        }	
    }
}
