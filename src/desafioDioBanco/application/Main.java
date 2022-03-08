package desafioDioBanco.application;

import desafioDioBanco.Banco;
import desafioDioBanco.Cliente;
import desafioDioBanco.ContaCorrente;
import desafioDioBanco.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco("Banco Desafio");
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		Cliente cli = new Cliente("Alex Green", cc, cp);
		
		cc.depositar(100.00);
		cc.transferir(50.00, cp);
		
		banco.addCliente(cli);
		
		ContaCorrente cc2 = new ContaCorrente();
		ContaPoupanca cp2 = new ContaPoupanca();
		Cliente cli2 = new Cliente("Maria Brown", cc2, cp2);
		
		banco.addCliente(cli2);
		
		banco.imprimirListaClientes();

	}

}
