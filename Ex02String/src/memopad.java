
import java.util.Scanner;

//��1

/*
public class memopad {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String word=scan.next();
		System.out.println(word);
		
		//���ڿ��� �� ���� �˾ƾ���.
		
		int len=word.length();
		
		System.out.println(len); //test
		
		char ch;
		
		for(int i=0; i<len; i++)
		{
			ch=word.charAt(i);
			System.out.println((char)(ch+1));
		}
		
		scan.close();
		
	}
}
*/


//��2

/*
public class memopad{
	
	public static void main(String[] args) {
		
		String s1;
		String s2;
		
		Scanner scan=new Scanner(System.in);
		s1=scan.next();
		s2=""; //~~~~~~~~~~~~~~�̰� ��¥ ~~~~~~~~~ �ʹ� �� �� �ƴϳİ�~~~~~~~~~~~~~~

		
		//System.out.println(reverseStr(s1));
		
		int len=s1.length();
		for(int i=len-1; i>=0; i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		
		scan.close();
	}
}
*/


//��3

/*
public class memopad{
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String user=scan.next();
		
		char index=user.charAt(0);
		
		for(int i=1; i<user.length(); i++)
		{
			index=(index<user.charAt(i))?user.charAt(i):index;
		}
		
		System.out.println(index);
		
		scan.close();
	}
}
*/

//��4

/*
public class memopad{
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		
		System.out.println(input.trim());
		
	}
}
*/


//��5

public class memopad{
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String fir, sec, thi, f;
		
	}
}




