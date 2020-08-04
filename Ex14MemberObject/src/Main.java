
public class Main {
	public static void main(String[] args)
	{
		
		//클래스 안에 다른 클래스의 참조변수가 멤버변수로 있을 경우에 대한 고려사항
		
		Car car= new Car();
		//멤버변수 출력
		System.out.println(car.model);
		System.out.println( car.p );
		System.out.println();
		
		//멤버변수에 값 대입
		car.model=9999;
		car.p= new Person(); //객체를 만들어주어야함!!!!!!!!!!!!!!!!!! 
		//참조변수에 대입하기 위해서는 객체를 먼저 만들어야함.
		
		//멤버변수 출력
		System.out.println(car.model);
		//System.out.println( car.p );
		//멤버변수로 존재하는 객체의 멤버변수를 출력해야 Data가 됨.
		System.out.println(car.p.name);
		System.out.println(car.p.age);
		System.out.println();
		
		//멤버로 존재하는 객체의 멤버 변수까지 값을 대입해야지~
		car.p.name="Sam";
		car.p.age=20;
		
		
		System.out.println( car.model );
		System.out.println( car.p.name );
		System.out.println( car.p.age );
		System.out.println();
		
		//Person의 멤버까지 여기서 왜 내가 함?
		//객체의 값 출력은 객체 스스로 해야지!
		
		
		System.out.println( car.model ); //car도 네 값은 직접 해줘~
		car.p.show();
		
		car.show();
		
		//그렇다면 객체에 입력을 넣는것도...?
		//이것도 메소드로 변경!
		
		//새로운 객체를 만들어도 어렵지 않게 출력 가능
//		Car car2= new Car();
//		car2.model=1122;
//		car2.p=new Person();
//		car2.p.name="Robin";
//		car2.p.age=25;
		
		//Person의 멤버값 대입을 직접하기 보다는 입력기능이 있다면 더 간결히 코드가 가능할텐데!!!
		
//		car2.p.setMembers("Robin", 25);
//		car2.show();
		
		//이런식이면 Car의 멤버값 대입도 메소드를 이용
//		Car car3= new Car();
//		Person p= new Person();
//		p.setMembers("Jack", 19);
//		car3.setMembers(1122, p); //p에 객체를 전달해야함 ㅠ ㅠ
//		//아...........이건 좀 아닌데..............?
//		
//		Car car4=new Car();
//		car4.setMembers(3232, p);
//		car4.show();
		
		//아 좀 나아보이긴 하는데.
		//새로운 객체 생성할때마다 다음줄에 꼭 setMembers() 메소드 호출 코드가 들어가잖아
		//그냥 객체 생성할 때 멤버값 미리 초기화 안댐?
		
		Car car5=new Car(5515, "Lee", 40);
		car5.show();
		
		
		
		
		
		
		
		
	}
}
