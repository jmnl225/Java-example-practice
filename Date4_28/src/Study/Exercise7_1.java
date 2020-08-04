package Study;

import java.util.Random;

class SutdaDeck {
	final int CARD_NUM = 20; 
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
	
		for(int i=0;i < cards.length;i++) {
			
			int num = i%10+1; 
			boolean isKwang = (i < 10)&&(num==1||num==3||num==8); 
			cards[i] = new SutdaCard(num,isKwang); 
		}
	}
	
	
	void shuffle() {
		
		for(int i=0; i<cards.length; i++) {
			

			Random ran= new Random();
			int n= ran.nextInt(cards.length)+1;
			SutdaCard tem = cards[i];
			cards[i]= cards[n];
			cards[n]= tem;
			
		}
		
	}
	
	
	
	SutdaCard pick(int index) {
		
		if(index<0||index>=CARD_NUM)
			return null;
		
		return cards[index];
	}
	
	SutdaCard pick() {
		Random ran= new Random();
		int n=ran.nextInt(cards.length)+1;
		return cards[n];
	}
	
	
	
}// SutdaDeck end.


class SutdaCard { 
	int num; 
	boolean isKwang; 
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num=num;
		this.isKwang= isKwang;
	}
	
	//info()대신 Objext클래스의 toString을 오버라이드
	public String toString() {
		return num+(isKwang?"K":"");
	}
	
}




class Exercise7_1 { 
	public static void main(String args[]) { 
		SutdaDeck deck = new SutdaDeck(); 
		
		for(int i=0; i < deck.cards.length;i++) 
			System.out.print(deck.cards[i]+",");
		
		
		
		
		
		
		
	}
}



//class SutdaDeck {
//	final int CARD_NUM = 20;
//	SutdaCard[] cards=new SutdaCard[CARD_NUM];
//	
//	SutdaDeck() {
//		
//		//배열 sutdaCard를 적절히 초기화
//		for(int i=0; i<cards.length; i++) {
//			int m=i%10+1;
//			boolean isKwang = (i<10)&&(m==1||m==3||m==8);
//			
//			cards[i]= new SutdaCard(m, isKwang);
//		}
//
//	}
//	
//
//}
//
//
//class SutdaCard {
//	
//	int num;
//	boolean isKwang;
//	
//	SutdaCard(){
//		this(1, true);
//	}
//
//	public SutdaCard(int num, boolean isKwang) {
//		// TODO Auto-generated constructor stub
//	}
//	
//	//info() 대신 object클래스의 toString()을 오버라이딩
//	
//	public String toString() {
//		return num+(isKwang ? "K":"");
//	}	
//}
//
//
//public class Exercise7_1{
//	public static void main(String args[]) {
//		SutdaDeck deck = new SutdaDeck();
//		
//		for(int i=0; i<deck.cards.length; i++) {
//			System.out.println(deck.cards[i]+", ");
//		}
//	}
//}
//
