package br.com.contaBancaria.model;

public class ContaCorrente extends Conta {

	public ContaCorrente() {
		super();
		
	}

	public ContaCorrente(String titular, Integer numConta, Double saldo) {
		super(titular, numConta, saldo);
		
	}
   
	public void sacar(Double valor, Double tx) {
		
		Double valorSacado;
		saldo -= valor;
		valorSacado = valor -  (valor * tx);
		System.out.println("Valor sacado: " + valorSacado);
	}
	
	
}
