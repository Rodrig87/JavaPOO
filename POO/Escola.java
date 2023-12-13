package POO;
import java.util.Date;

public class Escola {

	public static void main(String[] args) {
		Aluno Alu1 = new Aluno ("Rodrigo","012.345.678-12",new Date());
		Professor prof1 = new Professor ("Welligton","098.765.432-10",new Date());
		Funcionario func1 = new Funcionario ("Vinicius", "000.111.444-88", new Date());
		
		System.out.println(Alu1.nome);
	}

}
