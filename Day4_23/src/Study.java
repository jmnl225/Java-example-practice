
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
		
		//------------------- 6-4 �������� ------------------
		
		
		Student s=new Student();
		s.name="ȫ�浿";
		s.ban=1;
		s.no=1;
		s.kor=100;
		s.eng=60;
		s.math=76;
		
		System.out.println("�̸�: "+s.name);
		System.out.println("����: "+s.getTotal());
		System.out.println("���: "+s.getAverage());
		
		//------------------- 6-5 �������� ----------------------
		
		System.out.println("\n----------\n");
		
		Student s1 = new Student("ȫ�浿",2,2,100,60,76);
		
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
	
	String info() { //���ڸ� ���ڿ��� ��ȯ. ���� ��� K�� ������
		return num+(isKwang?"K":"");
	}
	
	
	
}

