
public class First {
	
	//접근 제한자가 부여된 멤버변수
	
	private int a;
	int b; //접근제한자가 없으면 default
	protected int c;
	public int d;
	
	//멤버 메소드
	void aaa() {
		//같은 클래스 안에서는 접근제한자 의미없음
		a= 10;
	}
	
	//f.aaa(); //같은 패키지 안에서 default 접근제한 접근가능
	
	//다른 패키지 클래스 객체생성

}
