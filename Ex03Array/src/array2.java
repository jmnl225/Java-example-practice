import java.util.Scanner;

public class array2 {
	
	public static void main(String[] args) {
		
		//다차원 배열
		//2차원 배열
		
		int[] arr=new int[3]; //1차원 배열
		
		
		int[][] aaa=new int[2][3]; //2개층의 3호실
		
		aaa[0][0]=10;
		aaa[0][1]=20;
		aaa[0][2]=30;
		
		aaa[1][0]=100;
		aaa[1][1]=200;
		aaa[1][2]=300;
		
		System.out.println(aaa);
		System.out.println(aaa[0]); //정보
		
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
		
		
		//각 층마다 다른 호실수의 배열 생성이 가능!!
		
		int[][] bbb=new int[3][]; //3개층만 작성
		System.out.println(bbb);
		
		
		System.out.println("\n---------------------\n");
		
		//각 층마다 다른 길이의 배열객체 생성

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
		
		
		//2차원 배열 초기화
		int[][] ccc=new int[][] {
			        new int[] {10,20}, 
			        new int[] {100, 200, 300} };
		
		// == int[][] ccc={{20,20},{100,200,300}}; 약식표현

			        
			        
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
		
		
		
		
		//2차원 배열의 층, 호실 개수도 키보드 입력으로 가능!!
		
		Scanner scan=new Scanner(System.in);
		System.out.println("층 수 입력");
		int n= scan.nextInt();
		
		int[][] ddd=new int[n][]; //n층짜리 배열
		
		for(int i=0; i<ddd.length; i++)
		{
			System.out.print("호실 수 입력: ");
			int m=scan.nextInt();
			ddd[i]=new int[m]; //m개짜리 1차원 배열
		}
		
		
		for(int[] t: ddd) {
			for(int e: t) {
				System.out.println(e+",  ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
