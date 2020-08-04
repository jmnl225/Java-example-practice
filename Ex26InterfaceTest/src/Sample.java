
public class Sample implements AAA, BBB {//8. 다중구현

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("");
	}
	
	//같은 이름의 추상메소드가 두개 이상이어도, 하나만 사용하면 오버라이드 됨
	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		
	}
	
}
