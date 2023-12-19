package éofim;

public class PET {
	private String name;
	private String animal;
	private int idade;
	
	
	public PET() {
		
		
	}
	public PET (String name) {
		this.name = name;
	}
	
	public PET (String name, String animal) {
		this.name = name;
		this.animal = animal;
	
	}
	public PET (String name, String animal, int idade) {
		this.name = name;
		this.animal=animal;
		this.idade = idade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
