//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//java������ ���ڿ�(String)�� ��ü�� ������!
		//java���� ���ڿ��� ��ü.
		//java �� ���ڿ� = immutable �Һ��� Ư¡
		//��ü ���� ���ڿ����� ������ �Ұ���!
		
		
		String str=new String("Hello");
		
		System.out.println(str.length());
		
		
		//���ڿ� ���Կ� ���� ����
		int a=10;
		int b;
		b=a;
		
		String str1="Good morning";
		String str2;
		str2=str1;
		
		System.out.println(str1);
		System.out.println(str2);
		
		//String Ŭ������ ������ methods
		
		//1. ���ڿ� �������� ����.
		
		int len=str.length();
		System.out.println(len);
		
		//2. ���ڿ� ���� ��
		
		int c=10;
		int d=20;
		System.out.println(c==d);
		System.out.println(str=="Hello"); //���� false
		//"Hello" ���ο� ���ڿ� �Լ��� �������
		
		System.out.println(str.equals("Hello"));
		System.out.println(str.equals(new String("Hello")));
		
		String s2="Hello";
		System.out.println(str.equals(s2));
		
		System.out.println(new String("Nice").equals("Nice"));
		
		System.out.println("Nice".equals("Nice"));

		
		//2-1. ��ҹ��� ��
		System.out.println(str.equals("hello")); //��ҹ��� ���� �ٸ��� ��

		System.out.println(str.equalsIgnoreCase("hello")); //��ҹ��� ������� ����
		
		
		//3. ���ڿ� �ȿ��� Ư�� char �� ������ ��!
		
		char abc=str.charAt(0);
		System.out.println(abc);
		
		System.out.println(str.charAt(0)); //���ϰ��� ����ض�
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		
		//len=str.length(); //���̸� ã�� �Լ�
		for(int i=0;i<str.length();i++) //�ݺ����� �� ������ length���� ȣ����
		{
			System.out.print(str.charAt(i));
		}
		
	
		//Scanner class�� char�� �Է��� �Ұ���.
		
//		char ch;
//		Scanner scan=new Scanner(System.in);
//		String s3=scan.next(); //���ڿ��� �Է¹ޱ�
//		ch=s3.charAt(0);
//		System.out.println(ch);
		
		//4. ���ڿ� �ȿ� Ư�� ���ڰ� �� ��° �ִ���?
		
		int index=str.indexOf('l');
		System.out.println("\n\n\n"+index);
		System.out.println(str.lastIndexOf('l'));
		
		
		//Ư�� ���ڿ��� ��ġ�� ����!
		System.out.println(str.indexOf("eo")); //ã�� �� �������� ����
		
		//Ư�� ��ġ���� �˻� ����
		System.out.println(str.indexOf('e',2)); //2�� �ε������� �˻� ����
		
		
		//5. ���ڿ� �ȿ� Ư�� ���ڿ��� ���� �Ǿ��°�?
		String s="Hello world! Hello android! nice world!";
		
		boolean answer=s.contains("world");
		System.out.println(answer);
		
		
		//6. ���ڿ� ���� �߿�!!!!!!!!!!!!!!!
		String s3=s.concat("nice android!");
		System.out.println(s);
		
		System.out.println(s3);
		
		System.out.println(s+str1); //concat ���� + �����ڸ� �� ���� ���
		
		
		//7. Ư�� ���ڿ��� �����ߴ°�? '���� �达�� ���' 
		
		System.out.println(s.startsWith("Hello")); //�� hello�� �����ϴ�?
		System.out.println(s.startsWith("world"));
		
		
		
		//7-1. Ư�� ���ڿ��� �����°�? '�̸��� �� .com'
		
		System.out.println(s.endsWith("world"));
		System.out.println(s.endsWith("d!"));
		System.out.println("\n\n\n\n\n");
		
		
		
		// 8. ��ҹ��� �ڵ���ȯ
		
		String upclass=s.toUpperCase();
		System.out.println(upclass);
		System.out.println(s); //������ �ٲ��� ����.
		
		System.out.println(s.toLowerCase()); //���ϰ��� �ٷ� ���
		
		
		
		//9. ���ڿ��� �� ���� ���鹮�ڸ� ����
		s="   Hello     ";
		
		System.out.println("["+s+"]");
		
		String s5=s.trim();
		System.out.println(s5.contentEquals("Hello"));
		
		//System.out.println("["+s.trim()+"]");
		
		
		
		
		//10. Ư�� ���� �����ϱ�!
		s="Hello world! Hello android! nice android!!";
		String s1=s.replace('H','Y'); //��� �����
		System.out.println(s1);
		s1=s.replace("android", "ios");
		System.out.println(s1);
		
		//�߰� ���� ���� ���ֱ�
		s2=s.replace(" ", "");
		System.out.println(s2);
		
		
		
		//11. Ư���� ���ڿ� �߶󳻱�!
		
		String s4=s.substring(6);
		System.out.println(s4);
		
		s2=s.substring(6,12); //
		System.out.println(s2);
		
		
		//12. ���� array
		
		char ch1='a';
		char ch2='1';
		System.out.println(ch1>ch2);
		
		String s10="aaa";
		String s11="bbb\n\n\n";
		
	
		
		//13. ���ڿ� ���� Ư�� ���ڸ� �������� ���ڿ��� �и��Ͽ� �迭�� ǥ��
		s="android:ios:nice:windows:hello";
		
		s.split(":"); //':'�� �������� �������ִ� �Լ�
		
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


		
		
		//���� #####################################
		//StringŬ������ static method
		
		//��ü�������� �ٷ� ����� �� �ִ�
		
		
		//1. format() �޼ҵ� - printf�� ���
		
		int h=10;
		int m=15;
		int sec=12;
		
		System.out.println(h+":"+m+":"+sec);
		
		//����� Ư�� ��������
		//System.out.printf("%02d:%02d:%02d", h,m,s);
		
		//printf �Ѱ�: �ܼ�â���ιۿ� ����� �� �� ����.
		
		//GUI������ �ݵ�� ��� �����Ͱ� String�̾����.
		
		String sss=h+":"+m+":"+sec; //���ϸ� ���ڿ��� ��
		System.out.println(sss);
		
		//format() �޼ҵ�� �ܼ�â�� �ƴ϶� ���ڿ��� ����� �۾��� ��������
		sss=String.format("%02d:%02d:%02d",h,m,sec);
		System.out.println(sss);
		
		
		//2. valueOf() : �⺻���ڷ��� -> ���ڿ���
		
		int n=100;
		String s12=String.valueOf(n);
		System.out.println(n); // int�� 100�̶�� n�� ���ڿ��� �ٲ�
		System.out.println(s12.length()); 
		
		
		double k=3.14;
		s10=String.valueOf(k);
		System.out.println(s10.length());
		
		//������ valueOf�� �� �� ����. ��?! ���տ����ڸ� �� ���� ��! s10=k+"";
		
		
		//�ݴ��!! ���ڿ�->�⺻��
		
		String s7="100";
		
		int g=Integer.parseInt(s7); //Integer ��� Ŭ�������� parse �м����� Int ��~!
		System.out.println(g+3);
		
		s11="3.14";
		double w=Double.parseDouble(s11);
		System.out.println(w+0.5);
		
		//rapper class ���δ�. ���ڿ��� �⺻������ �ٲٴ� ���.
		
		
		
		
	}
}
