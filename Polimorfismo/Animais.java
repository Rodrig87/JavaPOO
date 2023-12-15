package Polimorfismo;

public class Animais {
	public String cor;
	public String nome;
	
	public Animais  (String cor, String nome) {
		this.cor = cor;
		this.nome = nome;
	}
	public void som () {
		System.out.println("Emite som");
	}
}
