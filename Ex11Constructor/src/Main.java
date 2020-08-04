
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p=new Person();
		p.setMembers("Sam", 20);
		p.show();
		
		Person p2=new Person();
		p2.setMembers("Robin", 21);
		
		//객체를 생성 후 항상 필드값을 세팅하는 메소드 호출
		//매번 객체 생성 다음 줄에 메소드를 호출 -> 으..
		
		//어차피 객체 생성 후 메소드 한 번 호출 할 거라면,
		//처음 객체 생성할때(new)할 때, 메소드가 호출 되도록하면!?
		//new 적으며 메소드 작업!
		
		//객체가 생성될 때 자동으로 호출되는 메소드!!!생성자!!!
		
		//존재 확인을 위해~
		
		First f=new First(); //이 때, 생성자 메소드 호출됨!
		
		//생성자에 값을 전달하고 싶다면.
		
		First f3= new First(10);
		
		
		Person p3= new Person("Hong", 30);
		
	
		
		
		
		
	}

}
