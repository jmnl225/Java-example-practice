
	import java.util.Random;
	import java.util.Scanner;

public class randomEX {
	
	public static void main(String[] args) {
			
			//��ǻ�Ͱ� ������ ���ڸ� ����� ����ڰ� Ű����� ���� �Է��Ͽ� ������ ���ߴ� ����
			//���� ������ (0~9)
			
			//int com=7; //������ 0~9 ������
			
			Scanner scan= new Scanner(System.in);
			
			System.out.print("input : ");
						
			Random rnd= new Random();
			int com=rnd.nextInt(10);
			//���䰪 ��
			
			int user;
			
			while(true)
			{
				user=scan.nextInt();
				
				if(user>com) {
					System.out.println(user+"���� �۽��ϴ�.");
			
				}else if(user<com) {
					System.out.println(user+"���� Ů�ϴ�.");
			
				}else if(user==com) {
					System.out.println("�����Դϴ�!!");
					break;
				}
			}
			
			scan.close();
		
	}
}
