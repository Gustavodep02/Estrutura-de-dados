package entity;

public class Cliente {
    private String nome;
    private int idade;
    private double limiteCredito;
    
    public Cliente(String nome, int idade, double limiteCredito) {
        this.nome = nome;
        this.idade = idade;
        this.limiteCredito = limiteCredito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}