
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4.28 꺄ㅏ하ㅏㅏㅏ ㅏㅏㅏ ><~!!!!! 신나ㅏㅏ~!~!!!!!!
		
		//Animal <- Dog, Cat, Pig 클래스 선언
		Animal[] anis= new Animal[5];
		anis[0]= new Dog();
		anis[1]= new Cat();
		anis[2]= new Dog();
		anis[3]= new Pig();
		anis[4]= new Animal() {
			@Override
			void say() {
				// TODO Auto-generated method stub
				System.out.println("꽥 꽥 !");
			}
		}; //오리 울음소리를 단 한번만 사용
		
		anis[0].say(); //실제 참조하는 객체 Dog의 say()가 발동
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();
		System.out.println();
		
		//추상클래스는 객체생성 불가: 실수를 줄일 수 있음
//		Animal ani= new Animal(); //error
		
		
//		Test t= new test(); //error
		
		//추상클래스의 사용은 직접 new를 하는 것이 아니라, 상속한 클래스를 만들고 이를 객체로 생성하여 사용
		
		
		AAA obj= new AAA(); //생성자 호출
		obj.aaa();
		obj.a= 100;
		Test.ccc(); //static을 부를때는 클래스이름으로 호출
		Test.b= 50;
		System.out.println();
		
		
		//추상클래스의 다형성 사용
		Test t= null; //부모참조변수
		t= new AAA(); //업캐스팅: 부모가 자식을 참조
		t.aaa();
		
		t= new BBB();
		t.aaa();
		
		//Test라는 추상클래스를 사용하고 싶다면
		//항상 새로운 클래스를 만들고 extends를 해서 사용해야한다!
		
		//많이 하다보면 클래스 이름을 명명하는 것이 짜증!!
		//클래스의 이름 없이 새로운 클래스를 정의하는 기법
		// => 익명 클래스 : Anonymous class
		
		Test t2= new Test() {
			//반드시 추상메소드를 오버라이드 해야함
			@Override
			void aaa() {
				// TODO Auto-generated method stub
				System.out.println("익명클래스의 aaa()");
			}
			@Override
			void bbb() {
				// TODO Auto-generated method stub
				System.out.println("익명클래스의 bbb()");
			}
			
			
			//완전히 새로운 메소드 생성
			void output() {
				System.out.println("익명클래스의 메소드");
			}
	
			
			
		}; //익명클래스는 객체를 new, 생성하면서 클래스를 정의하는 기법! ********
		
		
		
		t2.aaa();
//		t2.output(); //익명클래스만의 고유메소드는 참조변수를 만들수 없기에 사용불가
		
		//이름이 있는 클래스는 같은 자료형(class)의 객체를 여러개 생성 가능
		new AAA();
		new AAA();
		
		//익명 클래스는 이름이 없기에 new할때 1개만 생성 가능!
		
		
	}//Main static class end.

}//Main class end.


//Test를 상속한 새로운 class
class BBB extends Test {

	@Override
	void aaa() {
		// TODO Auto-generated method stub
		System.out.println("BBB 클래스의 aaa");
	}
	
	
	void bbb() {
		// TODO Auto-generated method stub
		System.out.println("BBB 클래스의 bbb");
	}
	
	
}





//Test 추상클래스를 상속한 새로운클래스 정의
class AAA extends Test{
	//추상 메소드를 보유한 클래스를 상속받으면 반드시 추상메소드를 오버라이드 해야함!!!!!
	
	//constructor	
	public AAA() {
		System.out.println("AAA 객체생성");
	}
	
	
	@Override
	void aaa() {
		// TODO Auto-generated method stub
		System.out.println("AAA 클래스의 aaa 메소드 오버라이드");
	}
	
	
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("");
	}
	
}



abstract class Animal{//상속을 위한 클래스
	//기능은 없고 이름만 존재하는 메소드: 오버라이드 용
	abstract void say(); // 추상메소드
	
	//추상 메소드를 보유한 클래스는 반드시 추상클래스여야만 함
	
	
	
}

class Dog extends Animal{
	//추상메소드를 보유한 클래스를 상속받으면 반드시!!!
	//추상메소드를 오버라이드 해야할 의무가 있음!!!
	
	void say() {//override
		System.out.println("왈왈!");
	}
	
}

class Cat extends Animal{
	
	void say(){
		System.out.println("야옹~");
	}
}

class Pig extends Animal{
	@Override
	void say() {
		// TODO Auto-generated method stub
		System.out.println("꿀꿀..");
	}
}








