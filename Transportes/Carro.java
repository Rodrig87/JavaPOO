package Transportes;

public class Carro extends Motorizado {

	public Carro(String _cor, String _modelo, double _preco) {
		super(_cor, _modelo, _preco);
		
	}
	public int vel = 30;
	
	int acelerar(int acelerar){
		return
		acelerar = vel + acelerar;
		System.out.println("Sua velocidade atual é de "+ acelerar);
	}
}
