package david.augusto.luan.entidades;

public final class ContaCorrenteEstudante extends Conta {

	public ContaCorrenteEstudante(int agencia, int conta, String titular, double saldo) {
		super(agencia, conta, titular, saldo);
		// TODO Auto-generated constructor stub
	}

	public ContaCorrenteEstudante(int agencia, int conta, String titular) {
		super(agencia, conta, titular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sacar(double montante) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getValorTribut() {
		// TODO Auto-generated method stub
		return 12;
	}

}
