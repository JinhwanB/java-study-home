package j2023_04_21;

public class Member {
	
	private String id;
	private String pw;
	private String name;
	private int age;
	
	public Member() {
		
	}

	public Member(String id, String pw, String name, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public String getId() { // getter
		String id = this.id;
		return id;
	}
	
	public void setId(String id) { // setter
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
