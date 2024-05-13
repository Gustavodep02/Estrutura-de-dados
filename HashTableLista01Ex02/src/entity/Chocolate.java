package entity;

import java.util.Objects;

public class Chocolate {
	public int volume;
	public String tipo;
	
	@Override
	public int hashCode() {
		if(volume >=50 && volume <= 60) {
			return 0;
		}else if (volume >=100 && volume <= 110) {
			return 1;
		}else if (volume >=150 && volume <= 160) {
			return 2;
		}else if (volume >=200 && volume <= 220) {
            return 3;
		}else {
            return 4;
		}
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chocolate other = (Chocolate) obj;
		return Objects.equals(tipo, other.tipo) && volume == other.volume;
	}
	@Override
	public String toString() {
		return "Chocolate [volume=" + volume + ", tipo=" + tipo + "]";
	}
	
}
