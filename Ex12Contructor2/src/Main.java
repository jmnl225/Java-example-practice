
public class Main {
	
	public static void main(String[] args) {
		
		// this() 생성자
		
		// 메소드에서 다른 메소드 호출 가능
		// 생성자에서 다른 생성자 호출 가능!
		
		
		Person p= new Person("Sam", 20);
		Person p2=new Person("Robin", 22);
		
		Person p3=new Person();
	
		new InitialTest(); //객체를 생성하면 초기화 4단계를 거쳐 멤버변수가 초기화됨.
	
		
		
		
		
	}

}
