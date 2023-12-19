package éofim;

public class Calc {

	public static void main(String[] args) {
		Retangulo calc1 = new Retangulo(3,5);
		calc1.setArea();
		double area = calc1.getArea();
		System.out.println(area);
		calc1.setPerimetro();
		double perimetro = calc1.getPerimetro();
		System.out.println(perimetro);
		
	}

}
