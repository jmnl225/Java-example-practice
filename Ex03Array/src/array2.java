import java.util.Scanner;

public class array2 {
	
	public static void main(String[] args) {
		
		//������ �迭
		//2���� �迭
		
		int[] arr=new int[3]; //1���� �迭
		
		
		int[][] aaa=new int[2][3]; //2������ 3ȣ��
		
		aaa[0][0]=10;
		aaa[0][1]=20;
		aaa[0][2]=30;
		
		aaa[1][0]=100;
		aaa[1][1]=200;
		aaa[1][2]=300;
		
		System.out.println(aaa);
		System.out.println(aaa[0]); //����
		
		System.out.println(aaa[0][0]);
		System.out.println(aaa[0][1]);
		System.out.println(aaa[0][2]);
		
		System.out.println(aaa[1][0]);
		System.out.println(aaa[1][1]);
		System.out.println(aaa[1][2]);
		
		for(int i=0; i<aaa.length; i++)
		{
			for(int k=0; k<aaa[i].length; k++)
			{
				System.out.println(aaa[i][k]);
			}
		}
		
		
		//�� ������ �ٸ� ȣ�Ǽ��� �迭 ������ ����!!
		
		int[][] bbb=new int[3][]; //3������ �ۼ�
		System.out.println(bbb);
		
		
		System.out.println("\n---------------------\n");
		
		//�� ������ �ٸ� ������ �迭��ü ����

		bbb[0]=new int[2];
		bbb[1]=new int[5];
		bbb[2]=new int[4];
		
		bbb[1][2]=40;
		bbb[2][0]=30;
		
		for(int i=0; i<bbb.length; i++)
		{
			for(int k=0; k<bbb[i].length; k++)
			{
				System.out.print(bbb[i][k]+",  ");
			}
			System.out.println();
		}
		
		
		//2���� �迭 �ʱ�ȭ
		int[][] ccc=new int[][] {
			        new int[] {10,20}, 
			        new int[] {100, 200, 300} };
		
		// == int[][] ccc={{20,20},{100,200,300}}; ���ǥ��

			        
			        
		for(int i=0; i<ccc.length; i++)
		{
			for(int k=0; k<ccc[i].length; k++)
			{
				System.out.print(ccc[i][k]+", ");
			}
			System.out.println();
		}
		
		
		for (int[] t: ccc) {
			for(int e : t) {
				System.out.print(e+",  ");
			}
			System.out.println();
		}
		
		
		
		
		//2���� �迭�� ��, ȣ�� ������ Ű���� �Է����� ����!!
		
		Scanner scan=new Scanner(System.in);
		System.out.println("�� �� �Է�");
		int n= scan.nextInt();
		
		int[][] ddd=new int[n][]; //n��¥�� �迭
		
		for(int i=0; i<ddd.length; i++)
		{
			System.out.print("ȣ�� �� �Է�: ");
			int m=scan.nextInt();
			ddd[i]=new int[m]; //m��¥�� 1���� �迭
		}
		
		
		for(int[] t: ddd) {
			for(int e: t) {
				System.out.println(e+",  ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
