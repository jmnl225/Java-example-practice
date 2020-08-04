
public class Person {
	
	//멤버변수는 private
	private String name;
	private int age;
	
	//Person객체가 생성될 때 자동으로 한 번 호출되는 메소드= 생 성 자!!!!!!!
	//생성자를 만들때 접근 제한자는  public을 권장!
	Person(String name, int age){
		this.name= name;
		this.age= age;
		
		System.out.println("Person 객체 생성: String, int");
	}
	
	//생성자 오버로딩이 필요해!!!!
	
	Person(){
		System.out.println("Person 객체 생성!");
		this.name= "익명";
		this.age =20;
	}
	
	
	
	
	
	
	
	
	
	//멤버값 세팅 기능
	public void setMembers(String name, int age) {
		this.name= name;
		this.age= age;
	}
	
	public void show() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
	}
	
}
