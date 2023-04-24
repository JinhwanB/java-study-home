package j2023_04_21;

public class Circle {
	int radius;
	String name;
	
	public Circle() {
		this.radius = 1;
		this.name = "홍길동";
	}
	
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	
	public double getArea() {
		double area = this.radius * this.radius * 3.14;
		return area;
	}
	
	public void printArea(String name) {
		System.out.println(this.name);
	}
}
