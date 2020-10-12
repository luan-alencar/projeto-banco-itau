package david.augusto.luan.entidades;

import david.augusto.luan.exceptions.SaldoInsuficienteException;

public abstract class Conta implements Tributavel {
	private int agencia;
	private int conta;
	private String titular;
	private double saldo;

	public Conta(int agencia, int conta, String titular, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Conta(int agencia, int conta, String titular) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
	}

	// metodos abstratos nao tem corpo
	public abstract void sacar(double montante) throws SaldoInsuficienteException;

	// para ninguem sobrescrever o metodo depositar
	public final void depositar(double montante) {
		saldo += montante;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
