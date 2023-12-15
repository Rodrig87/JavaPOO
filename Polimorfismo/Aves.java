package Polimorfismo;

public class Aves extends Animais {

	public Aves(String cor, String nome) {
		super(cor, nome);

	}
	public void caracteristica () {
		System.out.println("Esse animal tem penas");
	}

}
