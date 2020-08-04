import java.util.Scanner;

public class Assignment0416 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int howmany, sum, num;
		
		System.out.println("몇 개의 정수를 입력할 것인가요? : ");
		howmany=scan.nextInt();
		
		sum=0;
		for(int i=0; i<howmany; i++)
		{
			System.out.println("정수를 입력하세요: ");
			num=scan.nextInt();
			sum=num+sum;
		}
		
		System.out.println("\n 평균값을 도출한 결과 입니다. :");
		double total;
		total=sum/howmany;
		System.out.printf("%.2f",total);
		
		scan.close();
	}

}
