
//다른 인터페이스를 상속하여 새로운 인터페이스 정의하기

public interface SSS extends KKK{//인터페이스끼리는 상속

	//보이진 않지만 이미 aaa(), bbb() 추상메소드를 보유한상태
	
	public abstract void ccc();
	
}
