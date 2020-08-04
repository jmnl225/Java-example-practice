
public class Second extends First {
	//아무것도 없어보이지만!
	//상속받은 First 클래스의 멤버를 갖고있음
	
	int b;
	
	
	//생성자!!!! = > 변수 아래, 메소드 위에.
	//객체 생성시(new)될 때 자동으로 호출되는 메소드! = 생 성 자
	
	public 
	
	
	
	
	
	
	//본인 멤버변수를 출력하는 기능 메소드
	
	void showSecond() {
		System.out.println("b: "+ b);	
		
	}
	
	
	//보이지는 않지만 First클래스의 a 변수까지 출력해주는 기능메소드
	
	void show() {
//		System.out.println("a: ");
		
		//?? 객체지향=자기 변수는 자기가 제어.
		//Second에서 First를 직접출력하는 것은  객체지향이 아님!
		
		showFirst(); //First클래스의 멤버메소드를 내것인양 호출
		
		System.out.println("b: "+ b); //본인멤버만 직접 출력하자.
		
	}
	
	
	
	//멤버변수에 값을 대입해주는 메소드
	
	void setMembers(int a, int b) {
		//멤버변수에 전달받은 매개변수의 값 대입!
//		this.a= a; //어? 이거??
		//this. 는 본인객체를 지칭
		//a는 Second의 변수가 아닌 First것.
		
		//명시적으로 First 것의 a라는 표현을 하자.
		
		//상위 객체의 것이라는 표현을 위한 키워드! (참조변수!)
		//this. 키워드와 유사한 표현: super
		
//		super.a= a; //아.. 그런데 이게 내 건가? 왜이걸 내가? First한테 시켜!!!
		
		super.setA(a); // = setA(a); -> a를 받아 보내서 리턴받음ㅎ 
		//super를 안 써도 됨. 상속을 받아서 상위객체의 메소드를 그냥 사용할 수 있음
		this.b= b;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
