package david.augusto.luan.entidades;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int conta, String titular, double saldo) {
		super(agencia, conta, titular, saldo);
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(int agencia, int conta, String titular) {
		super(agencia, conta, titular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sacar(double montante) {
		// TODO Auto-generated method stub
		
	}

}
