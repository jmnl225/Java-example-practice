import java.util.Scanner;
import java.util.Random;

public class numberBB {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Random com=new Random();
		int a, b, c;
		int user;
		
		while(true)
		{
			a=com.nextInt(9)+1;
			b=com.nextInt(9)+1;
			c=com.nextInt(9)+1;
			
			if(a!=b&&b!=c&&c!=a)
			{
				break;
			}
		}
//		a=a*100;
//		b=b*10;
		
		System.out.println("숫자 야구 게임!!");
		
		int s, ball;
		int fir, sec, thi;
		while(true)
		{
			s=0;
			ball=0;
				
			user=scan.nextInt();
			fir=user/100;
			thi=user%100;
			
			sec=thi/10;
			thi=thi%10;
			
			System.out.println(fir+""+sec+""+thi);
			
			if (fir==a) s++;
			else if(fir==b||fir==c) ball++;
			if (sec==b) s++;
			else if(sec==a||sec==c) ball++;
			if (thi==c) s++;
			else if(thi==a||thi==b) ball++;
			
			if(s==3)
			{
				System.out.println("정답!!!! 축하합니다!!!!");
				break;
			}
			
			System.out.println("스트라이트:"+s+" /  볼:"+ball);
			scan.close();
		}
	}
}
