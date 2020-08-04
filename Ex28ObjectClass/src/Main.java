import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Test t= new Test();
		
		//Test Ŭ������ ��������� �ƹ��͵� ��ӹ��� �ʾ����� �̹� �ڵ����� Object��� Ŭ������ ��ӵ� ����
		//�׷��� ���� ������ ���� �޼ҵ带 �̹� ����
		
		//t.toString();//�̷� �޼ҵ�
		
		//��� Object Ŭ������ �ֿ� �޼ҵ�
		//1. toString() : ��ü�� �Ұ��ϴ� ���ڿ��� �������ִ� �޼ҵ�
		//2. equals(Object obj) : ���޹��� obj�� ���� ��ü���� ���θ� ����[true, false]
		//3. hashCode() : ��ü�� �ؽ��ڵ带 ��ȯ
		//4. getclass() : Ŭ������ ������ ���� ��ü�� ���� [����Ÿ�� Class]
		//5. wait(), notify(), notifyAll() - �̰� Thread �������� �Ұ�
		
		//1) toString() �޼ҵ�: ��ü�� �Ұ��ϴ� ���ڿ��� ����
		String s= t.toString();
		System.out.println(s); //[default: Ŭ������@�ؽ��ڵ�]
		
		Test t2= new Test();
		String s2= t2.toString();
		System.out.println(s2);
		
		
		System.out.println(t2); // ���������� ����ϸ� �ּҰ�(�ؽ��ڵ�)�� ����
		
		//System.out.println(); �޼ҵ��� �ɷ�: ���������� ����ϸ� �ؽ��ڵ�� �ٲ���
		
		//���ܻ�Ȳ! : String Ŭ����
		String s3= new String("Hello");
		System.out.println( s3 ); //object�� �������̵�
		//String �� toString() �޼ҵ�� �������̵带 �ؼ� ��ɺ���
		
		//�������� FirstŬ������ ����� toString()�� �������̵� �غ���
		First f= new First();
		System.out.println( f ); //�ڵ����� .toString() 
		
		//�ǹ������� �ٷ� toString�� �������̵�

		System.out.println("---------2--------");
		
		//2) equals(Object obj) : ���� ��ü���� Ȯ���ϴ� �޼ҵ�
		Test t4= new Test();
		Test t5= new Test();
		System.out.println( t4.equals(t5) );
		
		Test t6= t4;
		
		System.out.println(t4.equals(t6)); //true
		
		//��� �� ��� �� �� ��
		System.out.println(t4==t5); //�ּҳ��� ��
		
		
		
		//�� equals()�� ��������� �� �񱳷� ����ϴ� Ŭ����: String Ŭ����
		String s4= new String("Hello");
		String s5= new String("Hello");
		
		System.out.println(s4==s5); //���� ��ü�� �ƴϹǷ� false
		System.out.println(s4.equals(s5));
		//String Ŭ������ equals �޼ҵ��� ����� ������� �� �񱳷� ����(�������̵�)
		
		System.out.println("-------3-------");
		
		//3) getClass() : Ŭ������ ������ ���� ��ü�� ����
		Test t7= new Test();
		Class a= t7.getClass();
		System.out.println(a.getName());
		System.out.println(a.getSuperclass());
		System.out.println(a.getPackage());
		System.out.println(a.getFields());
		
		//getClass�� �ٿ���
		Test.class.getName();
		
		
		System.out.println("---------4--------");
		
		//4) hashCode() : ��ü�� ���� �ּ�[�ڹٿ����� ��ü�ּ�]
		Test t8= new Test();
		int hc= t8.hashCode();
		System.out.println( hc ); //�ڹٿ����� ��ü�ּҷ� �����ص� ����: 10������ ���
		System.out.println(t8.hashCode()); //16������ ���
		System.out.println(Integer.toHexString(hc));
		
		
		//ObjectŬ������ java�� �����ϴ� ��� Ŭ������ �ֻ���(root) Ŭ����
		//��� Ŭ������ �θ�Ŭ������ ��
		// -> �θ����������� �ڽ��� ������ �� �����Ƿ� 
		// Object���������� ��� ��ü�� �����ϴ� ���� ������ - ���� ��������ó��!
		
		Object obj = null;
		obj= new Test(); //��ĳ����
		obj= new Random();
		obj= new String();
		obj= new Scanner(System.in);
		obj= new ArrayList(); //ctr+sht+o
		
		
		
		
	}
}
