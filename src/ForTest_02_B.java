
public class ForTest_02_B {

	public static void main(String[] args) {
		
		// 1~100까지의 합을 구하는 for문
//		int sum = 0;
//		int sum2 = 0;
//		
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//		}
//		
//		for (int j = 100; j > 0; j--) {
//			sum2 += j;
//		}
//		
//		System.out.println(sum);
//		System.out.println(sum2);
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i);
			if (i <= 9) {
				System.out.print('+');
			} else {
				System.out.print('=');
				System.out.println(sum);
			}
		}
		System.out.println();

	}

}
