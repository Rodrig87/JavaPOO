package interfaces;

public class Bank {

	public static void main(String[] args) {
		 ContaCorrente cont1 = new ContaCorrente();
		 cont1.taxaOperacao = 8.00;
		 cont1.depositar(100);
		 cont1.sacar(45);
		 double saldo = cont1.getSaldo();
		 
		 System.out.println(saldo);

	}

}
