package com.projeto.entidades;

public interface IConta {
void sacar(double saldo);
void depositar(double valor);
void transferir(double valor, Conta contaDestino);
void imprimirExtrato();
}
