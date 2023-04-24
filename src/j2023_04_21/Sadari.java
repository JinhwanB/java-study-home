package j2023_04_21;

public class Sadari extends Shape1 {
	int bottomWidth;
	int topWidth;
	
	public void sadariArea() {
		System.out.println((bottomWidth + topWidth) * height * 0.5);
	}
}
