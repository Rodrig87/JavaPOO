package Transportes;

public class Cidades {

	public static void main(String[] args) {
		Moto motoca1 = new Moto ("Vermelha","Honda", 10.000);
		motoca1.tipomotor = "1.0";
		motoca1.tipoComb = "Gasolina";
		
		System.out.printf("Minha moto é uma %s de cor %s e me custou %.3f ela só aceita %s e seu motor é %s",motoca1.modelo, motoca1.cor,motoca1.preco, motoca1.tipoComb,motoca1.tipomotor);
				
		System.out.println();
		
		Carroca carroca1 = new Carroca ("amarelo mostarda", "Charrete", 2.000);
		carroca1.qtdPessoas = 4;
		
		System.out.printf("A %s é da cor %s tem capacidade pra até %d pessoas e custa %.3f",carroca1.modelo,carroca1.cor,carroca1.qtdPessoas,carroca1.preco);
		
		Bike bike1 = new Bike ("Roxo", "CALOI", 1.500);
		bike1.qtdPessoas = 1;
		System.out.println();
		System.out.printf("A bicicleta %s é da cor %s tem capacidade pra até %d pessoas e custa %.3f",bike1.modelo,bike1.cor,bike1.qtdPessoas,bike1.preco);
		
		System.out.println();
		Carro car1 = new Carro ("Cinza", "Crossfox", 25.000);
		car1.acelerar(20);
		car1.freiar(10);
		System.out.println(car1.vel);
		car1.buzinar();
	}

}
