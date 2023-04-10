
public class BreakTest_B {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 8) {
				break; //break문이 실행되면 반복문 자체가 정지
			}
			System.out.println(i);
		}
	}

}
