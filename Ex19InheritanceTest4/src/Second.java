
public class Second extends First {
	
	//이미 First의 a변수를 보유.
	
	private int b;
	
	//출력기능을 만들지 않아도 이미 First의 show()가 있는 상태
	//first 의 출력기능이 마음에 들지 않음!
	//method override
	public void show() {
//		System.out.println(); //error: a는 프라이빗
//		show(); //재귀호출
		//부모클래스를 지칭하는 키워드 super
		
		super.show();
		System.out.println("b: "+ b);
	}
	
	
	
}
