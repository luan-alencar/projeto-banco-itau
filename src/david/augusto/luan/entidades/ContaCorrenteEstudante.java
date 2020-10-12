package david.augusto.luan.entidades;

import david.augusto.luan.exceptions.SaldoInsuficienteException;

public final class ContaCorrenteEstudante extends Conta {

	public ContaCorrenteEstudante(int agencia, int conta, String titular, double saldo) {
		super(agencia, conta, titular, saldo);
		// TODO Auto-generated constructor stub
	}

	public ContaCorrenteEstudante(int agencia, int conta, String titular) {
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
		return 12;
	}

}
