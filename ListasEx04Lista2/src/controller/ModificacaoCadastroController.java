package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import entity.Cliente;
import model.Lista;

public class ModificacaoCadastroController {
	public ModificacaoCadastroController() {
        
    }
	
	private void novoArquivo(Lista<Cliente> lista, String nomeArquivo) {
        File arquivo = new File("C:\\TEMP", nomeArquivo);
        StringBuilder buffer = new StringBuilder();

        for (int i = 0; i < lista.size(); i++) {
            try {
                Cliente cliente = lista.get(i);
                buffer.append(cliente.getNome()).append(",")
                      .append(cliente.getIdade()).append(",")
                      .append(cliente.getLimiteCredito()).append("\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            writer.write(buffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void novoCadastro(int idadeMin, int idadeMax, double limiteCredito) throws Exception {
        Lista<Cliente> clientes = new Lista<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\TEMP\\cadastro.csv"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length >= 3) { 
                    String nome = dados[0];
                    int idade = Integer.parseInt(dados[1]);
                    double limite = Double.parseDouble(dados[2]);
                    if (idade >= idadeMin && idade <= idadeMax && limite > limiteCredito) {
                        clientes.addLast(new Cliente(nome, idade, limite));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String nomeArquivo = "Idade " + idadeMin + "-" + idadeMax + " limite" + limiteCredito + ".csv";
        novoArquivo(clientes, nomeArquivo);
    }
}