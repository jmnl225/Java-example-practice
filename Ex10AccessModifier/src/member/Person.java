package member;

public class Person {
	
	//이름, 나이, 국적 (정보 은닉
	private String name;
	private int age;
	private String nation;
	
	//멤버변수에 값 대입하는 기능함수(메소드)
	
	public void setMembers(String name, int age, String nation) {
		this.name= name;
		this.age= age;
		this.nation= nation;
	}

	//멤버 변수값 출력하는 기능 함수
	public void show() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("nation: "+nation);
		System.out.println();
	}

	
	//게터와 세터 자동으로 만들기
	
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

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	
	
/*	//멤버변수별로 값을 대입하는 set 함수 :: 세터 메소드!
	
	public void setName(String name) {
		this.name= name;
	}
	
	public void setAge(int age) {
		this.age= age;
	}
	
	public void setNation(String nation) {
		this.nation= nation;
	}
	
	
	//멤버변수별로 값을 리턴해주는 (private이라 값을 볼 수 없어!) :: 게터 메소드!!
	// get 블라블라
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getNation() {
		return this.nation;
	}
*/
	
	
	
}
