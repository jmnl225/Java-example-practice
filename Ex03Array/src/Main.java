import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//�ڹٿ��� �迭�� ��ü!!!
		//int�� 3ĭ¥�� �迭��ü ����
		//��ü�� �ݵ�� heap�޸𸮿� ������� -> new Ű����
		
		int[] arr=new int[3]; //int�� �迭 �������� ����
		int[] arr2; //���������� ������.
		
		arr2=arr; // arr2 �ȿ� arr �������� �ּҸ� ����
		
		System.out.println(arr); //���������� ����ϸ� �ּҰ� ���;�������! arr�� �����ִ� ��ü�� ������ ���� : �ؽ��ڵ�=java���� ���� address. �����ּ�

		System.out.println(arr[0]); //0�� ����� �� ���
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		//�迭��ü�� ������ ���̰��� �����ִ� ��������� ����!!
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		//�迭 �����ϸ鼭 �ʱ�ȭ�ϱ�

		int[] arr3=new int[] {10, 20, 30}; //�ʱ�ȭ�Ҷ� [] ��ȣ �ȿ� ������ ���� ����
		
		//�ʱ�ȭ������ ���ǥ��
		int[] arr4 = {40,50,60};
		
		
		//�迭�� ���̰��� ������ �����ϴ� ���� ����
		int n=3;
		int[] arr5=new int[n];	
		
		
		//������ ���̸� �Է¹��� ���� ����
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int[] arr6=new int [6];
		
		
		for(int i=0; i<arr6.length; i++)
		{
			System.out.println(arr6[i]);
		}
		
		
		//�ʱ�ȭ�Ҷ� ���� ������ �ִ� ���� ����
		
		int k=6;
		int[] arr7=new int[] {k, k+1, k+2};
		
		
		//���̰� 0��¥���� �迭�� ������
		int[] arr8=new int[0]; // == int[] arr8=new int[] {};
		System.out.println(arr8.length);
		
		
		//�迭 ������������ ������ ���� (����)
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
		
	
		//�迭���� ���� �ϰ�ʹٸ�?? ��ҳ��� �����ؾ���
		
		int[] arr11=new int[] {10,20,30};
		int[] arr12=new int[arr11.length];
		arr12[0]=arr11[0];
		arr12[1]=arr11[1]; //���� ���ڰ� �������ٸ�?
		
		for(int i=0; i<arr11.length; i++)
		{
			arr12[i]= arr11[i];
		}
		
		
		//arr11�� arr12�� ���� �ٸ� ��ü�� ������.
		
		
		
		//============================================================================
		//�⺻���� �ƴ� ������ �ڷ����� �迭
		
		
		String s1=null, s2=null, s3=null; // �ּҰ��� �ƹ��͵� ����. �ƹ��͵� ����Ű�� ����
		
		System.out.println( s1 );
		
		String[] arr14= new String[3];
		
		arr14[0] = new String("Hello");
		arr14[1] = new String("Nice");
		arr14[2] = "aaa"; //�ڵ� new String
		
		System.out.println(arr14);
		System.out.println(arr14[0]);
		System.out.println(arr14[1]);
		
		
		System.out.println(arr14.length); //�������
		System.out.println(arr14[0].length()); //�Լ� (method) ���������� ����Ű�� String�� �Լ�
		
		
		
		
		//������ �迭�� �ʱ�ȭ
		int[] arr1=new int[] {10, 20, 30};
		String[] arr16=new String[] {new String("Hello"), new String("Good moring"), new String("android")};
		String[] arr17=new String[] {"a", "b", "c"};
		String[] arr18= {"my", "behind", "so"};
		
		
		
		
		//�ٸ� ������ �迭
		
		Random[] arr19=new Random[3]; //�����̶�� �迭�� ������� ��, ���� �Է����� ����
		arr19[0]=new Random(); //�ε��� 0�� ������ ����!!! �� �־����~!!!!
		
		int m=arr19[0].nextInt(100);
		System.out.println(m);
		
		
		Scanner[] arr20=new Scanner[3];
		
		arr20[0]=new Scanner(System.in);
		
		int h=arr20[0].nextInt();
		System.out.println(h);
		
		
		
		//���α׷��� ���� �ڷ��� class-������!!
		
		Student[] stus= new Student[3]; //�迭�� �����ϴ� ��������
		stus[0]= new Student();
		
		stus[0].name="sam";
		
		//������ �迭 ��ü�� ���������� �����ִ� ��ü�Դϴ�.
		
		
		System.out.println("\n-------------------\n");
		
		
		//JAVA ���ο� for���� : Ȯ��� for�� / for each��
		int[] nums= new int[3];
		nums[0]= 10;
		nums[1]= 20;
		nums[2]= 30;
		
//		for(int i=0; i<nums.length; i++) {
//			int t=nums[i]
//			System.out.println(t);
//		}
		
		//Ȯ��� for��
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


//���α׷��Ӱ� �����ϴ� �ڷ����� ������ �� ����

class Student{
	String name;
	int kor;
	int eng;
	double aver;
}










