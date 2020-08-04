/*
import java.util.Scanner;
public class Example {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int num1,num2;
		
		System.out.println("정수1 을 입력: ");
		num1=scan.nextInt();
		
		System.out.println("정수2 를 입력: ");
		num2=scan.nextInt();
		
		System.out.println("정수1 * 정수2 ="+num1*num2);
		
		scan.close();
	}
}
*/

/*
import java.util.Scanner;
public class Example{
	
	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("정수1을 입력: ");
		num1=scan.nextInt();
		
		System.out.println("정수2를 입력: ");
		num2=scan.nextInt();
		
		System.out.println("정수3을 입력:");
		num3=scan.nextInt();
		
		System.out.println(num1+("*")+num2+("+")+num3+("=")+((num1*num2)+num3));
	
	}
}
*/

/*

import java.util.Scanner;
 
public class Example{
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("정수를 입력하면 수의 제곱을 출력");
		
		int num;
		
		num=scan.nextInt();
		
		System.out.println("계산 결과 :"+num*num);
		
	}
	
}
*/

/*
 import java.util.Scanner;
 

public class Example{
	
	public static void main(String[] args) {
		
		System.out.println("입력 받은 수의 나눗셈 몫과 나머지의 값 출력");
		
		int num1, num2;
		
		Scanner scan=new Scanner(System.in);
				
		System.out.println("분모 입력: ");
		num1=scan.nextInt();
		
		System.out.println("분자 입력: ");
		num2=scan.nextInt();
		
		System.out.println("계산 결과의 몫: "+(num1/num2));
		System.out.println("계산 결과의 나머지: "+ num1%num2);
		
	}
}

*/

/*
import java.util.Scanner;

public class Example{
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("입력받은 세 개의 숫자를 연산하는 프로그램");
		
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		System.out.println("("+num1+"-"+num2+")"+"*"
		+"("+num2+("+")+num3+")"+"*"
	    +"("+num3+("-")+num1+")"+"="
		+(num1-num2)*(num2+num3)*(num3-num1));
		
	}
	
}
*/

/*
import java.util.Scanner;

public class Example{
	
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("마일을 킬로미터로 변환하는 프로그램");
		
		int mile;
		
		mile=scan.nextInt();
		
		System.out.println(mile+"마일은"+(mile*1.609)+"킬로미터 입니다.");
		
	}
}
*/

/*
import java.util.Scanner;

public class Example{
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("원의 반지름을 입력받아 면적을 계산, 출력하는 프로그램\n");
		
		double r;
		
		r=scan.nextDouble();
		System.out.println("원의 면적: "+(3.14*r*r));
		
	}
}
*/

/*
import java.util.Scanner;

public class Example{
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int i;
		
		i=scan.nextInt();
		
		for(int j=0; j<i; j++)
		{
			System.out.println("Hello World!");
		}
		
	}
}
*/

/*
import java.util.Scanner;

public class Example{
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int num;
		
		num=scan.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			System.out.print(3*i+"  ");
		}
		
	}
}
*/

/*
import java.util.Scanner;

public class Example{
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int num, i;
		i=0;
		while(true)
		{
			num=scan.nextInt();
			i=i+num;
			
			
			if(num==0) {
				System.out.println(i);
				break;
			}
		}
		
				
	}
} 
*/

/*
import java.util.Scanner;

public class Example{
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int num;
		num=scan.nextInt();
		
		for(int i=9;i>0;i--)
		{
			System.out.println(num+" * "+i+" = "+num*i);
		}
		
	}
}
*/

import java.util.Scanner;

public class Example{
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int howmany, num, total;
		howmany=scan.nextInt();
		
		total=0;
		for(int i=0; i<howmany; i++)
		{
			num=scan.nextInt();
			total=num+total;
			System.out.println(total);
		}		
		scan.close();
		//System.out.println("\n결과값: ",howmany/total);
	}
}









