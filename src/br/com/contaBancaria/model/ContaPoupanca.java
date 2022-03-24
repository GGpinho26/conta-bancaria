package br.com.contaBancaria.model;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();
		
	}

	public ContaPoupanca(String titular, Integer numConta, Double saldo) {
		super(titular, numConta, saldo);
		
	}
	
	public void depositar(Double valor, Double tx) {
		
		saldo += valor + (valor * tx);
		
	}

}
