package Polimorfismo;

public class Fazendinha {

	public static void main(String[] args) {
		Gato gato1 = new Gato ("branco", "Pé de Pano");
		gato1.som();
		System.out.printf("O gato de Danyel dele é %s e o seu nome é %s \n \n",gato1.cor,gato1.nome);
		
		Galinha galinha1 = new Galinha ("azul", "Galinha Pintadinha");
		galinha1.som();
		System.out.printf("A %s é %s e ela faz",galinha1.nome,galinha1.cor);
		System.out.println("\n");
		Bode bode1 = new Bode("Cinza", "Zéca");
		bode1.som();
		System.out.printf("Duda1 tem um bode %s de nome %s",bode1.cor,bode1.nome);
	}

}
