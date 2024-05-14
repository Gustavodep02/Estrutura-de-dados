package model;

import java.util.Objects;

public class Numeros {
	public int numero;

	@Override
	public String toString() {
		return "Numeros [numero=" + numero + "]";
	}

	@Override
	public int hashCode() {
		if(numero %2 == 0) {
			return 0;
		}
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Numeros other = (Numeros) obj;
		return numero == other.numero;
	}
	
}
