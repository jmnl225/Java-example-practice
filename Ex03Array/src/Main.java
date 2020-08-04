import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//자바에서 배열은 객체!!!
		//int형 3칸짜리 배열객체 생성
		//객체는 반드시 heap메모리에 만들어짐 -> new 키워드
		
		int[] arr=new int[3]; //int형 배열 참조변수 생성
		int[] arr2; //참조변수만 만들어둠.
		
		arr2=arr; // arr2 안에 arr 참조변수 주소를 넣음
		
		System.out.println(arr); //참조변수를 출력하면 주소가 나와야하지만! arr이 갖고있는 객체의 정보가 나옴 : 해시코드=java에서 쓰는 address. 논리적주소

		System.out.println(arr[0]); //0번 요소의 값 출력
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		//배열객체는 본인의 길이값을 갖고있는 멤버변수가 있음!!
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		//배열 생성하면서 초기화하기

		int[] arr3=new int[] {10, 20, 30}; //초기화할때 [] 괄호 안에 갯수를 쓰지 않음
		
		//초기화문법의 약식표현
		int[] arr4 = {40,50,60};
		
		
		//배열의 길이값을 변수로 지정하는 것이 가능
		int n=3;
		int[] arr5=new int[n];	
		
		
		//변수의 길이를 입력받을 수도 있음
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int[] arr6=new int [6];
		
		
		for(int i=0; i<arr6.length; i++)
		{
			System.out.println(arr6[i]);
		}
		
		
		//초기화할때 값도 변수로 주는 것이 가능
		
		int k=6;
		int[] arr7=new int[] {k, k+1, k+2};
		
		
		//길이가 0개짜리인 배열도 가능함
		int[] arr8=new int[0]; // == int[] arr8=new int[] {};
		System.out.println(arr8.length);
		
		
		//배열 참조변수끼리 대입이 가능 (공유)
		double[] arr9=new double[] {1.1, 2.2, 3.3};
		double[] arr10;
		arr10=arr9;
		
		for(int i=0; i<arr10.length; i++) {
			System.out.print(arr10[i]+",  ");
		}
		
		System.out.println("\n");
		arr10[1]=3.14;	
		
		for(int i=0; i<arr9.length; i++) {
			System.out.print(arr9[i]+",  ");
		}
		
		System.out.println();
		
	
		//배열값을 복사 하고싶다면?? 요소끼리 대입해야함
		
		int[] arr11=new int[] {10,20,30};
		int[] arr12=new int[arr11.length];
		arr12[0]=arr11[0];
		arr12[1]=arr11[1]; //만약 숫자가 많아진다면?
		
		for(int i=0; i<arr11.length; i++)
		{
			arr12[i]= arr11[i];
		}
		
		
		//arr11과 arr12는 서로 다른 객체를 참조함.
		
		
		
		//============================================================================
		//기본형이 아닌 참조형 자료형의 배열
		
		
		String s1=null, s2=null, s3=null; // 주소값에 아무것도 없음. 아무것도 가리키지 않음
		
		System.out.println( s1 );
		
		String[] arr14= new String[3];
		
		arr14[0] = new String("Hello");
		arr14[1] = new String("Nice");
		arr14[2] = "aaa"; //자동 new String
		
		System.out.println(arr14);
		System.out.println(arr14[0]);
		System.out.println(arr14[1]);
		
		
		System.out.println(arr14.length); //멤버변수
		System.out.println(arr14[0].length()); //함수 (method) 참조변수가 가리키는 String의 함수
		
		
		
		
		//참조형 배열의 초기화
		int[] arr1=new int[] {10, 20, 30};
		String[] arr16=new String[] {new String("Hello"), new String("Good moring"), new String("android")};
		String[] arr17=new String[] {"a", "b", "c"};
		String[] arr18= {"my", "behind", "so"};
		
		
		
		
		//다른 참조형 배열
		
		Random[] arr19=new Random[3]; //랜덤이라는 배열을 만들었을 뿐, 값을 입력하지 않음
		arr19[0]=new Random(); //인덱스 0에 랜덤을 넣음!!! 꼭 넣어야함~!!!!
		
		int m=arr19[0].nextInt(100);
		System.out.println(m);
		
		
		Scanner[] arr20=new Scanner[3];
		
		arr20[0]=new Scanner(System.in);
		
		int h=arr20[0].nextInt();
		System.out.println(h);
		
		
		
		//프로그래머 정의 자료형 class-참조형!!
		
		Student[] stus= new Student[3]; //배열을 참조하는 참조변수
		stus[0]= new Student();
		
		stus[0].name="sam";
		
		//참조형 배열 객체는 잠조변수를 갖고있는 객체입니다.
		
		
		System.out.println("\n-------------------\n");
		
		
		//JAVA 새로운 for문법 : 확장된 for문 / for each문
		int[] nums= new int[3];
		nums[0]= 10;
		nums[1]= 20;
		nums[2]= 30;
		
//		for(int i=0; i<nums.length; i++) {
//			int t=nums[i]
//			System.out.println(t);
//		}
		
		//확장된 for문
		for( int t : nums) {
			System.out.println(t);
		}
		
		double[] aaa= new double[5];
		
		aaa[0]=3.14;
		aaa[1]=5.55;
		aaa[2]=4.12;
		aaa[3]=3.33;
		
		for(double t:aaa) {
			System.out.println(t);
		}
		
		String[] bbb=new String[] {"aaa", "bbb", "ccc"};
		
		for(String t:bbb) {
			System.out.println(t);
		}
		
		
		
		
		
		
		
		
		
		
	} // main

} //main class


//프로그래머가 정의하는 자료형을 생성할 수 있음

class Student{
	String name;
	int kor;
	int eng;
	double aver;
}










