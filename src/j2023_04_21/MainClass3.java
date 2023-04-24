package j2023_04_21;

public class MainClass3 {

	public static void main(String[] args) {
		
		Member member = new Member("tiger", "12345", "홍길동", 27);
		
//		member.id = "cat"; // member 객체의 id값이 "tiger" -> "cat"
//		member.pw = "888888";
		
		member.setName("이순신");
		
		System.out.println(member.getName());
		
		final int a = 10; // a가 상수로 선언
		//a = 100; // a는 변경 불가능
	}

}
