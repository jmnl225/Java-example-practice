import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//애니멀(dog, cat, pig) 객체를 만들어내는
		//애니멀 공장객체 생성
		
		AnimalFactory af= new AnimalFactory();
		
		//다운캐스팅
		
		
//		Dog d= af.makeAnimal(1); 
//		//이 메소드의 리턴 자료형이 Animal로 보이기 때문에 Dog 객체라고 명시적으로 형변환을 해야함!!!
//		d.say();
//		d.guardHouse();
//		
//		Cat c= (Cat)af.makeAnimal(2);
//		c.say();
//		c.handleDeacon();
//		
//		Pig p= (pig)af.makeAnimal(3);
//		p.say();
//		p.eatAndEat();
//		
//		
//		//Animal 참조변수 하로 여러 다른유니닛 ㅏㄴ들기
//		Animal ani5=null;
//		ani5=
		
		//ani5 Dog만의 고유기능 사용불가

				
		//Animal = gardhouse를 만들면 모든 ㅈㅇ
		//ani 형변환 우선순위
		
				
		//------------------------------------------------------------		
				
				
		//응용예제
		//랜덤하게 동물캐릭터를 만들고 싶다면..
		//랜덤하게 5마리의 객체 생성하고 이를 제어!
				
		Random rnd= new Random();

		
//		int n= rnd.nextInt(3)+1;
		
//		Animal an= af.makeAnimal(n); //Dog or Cat or Pig
//		an.say();
		
		
		Animal[] anis= new Animal[5];
		for(int i=0; i<anis.length; i++)
		{
			int n= rnd.nextInt(3)+1;
			anis[i]=af.makeAnimal(n);
//			anis[i].say();
		}
		
		//각 객체들의 say() 실행
		for(int i=0; i<anis.length; i++) {
			anis[i].say();
//			anis[i].sleep();
			
			//만들어진 객체들의 고유기능 사용
			//새로운 연산자! : instanceof
			// 어떤 객체의 클래스가 맞는가를 알려주는 연산자
			
			if( anis[i] instanceof Dog ) {
				Dog dog= (Dog)anis[i];
				dog.guardHouse();
			}
			else if( anis[i] instanceof Cat ) {
				Cat cat= (Cat)anis[i];
				cat.handleDeacon();
			}
			else if( anis[i] instanceof Pig ) {
				((Pig)anis[i]).eatAndEat();
			}
			
		}		
		
		
		//Animal 클래스는 객체를 만들기위해 정의한 클래스가 아님
		//실수로 Animal을 객체로 만들 수도 있음.
		//Animal a= new Animal();
		//a.say(); //기능이 동작할 리 없음!
		//프로그램에서 동작하지 않는 기능메소드는 존재이유가 없음
		
		//이 Animal이 실수로라도 생성(new) 되지 않도록 문법적으로 막고싶다!
		
		//abstract 추상 클래스로 만들면 new로 객체 생성 불가!
		
		
	}

}
