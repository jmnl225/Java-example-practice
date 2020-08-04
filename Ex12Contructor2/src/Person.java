
public class Person {
	
	//필드
	
	private String name;
	private int age;
	
	//객체가 생성 / new가 될 때 자동으로 호출되는 메소드 = 생성자: constructor
	
	public Person(String name, int age){ //멤버변수의 값을 초기화
		this.name=name;
		this.age=age;
		System.out.println("Person 객체 생성: String, int");
	}
	//생성자 오버로딩
	public Person(){
		
		this("익명", 0);  //본인의 다른 생성자를 호출하기 
		//반드시 첫번째 문장이어야함!!!!!!!!!!!!!

		System.out.println("Person 객체 생성");
		//this.name="익명";
		//this.age=0;
		//매개변수를 전달받아 멤버변수에 넣어주는 저 위의 생성자를 이용하면..!?
		

		
		
		
	}

}
