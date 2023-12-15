package Transportes;

public class Motorizado extends Veiculo {

	public Motorizado(String _cor, String _modelo, double _preco) {
		super(_cor, _modelo, _preco);
		
	}
	public String tipomotor;
	public String tipoComb;
	public int vel = 30;
	
		void acelerar(int acelerar){
					vel += acelerar;
	}
		void freiar(int reduzir){
					vel -= reduzir;
	}
		void buzinar() {
			System.out.println("bibiiii");
		}
}
