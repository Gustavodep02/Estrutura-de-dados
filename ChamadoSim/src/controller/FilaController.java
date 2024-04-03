package controller;

import javax.swing.JOptionPane;

import entity.Cliente;
import entity.ClientePrioritario;
import model.Fila;

public class FilaController <T> {
private int prio = 0;
Fila<Cliente> fila = new Fila<>();
Fila<ClientePrioritario> filaPrioritarios = new Fila<>();

	public FilaController(Fila fila,Fila filaPrioritarios) {
		
	}
	public void adicionarCliente() {
        Cliente cliente = new Cliente();
        cliente.numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do cliente:"));
        cliente.nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
        fila.insert(cliente);
        System.out.println("Cliente adicionado");
    }
	public void adicionarClientePrioritario() {
		ClientePrioritario cliente = new ClientePrioritario();
        cliente.numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do cliente:"));
        cliente.nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
        filaPrioritarios.insert(cliente);
        System.out.println("Cliente prioritário adicionado");
    }
	public void atenderCliente() throws Exception{
		if (prio<3 && filaPrioritarios.isEmpty()==false){
				filaPrioritarios.remove();
            prio++;
		}else {
			fila.remove();
			prio=0;
		}
	}
	}

