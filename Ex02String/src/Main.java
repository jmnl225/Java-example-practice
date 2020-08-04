//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//java에서는 문자열(String)을 객체로 관리함!
		//java에서 문자열은 객체.
		//java 의 문자열 = immutable 불변의 특징
		//객체 안의 문자열값은 수정이 불가능!
		
		
		String str=new String("Hello");
		
		System.out.println(str.length());
		
		
		//문자열 대입에 대한 고찰
		int a=10;
		int b;
		b=a;
		
		String str1="Good morning";
		String str2;
		str2=str1;
		
		System.out.println(str1);
		System.out.println(str2);
		
		//String 클래스에 유용한 methods
		
		//1. 문자열 데이터의 길이.
		
		int len=str.length();
		System.out.println(len);
		
		//2. 문자열 값의 비교
		
		int c=10;
		int d=20;
		System.out.println(c==d);
		System.out.println(str=="Hello"); //답은 false
		//"Hello" 새로운 문자열 함수가 만들어짐
		
		System.out.println(str.equals("Hello"));
		System.out.println(str.equals(new String("Hello")));
		
		String s2="Hello";
		System.out.println(str.equals(s2));
		
		System.out.println(new String("Nice").equals("Nice"));
		
		System.out.println("Nice".equals("Nice"));

		
		//2-1. 대소문자 비교
		System.out.println(str.equals("hello")); //대소문자 값을 다르게 봄

		System.out.println(str.equalsIgnoreCase("hello")); //대소문자 상관없이 판정
		
		
		//3. 문자열 안에서 특정 char 을 얻어오는 거!
		
		char abc=str.charAt(0);
		System.out.println(abc);
		
		System.out.println(str.charAt(0)); //리턴값을 출력해라
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		
		//len=str.length(); //길이를 찾는 함수
		for(int i=0;i<str.length();i++) //반복문을 돌 때마다 length값을 호출함
		{
			System.out.print(str.charAt(i));
		}
		
	
		//Scanner class는 char형 입력은 불가능.
		
//		char ch;
//		Scanner scan=new Scanner(System.in);
//		String s3=scan.next(); //문자열로 입력받기
//		ch=s3.charAt(0);
//		System.out.println(ch);
		
		//4. 문자열 안에 특정 문자가 몇 번째 있는지?
		
		int index=str.indexOf('l');
		System.out.println("\n\n\n"+index);
		System.out.println(str.lastIndexOf('l'));
		
		
		//특정 문자열의 위치도 가능!
		System.out.println(str.indexOf("eo")); //찾을 수 없을때는 음수
		
		//특정 위치부터 검사 시작
		System.out.println(str.indexOf('e',2)); //2번 인덱스부터 검사 시작
		
		
		//5. 문자열 안에 특정 문자열이 포함 되었는가?
		String s="Hello world! Hello android! nice world!";
		
		boolean answer=s.contains("world");
		System.out.println(answer);
		
		
		//6. 문자열 결합 중요!!!!!!!!!!!!!!!
		String s3=s.concat("nice android!");
		System.out.println(s);
		
		System.out.println(s3);
		
		System.out.println(s+str1); //concat 보다 + 연산자를 더 많이 사용
		
		
		//7. 특정 문자열로 시작했는가? '성이 김씨인 사람' 
		
		System.out.println(s.startsWith("Hello")); //너 hello로 시작하니?
		System.out.println(s.startsWith("world"));
		
		
		
		//7-1. 특정 문자열로 끝나는가? '이메일 끝 .com'
		
		System.out.println(s.endsWith("world"));
		System.out.println(s.endsWith("d!"));
		System.out.println("\n\n\n\n\n");
		
		
		
		// 8. 대소문자 자동변환
		
		String upclass=s.toUpperCase();
		System.out.println(upclass);
		System.out.println(s); //원본은 바뀌지 않음.
		
		System.out.println(s.toLowerCase()); //리턴값을 바로 출력
		
		
		
		//9. 문자열의 양 끝의 공백문자를 제거
		s="   Hello     ";
		
		System.out.println("["+s+"]");
		
		String s5=s.trim();
		System.out.println(s5.contentEquals("Hello"));
		
		//System.out.println("["+s.trim()+"]");
		
		
		
		
		//10. 특정 문자 변경하기!
		s="Hello world! Hello android! nice android!!";
		String s1=s.replace('H','Y'); //모두 변경됨
		System.out.println(s1);
		s1=s.replace("android", "ios");
		System.out.println(s1);
		
		//중간 공백 문자 없애기
		s2=s.replace(" ", "");
		System.out.println(s2);
		
		
		
		//11. 특정한 문자열 잘라내기!
		
		String s4=s.substring(6);
		System.out.println(s4);
		
		s2=s.substring(6,12); //
		System.out.println(s2);
		
		
		//12. 정렬 array
		
		char ch1='a';
		char ch2='1';
		System.out.println(ch1>ch2);
		
		String s10="aaa";
		String s11="bbb\n\n\n";
		
	
		
		//13. 문자열 안의 특정 문자를 기준으로 문자열을 분리하여 배열로 표시
		s="android:ios:nice:windows:hello";
		
		s.split(":"); //':'을 기준으로 조각내주는 함수
		
		String[] arr=s.split(":");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);		
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);


		
		
		//별외 #####################################
		//String클래스의 static method
		
		//객체생성없이 바로 사용할 수 있는
		
		
		//1. format() 메소드 - printf와 흡사
		
		int h=10;
		int m=15;
		int sec=12;
		
		System.out.println(h+":"+m+":"+sec);
		
		//출력을 특정 포멧으로
		//System.out.printf("%02d:%02d:%02d", h,m,s);
		
		//printf 한계: 콘솔창으로밖에 출력을 할 수 없음.
		
		//GUI에서는 반드시 출력 데이터가 String이어야함.
		
		String sss=h+":"+m+":"+sec; //더하면 문자열이 됨
		System.out.println(sss);
		
		//format() 메소드는 콘솔창이 아니라 문자열로 포멧된 글씨를 리턴해줌
		sss=String.format("%02d:%02d:%02d",h,m,sec);
		System.out.println(sss);
		
		
		//2. valueOf() : 기본형자료형 -> 문자열로
		
		int n=100;
		String s12=String.valueOf(n);
		System.out.println(n); // int형 100이라는 n이 문자열로 바뀜
		System.out.println(s12.length()); 
		
		
		double k=3.14;
		s10=String.valueOf(k);
		System.out.println(s10.length());
		
		//하지만 valueOf는 잘 안 쓴다. 왜?! 결합연산자를 더 자주 씀! s10=k+"";
		
		
		//반대로!! 문자열->기본형
		
		String s7="100";
		
		int g=Integer.parseInt(s7); //Integer 라는 클래스에게 parse 분석해줘 Int 로~!
		System.out.println(g+3);
		
		s11="3.14";
		double w=Double.parseDouble(s11);
		System.out.println(w+0.5);
		
		//rapper class 감싸다. 문자열을 기본형으로 바꾸는 방법.
		
		
		
		
	}
}
