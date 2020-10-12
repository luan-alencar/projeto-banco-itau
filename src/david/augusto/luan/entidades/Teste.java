package david.augusto.luan.entidades;

import david.augusto.luan.exceptions.SaldoInsuficienteException;

public class Teste {

	public static void main(String[] args) {

		ContaCorrente c1 = new ContaCorrente(1, 1, "Luan");
		c1.depositar(1500);
		try {
			c1.sacar(1.000);
		} catch (SaldoInsuficienteException e) {
			System.err.print(e);
		}
		
		System.out.println("Saldo: " + c1.getSaldo());
	}

}
