package entity;

public class Musica {
	public String nome;
	public String nomeArtista;
	public int duracao;
	
	public String toString() {
        return "Pessoa { " +
               "Nome: " + nome + ", " +"Nome do Artista: "+ nomeArtista + ", " +"Duracao: "+ duracao +
               " }";
    }
}
