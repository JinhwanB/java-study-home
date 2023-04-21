package j2023_04_21;

public class MainClass2 {

	public static void main(String[] args) {
		Shape shape1 = new Shape();
		
		Circle cir = new Circle();
		
		Circle cir2 = shape1.outputArea(cir);
		
		System.out.println(cir2.name);
	}

}
