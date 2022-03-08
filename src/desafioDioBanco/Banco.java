package desafioDioBanco;

import java.util.HashSet;
import java.util.Set;

public class Banco {
	private String nome;
	private Set<Cliente> clientes = new HashSet<>();
	
	public Banco(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void addCliente(Cliente cli) {
		this.clientes.add(cli);
	}
	
	public void imprimirListaClientes() {
		for ( Cliente cliente : clientes) {
			cliente.imprimirDadosCliente();
			System.out.println("------------------------------------");
		}
	}

	
}
