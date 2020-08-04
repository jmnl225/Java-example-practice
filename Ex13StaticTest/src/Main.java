
public class Main {
	public static void main(String[] args) {
		
		//static 지역변수는 존재하지 않는다
		
		//static int a; // 지역변수는 static을 사용할 수 없다!
		
		Test t1=new Test(10, 20);
		Test t2=new Test(30, 50);
		Test t3=new Test(70, 90);
		
		t1.a=100;
		System.out.println(t1.a);
		System.out.println(t2.a);
		System.out.println(t3.a);
		System.out.println();
		
		//static 변수는 Text클래스 객체 갯수와 상관없이 1개 이므로 변경하면 모두 영향을 받음
		t1.b= 200;
		System.out.println(t1.b);
		System.out.println(t2.b);
		System.out.println(t3.b);
		System.out.println();
		
		//static 변수는 객체마다 존재하지 않고, 그 클래스에 하나만 존재
		//객체명. 을 쓰는 표기법이 이상
		//그래서 static 변수는 객체명. 대신 
		//class명. 을 선호!!
		
		Test.b= 500;
		System.out.println(Test.b);
		System.out.println();

		
		//static을 사용하는 예시
		//어떤 클래스의 객체가 현재 몇개인지 확인하고 싶을때
		
		
		
		new First();new First();new First();new First();new First();new First();
		
		//static키워드는 메소드에도 적용 가능
		
		t1.aaa(); //일반 메소드 호출
		//Test.aaa(); //일반 메소드는 클래스명. 쓰면 에러
		
		//t1.show(); //허용은 되지만 잘 안 씀
		Test.show(); // 클래스의 메소드
		
		//클래스 메소드의 특징은 객체 생성 없이도 사용할 수 있다!
		
		
		aaa.obj.show();
		
		//그러고보니!
		System.out.println();
		
		//aaa.obj.kkk(); //static은 객체명 안대!
		//aaa.bbb.kkk(); //aaa클래스 안에 bbb클래스가 존재하는 게 아니므로 에러!!!
		
		bbb.kkk();
		
		System.out.println(Test.MAX);
		
		
		
	}
}
