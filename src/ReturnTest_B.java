
public class ReturnTest_B {

	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int[] arr() {
		int[] temp = {10, 20, 30, 40};
		return temp;
	}
	
	public static void main(String[] args) {
		int k = sum(100, 200); //k = 300
		
		int[] arr2 = arr();
	}

}
