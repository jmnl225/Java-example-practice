import java.util.Scanner;

public class Assignment0416 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int howmany, sum, num;
		
		System.out.println("�� ���� ������ �Է��� ���ΰ���? : ");
		howmany=scan.nextInt();
		
		sum=0;
		for(int i=0; i<howmany; i++)
		{
			System.out.println("������ �Է��ϼ���: ");
			num=scan.nextInt();
			sum=num+sum;
		}
		
		System.out.println("\n ��հ��� ������ ��� �Դϴ�. :");
		double total;
		total=sum/howmany;
		System.out.printf("%.2f",total);
		
		scan.close();
	}

}
