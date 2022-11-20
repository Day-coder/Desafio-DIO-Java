package com.projeto.entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Conta implements IConta{
	private static int AGENCIA_PADRAO= 1;
	private static int SEQUENCIAL=1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected String cliente;
	protected LocalDateTime hora;
	
	
	
	public Conta(Cliente cliente) {
		this.agencia= Conta.AGENCIA_PADRAO;
		this.numero= SEQUENCIAL++;
		this.cliente= cliente.getNome();
		this.hora= hora.now();
	}

	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void sacar(double valor) {
		saldo= saldo- valor;
	}
	@Override
	public void depositar(double valor) {
		saldo= saldo+ valor;
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	protected void imprimirDados() {
		System.out.println("Agência: "+ this.agencia);
		System.out.println("Numero: "+ this.numero);
		System.out.println("Saldo: "+ this.saldo);
		System.out.println("Titular da Conta: " + cliente );
		System.out.println("Hora: "+ hora);
	}

	
	
}
