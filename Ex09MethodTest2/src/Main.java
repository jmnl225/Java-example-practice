
public class Main {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=4;
		
		//사칙연산을 해주는 계산기 객체 생성(기능만 있는 객체)
		Calculator cal=new Calculator();
		
		//덧셈 기능
		int sum=cal.add(a, b);
		System.out.println(sum);
		
		int sub=cal.subtract(a, b);
		System.out.println(sub);
		
		int mul=cal.multiply(a, b);
		System.out.println(mul);
		
		int div=cal.divide(a, b);
		System.out.println(div);
		
		
		
		
		double c=3.5;
		double d=4.6;
		
		System.out.println( cal.add(c, d) );
		System.out.println( cal.subtract(c, d));
		System.out.println( cal.multiply(c, d));
		System.out.println( cal.divide(c, d));
		
		
		
		
		//숫자처럼 보이는 문자열의 덧셈연산
		
		System.out.println("123"+"456");
		
		//문자열을 숫자로 변환해서 덧셈 산술연상을 해주는 기능이 계산기 객체에 있다면?!
		System.out.println( cal.add("123", "456"));
		
		
		
		
		
		//값을 전달 = call by vallue, 
		
		int n=10;
		
		Cal ca= new Cal();
		//전달받은 값을 1 증가시켜주는 기능 실행
		ca.increase(n); //파라미터에 전달한 인수(argument)값만 전달: call by value
		System.out.println(n);
		
		
		// 참조값(주소)를 전달하는 경우 call by reference
		int[] arr= new int[] {10, 20, 30};
	 	ca.increase(arr);
	 	System.out.println("");
		for(int t: arr) {
			System.out.println(t);
		}
		//주소를 전달해서 그 주소안의 값을 변경했기 때문에 처음 가리키고 있던 arr도 영향을 받음!
		
		
		
		
		//가변길이 인자(=파라미터)
		ca.aaa(10);
		ca.aaa(10,20,30);
		
		
		
		
	} //main method 

}//main class


class Cal{
	
	//전달받은 값을 1 증가시키는 기능 - call by vallue
	void increase(int x) {
		x++;
		System.out.println("x: "+ x);
	}
	
	//배열을 파라미터로 받아 그 값들을 1씩 증가시키는 기능
	
	void increase(int[] aaa) {
		for(int i=0; i<aaa.length; i++) {
			aaa[i]++;
		}
		System.out.print(aaa[i]+", ");
	}
	
	
	//가변길이 인자
	void aaa(int... a) { //...을 찍는 순간, a는 배열이 됨
		
	}
	
	
}








