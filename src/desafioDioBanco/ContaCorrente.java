package desafioDioBanco;

public class ContaCorrente extends Conta {

	public ContaCorrente() {
		super();
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("******* Extrato da conta Corrente *******");
		imprimirInfosComuns();
	}



}
