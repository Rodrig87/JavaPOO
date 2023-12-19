package interfaces;

public class ContaCorrente implements Conta {
	public double taxaOperacao;
	private double saldo;
	@Override
	public void depositar(double valor) {
		this.saldo += valor - taxaOperacao;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor - taxaOperacao;
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}
	

}
