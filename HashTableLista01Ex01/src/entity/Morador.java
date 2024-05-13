package entity;

import java.util.Objects;

public class Morador {
	
	public String nome;
	public int numeroApartamento;
	public String modeloCarro;
	public String placaCarro;
	public String corCarro;
	@Override
	public String toString() {
		return "Morador: \nnome=" + nome + ", \nnumeroApartamento=" + numeroApartamento + ", \nmodeloCarro=" + modeloCarro
				+ ", \nplacaCarro=" + placaCarro + ", \ncorCarro=" + corCarro + "\n";
	}
	@Override
	public int hashCode() {
    	int numeroAp = this.numeroApartamento;
    	int hash = 0;
    	while(numeroAp >=101) {
    	numeroAp -=100;
    	hash++;
    	}
    	return hash-1;
    }
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Morador other = (Morador) obj;
		return Objects.equals(corCarro, other.corCarro) && Objects.equals(modeloCarro, other.modeloCarro)
				&& Objects.equals(nome, other.nome) && numeroApartamento == other.numeroApartamento
				&& Objects.equals(placaCarro, other.placaCarro);
	}
	
}
