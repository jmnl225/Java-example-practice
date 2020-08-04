
public class Person {
	
	
	String name;
	int age;
	
	//출력기능 메소드
	
	void show() {
		
		System.out.println("name: "+ name);
		System.out.println("age: "+ age);
		System.out.println();	
	}
	
	
	
	
	//입력 기능 메소드
	
	void setMembers(String name, int age) {
		
		this.name=name;
		this.age=age;		
		
	}
	
	
	//생성자 메소드
	
	public Person(String name, int age) {
		this.name= name;
		this.age= age;
	}
	
	
	public Person() {
//		this.name= "익명";
//		this.age= 0;
		this("익명", 0);
	}
	
	
	
}
