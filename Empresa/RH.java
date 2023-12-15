package Empresa;

public class RH{
	public static void main(String[] args) {
		Funcionarios CLT = new Funcionarios();
		CLT.nome = "Rodrigo";
		CLT.endereco = "Rua dos desesperado";
		CLT.setCpf ("111.111.111.-88");
		CLT.setEmail ("Meuemail@hotmail.com");
		CLT.setSalario(3400.00);
		double salario = CLT.getSalario();
		System.out.println(salario);
		
	}
}
