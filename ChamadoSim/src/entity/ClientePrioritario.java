package entity;

public class ClientePrioritario {
	public int numero;
	public String nome;
	
	public String toString() {
        return "Cliente Prioritario{ " +
               // Add your fields here. For example, if you have a name field, you can do:
               // "name=" + name +
               "Nome: " + nome + ", " +"Numero: "+ numero +
               " }";
    }
}
