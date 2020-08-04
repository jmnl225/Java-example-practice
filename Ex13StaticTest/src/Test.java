
public class Test {
	
	public int a; //멤버변수 - 인스턴스마다 존재하므로 = 인스턴스 변수
	public static int b; //static 멤버변수 = class에 하나 밖에 없는 변수 = 클래스변수
	
	//생성자 메소드
	public Test(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	//static method도 가능 - class method라고도 부름
	
	void aaa() {
		System.out.println("aaa");
		System.out.println("a: "+a); 
		System.out.println("b: "+b);
	}//aaa 일반 메소드 - 인스턴트 메소드라고도 부름
	
	static void show() {
		System.out.println("show");
		//static method안에서는 인스턴스 변수를 사용할 수 없음!! System.out.println("a: "+a);
		//static method는 객체생성 없이 호출 될 수 있음
		//따라서 instance 변수가 존재하지 않을 수 있으므로 문법적 사용 불허!
		System.out.println("b: "+b);
	}
	
	
	public static final int MAX=10;
	
}
