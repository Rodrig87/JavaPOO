package JavaPOO;

public class Calc {

	public static void main(String[] args) {
		SomarMetodos c1 = new SomarMetodos ();
		int adicao = c1.somar(41, 88);
		System.out.println(adicao);
		
		adicao = c1.somar(10, 55,87);
		System.out.println(adicao);
		
		MultiplicarMetodos c2 = new MultiplicarMetodos();
		int multi = c2.mult(10, 5);
		System.out.println(multi);
	}

}
