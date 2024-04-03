package entity;

public class Cliente {
	public int numero;
	public String nome;
	 @Override
	    public String toString() {
	        return "Cliente { " +
	               // Add your fields here. For example, if you have a name field, you can do:
	               // "name=" + name +
	               "Nome: " + nome + ", " +"Numero: "+ numero +
	               " }";
	    }
}
