package david.augusto.luan.entidades;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int conta, String titular, double saldo) {
		super(agencia, conta, titular, saldo);
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(int agencia, int conta, String titular) {
		super(agencia, conta, titular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sacar(double montante) {
		// TODO Auto-generated method stub
		
	}

}
