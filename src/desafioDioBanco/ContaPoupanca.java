package desafioDioBanco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();
		
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("******* Extrato da conta Poupança *******");
		imprimirInfosComuns();
	}

}
