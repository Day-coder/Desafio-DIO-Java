package com.projeto.entidades;

public class Main {
public static void main(String[] args) {
	Cliente cliente= new Cliente();
	cliente.setNome("Day");
	Conta contaCorrente= new ContaCorrente(cliente);
Conta contaPoupanca= new ContaPoupanca(cliente);
contaCorrente.depositar(100);
contaCorrente.transferir(50, contaPoupanca);

contaCorrente.imprimirExtrato();
contaPoupanca.imprimirExtrato();

Banco banco= new Banco();
banco.setNome("Teste");
System.out.println(banco.getContas());
}

}
