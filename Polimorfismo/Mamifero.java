package Polimorfismo;

public class Mamifero extends Animais{

	public Mamifero(String cor, String nome) {
		super(cor, nome);
		
	}
	public void caracteristica () {
		System.out.println("Esse animal é um mamifero");
	}
}
