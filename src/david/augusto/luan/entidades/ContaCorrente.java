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

	// uma vez que elas a subclasse extendem uma super classe
	// elas sao obrigadas a implementar os metodos abstratos
	@Override
	public void sacar(double montante) {
		// TODO Auto-generated method stub

	}

}
