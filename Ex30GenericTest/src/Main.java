
public class Main {
	public static void main(String[] args) {
		
		//Generic [제네릭]
		//클래스를 설계할때 자료형을 설정하지 않고, new 할 때 결정하도록 하는 기법
		
		Box box= new Box();
		
		box.a= 10;
		
		
		box.setA(10);		//자동 new Integer : Wrapper
		System.out.println(box.getA());
		
		box.setA(3.14);		//자동 new Double : Wrapper
		System.out.println(box.getA());
		
		box.setA("Hello");	//자동 new String
//		System.out.println( box.getA() );
		String s= (String)box.getA();
		//즉, Object 자료형을 쓰면 값을 얻어올 때 마다 다운캐스팅을 해야함
		
		//그래서 객체를 생성할 때(new) 자료형을 결정하는 기법 사용
		Box2<String> box2; //<> 자리에 String을 지저했기에 Box2 클래스 안에 있는 T 글씨는 모두 String으로 변경
		
		
		box2.setA("aaa);"
		
				
		
		//만능처럼 보이지만 일부 불편한 점이 생김
		
		box.setA(10);
		int num= (Integer)box.getA(); //리턴되는 값이 integer가 아닌 object 객체로 인식
		
		
		int b= new Integer(50); //자동으로 50으로 변환됨
		Integer k= 50;
		
		
		
		//단, 기본형()Primitive 자료형은 <>안에 사용 불가
		//Bpx2<int>
		
		Box2<Integer> b4= new Box2<Integer>();
		b4.setA( new Integer (10));
		Integer i=
		
		
		
		
		
		
		
	}

}

//제네릭 여러개 사용가능
class Box3<T


//제네릭 - 클래스를 설계할 때 멤버의 자료형을 결정하지 않음
//글자 바꿔치기 문법: 이 클래스의 객체가 new될 때 <T>위치에 지정된 자료형으로 클래스 안에 있는 T 글씨들이 바꿔치기 됨
class Box2<T>{
	
	T a;
}

Void setA(T a) {
	this.a= a;
}

T getA() {
	return this.a;
}





//만능 박스- 자료형 구분 없이 저장하는 것

class Box{
	Object a; //java의 최상위 클래스(root 클래스) 
	
	void setA(Object a) {
		this.a= a;
	}
	
	Object getA() {
		return this.a;
	}
	
	
}