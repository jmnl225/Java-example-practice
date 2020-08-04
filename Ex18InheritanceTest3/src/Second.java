
public class Second extends First {
	
	private int b;
	
	//constructor 메소드
	public Second() {
//		super(); 이미 적혀있음 //이 곳에서 자동으로 부모객체 생성
		//따라서!!!!!! 부모객체의 생성자 파라미터가 없는 메소드는 필수!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println("Second 객체 생성");
	}
	
	
	//생성자 메소드 오버로딩
	public Second(int a, int b) {
//		super.a= a; // super를 써도 a 가 private이라 안됨
		//부모의 멤버변수도 set()메소드를 사용하지 않고
		//부모가 new 될 때 값을 전달하자!
		//이미 부모는 만들어졌으니 부모생성자를 호출하자!
		
//		First(10); //?? C++ 문법
		
		super(a); //부모생성자 명시적 호출 : super는 항상 가장 위에 있어야한다. **************************
		this.b=b;
		System.out.println("Second 객체 생성 int int");
		
	}
	
	public void show() {
		showFirst();
		System.out.println("b: "+ b);
		System.out.println();
	}
	
	
	
	
	
}
