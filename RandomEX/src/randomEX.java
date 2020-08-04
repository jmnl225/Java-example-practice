
	import java.util.Random;
	import java.util.Scanner;

public class randomEX {
	
	public static void main(String[] args) {
			
			//컴퓨터가 랜덤한 숫자를 만들면 사용자가 키보드로 값을 입력하여 정답을 맞추는 게임
			//숫자 스무고개 (0~9)
			
			//int com=7; //원래는 0~9 랜덤값
			
			Scanner scan= new Scanner(System.in);
			
			System.out.print("input : ");
						
			Random rnd= new Random();
			int com=rnd.nextInt(10);
			//정답값 비교
			
			int user;
			
			while(true)
			{
				user=scan.nextInt();
				
				if(user>com) {
					System.out.println(user+"보다 작습니다.");
			
				}else if(user<com) {
					System.out.println(user+"보다 큽니다.");
			
				}else if(user==com) {
					System.out.println("정답입니다!!");
					break;
				}
			}
			
			scan.close();
		
	}
}
