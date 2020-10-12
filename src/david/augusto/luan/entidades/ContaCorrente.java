package david.augusto.luan.entidades;

import david.augusto.luan.exceptions.SaldoInsuficienteException;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int conta, String titular, double saldo) {
		super(agencia, conta, titular, saldo);
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(int agencia, int conta, String titular) {
		super(agencia, conta, titular);
		// TODO Auto-generated constructor stub
	}

	// uma vez que elas a subclasse extendem uma super classe
	// elas sao obrigadas a implementar os metodos abstratos
	@Override
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
