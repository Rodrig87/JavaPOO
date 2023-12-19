package éofim;

public class TurmaA {

	public static void main(String[] args) {
		PET animal1 = new PET();
		animal1.setName ("Vinicius");
		animal1.setAnimal ("Coelho");
		animal1.setIdade (25);
		
		
		
		PET animal2 = new PET("Duda1");
		animal2.setAnimal("Leoa");
		animal2.setIdade(26);
		
		
		PET animal3 = new PET("Amanda", "Cobra");
		animal3.setIdade(22);
	}

}
