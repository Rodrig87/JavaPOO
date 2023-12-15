package Transportes;

public class Bike extends NaoMotorizado {

	public Bike(String _cor, String _modelo, double _preco) {
		super(_cor, _modelo, _preco);
	}
int marcha = 1;
	
		void aumentar(int up) {
			marcha += 1;
		}
		void reduzir(int down) {
			marcha -= 1;
		}
}
