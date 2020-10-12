package david.augusto.luan.entidades;

import david.augusto.luan.exceptions.SaldoInsuficienteException;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int conta, String titular, double saldo) {
		super(agencia, conta, titular, saldo);
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(int agencia, int conta, String titular) {
		super(agencia, conta, titular);
		// TODO Auto-generated constructor stub
	}

	public void sacar(double montante) throws SaldoInsuficienteException {
		// TODO Auto-generated method stub
		if (getSaldo() < montante) {
			throw new SaldoInsuficienteException();
		}
		montante -= getSaldo();

	}

	@Override
	public double getValorTribut() {
		// TODO Auto-generated method stub
		return 1;
	}

}
