package desafioDioBanco;

public class Cliente {
	private String nome;
	private ContaCorrente cc;
	private ContaPoupanca cp;
	
	
	
	public Cliente(String nome, ContaCorrente cc, ContaPoupanca cp) {
		this.nome = nome;
		this.cc = cc;
		this.cp = cp;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public ContaCorrente getCc() {
		return cc;
	}

	public void setCc(ContaCorrente cc) {
		this.cc = cc;
	}

	public ContaPoupanca getCp() {
		return cp;
	}

	public void setCp(ContaPoupanca cp) {
		this.cp = cp;
	}
	
	public void imprimirDadosCliente() {
		System.out.println("Cliente: " + this.nome);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

	
}
