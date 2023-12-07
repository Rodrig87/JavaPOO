package JavaPOO;

public class Testemetodos {

	public static void main(String[] args) {
		JavaMetodos t1 = new JavaMetodos();
		int idade = t1.idade();
		double valor = t1.valor();
		String nome = t1.nome();
		boolean estado = t1.estado();
		
		
		System.out.printf("A idade da %s é %d anos",nome,idade);
	}

}
