
public class First {
	
	//접근 제한자가 적용된 멤버변수
	
	private int a;
	
	
	
	//생성자메소드: Constructor
	public First() {
		System.out.println("First 객체 생성");
	}
	
	
	//파라미터를 전달받는 생성자 메소드 오버로딩
	public First(int a) {
		this.a=a;
		System.out.println("First 객체 생성 int");
	}
	
	
	//멤버변수 값 출력 기능
	
	public void showFirst() {
		System.out.println("a: "+ a);
		
	}
	
	
	
	
	
	
	
	
	
}
