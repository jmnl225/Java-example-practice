/*
import java.util.Scanner;
public class Example {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int num1,num2;
		
		System.out.println("����1 �� �Է�: ");
		num1=scan.nextInt();
		
		System.out.println("����2 �� �Է�: ");
		num2=scan.nextInt();
		
		System.out.println("����1 * ����2 ="+num1*num2);
		
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
		
		System.out.println("����1�� �Է�: ");
		num1=scan.nextInt();
		
		System.out.println("����2�� �Է�: ");
		num2=scan.nextInt();
		
		System.out.println("����3�� �Է�:");
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
		
		System.out.println("������ �Է��ϸ� ���� ������ ���");
		
		int num;
		
		num=scan.nextInt();
		
		System.out.println("��� ��� :"+num*num);
		
	}
	
}
*/

/*
 import java.util.Scanner;
 

public class Example{
	
	public static void main(String[] args) {
		
		System.out.println("�Է� ���� ���� ������ ��� �������� �� ���");
		
		int num1, num2;
		
		Scanner scan=new Scanner(System.in);
				
		System.out.println("�и� �Է�: ");
		num1=scan.nextInt();
		
		System.out.println("���� �Է�: ");
		num2=scan.nextInt();
		
		System.out.println("��� ����� ��: "+(num1/num2));
		System.out.println("��� ����� ������: "+ num1%num2);
		
	}
}

*/

/*
import java.util.Scanner;

public class Example{
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("�Է¹��� �� ���� ���ڸ� �����ϴ� ���α׷�");
		
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
		
		System.out.println("������ ų�ι��ͷ� ��ȯ�ϴ� ���α׷�");
		
		int mile;
		
		mile=scan.nextInt();
		
		System.out.println(mile+"������"+(mile*1.609)+"ų�ι��� �Դϴ�.");
		
	}
}
*/

/*
import java.util.Scanner;

public class Example{
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("���� �������� �Է¹޾� ������ ���, ����ϴ� ���α׷�\n");
		
		double r;
		
		r=scan.nextDouble();
		System.out.println("���� ����: "+(3.14*r*r));
		
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
		//System.out.println("\n�����: ",howmany/total);
	}
}









