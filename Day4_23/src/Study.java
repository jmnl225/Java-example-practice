
public class Study {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		
		
//		boolean isKwang;
//		
//		Random card=new Random();
//		int num=card.nextInt(9)+1;
//		System.out.println(num);	
		
		//------------------- 6-4 연습문제 ------------------
		
		
		Student s=new Student();
		s.name="홍길동";
		s.ban=1;
		s.no=1;
		s.kor=100;
		s.eng=60;
		s.math=76;
		
		System.out.println("이름: "+s.name);
		System.out.println("총점: "+s.getTotal());
		System.out.println("평균: "+s.getAverage());
		
		//------------------- 6-5 연습문제 ----------------------
		
		System.out.println("\n----------\n");
		
		Student s1 = new Student("홍길동",2,2,100,60,76);
		
		System.out.println(s1.info());
		

		
	}

}


class SutdaCard{
	
	int num;
	boolean isKwang;
	
	public SutdaCard(int a, boolean b){
		
		this.num=a;
		this.isKwang=b;
		
	}
	
	public SutdaCard(){
		this(1, true); 
	}
	
	String info() { //숫자를 문자열로 반환. 광인 경우 K를 덧붙임
		return num+(isKwang?"K":"");
	}
	
	
	
}

