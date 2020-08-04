
public class Main {
	
	public static void main(String[] args) {
		
		
		//예) 앱에 동물캐릭터 3종류 (Dog, Cat, Pig)
		Dog d= new Dog();
		Cat c= new Cat();
		Pig p= new Pig();
		
		d.say();
		c.say();
		p.say();
		System.out.println();
		
		
		//만약 이런 동물객체들이 여러마리라면?
		//Dog 5, Cat 10, Pig 3
		
		//배열을 쓰면 여러객체를 하나로 관리하는 것이 가능
//		Dog[] dogs= new Dog[5];
//		Cat[] cats= new Cat[10];
//		Pig[] pigs= new Pig[3];
		
		//가능하지만 캐릭터별로 배열을 묶어주기에 전체를 하나로 제어할 수 없음
		//캐릭터별로 묶는 것이 아닌 하나의 배열에 모든 객체를 묶어서 사용하면 더 수월하게 사용가능
		
		//Dog, Cat, Pig를 하나로 묶는 것이 불가능. => 서로 다른 class(자료형
		
		//이럴때 이 Dog, Cat, Pig를 모두 참조할 수 있는
		//만능 자료형같은 것이 있다면 하나의 배열로 묶는 것이 가능
		
		// Dog, Cat, Pig 가 Animal의 상속관계라면?
		// Animal 참조변수로 Dog, Cat, Pig 객체 참조가 가능함
		
		Animal ani= (Animal)new Dog(); //업캐스팅[부모-자식 참조]
		Animal ani2= new Cat();
		Animal ani3= new Pig();
		
		
//		double a=10; //int 10을 자동으로 double로 형변환
//		int b= (int)3.14; //직접 형변환을 표기해줌. 
		
		ani.say();//참조변수가 참조하는 실제객체의 say()발동
		ani2.say();
		ani3.say();
		System.out.println();
		
		//이런식이면 animal참조변수를 배열로 만들면..
		//여러개를 더 수월하게 관리제어가 가능!
		
		Animal[] anis= new Animal[5]; //Animal 참조변수 5개를 만든 것!!!! 모두 안에는 null값을 갖고있다. 객체를 가리키는 작업을 꼭!!!!!! 해줘야함.
		anis[0].say();
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();
		
		anis[0]=new Dog();
		anis[1]=new Cat();
		anis[2]=new Dog();
		anis[3]=new Pig();
		anis[4]=new Cat();
		
		anis[0].say();
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();
		System.out.println();
		
		for(int i=0; i<anis.length; i++) {
			anis[i].say();
		}
		System.out.println();
		
		
		//확장된 for문
		for(Animal t : anis) {
			t.say();
		}
		
		
		
		//다형성은 배열로만 사용되진 않음!
		//메소드의 파라미터나 리턴타입으로도 매우 유용하게 사용
		
		
		
		
		
	}
		
}
