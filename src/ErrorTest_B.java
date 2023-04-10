
public class ErrorTest_B {

	public static void main(String[] args) {
		int a = 100;
		int b = 0;
		double divide = 0;
		
		try {
			divide = a/b;
		} catch (Exception e) {
			System.out.println("모든 수는 0으로 나눌 수 없습니다. 다시 확인하세요!!");
			e.printStackTrace(); //에러 내용 출력
		}
		
		System.out.println(divide);
	}

}
