import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//UDP: User Datagram Protocol - 마치 소포보내는 방식과 흡사
		
		//1. 우편을 보낼 우체통 만들기
		try {
			DatagramSocket socket=new DatagramSocket();
			
			//보낼 데이터 키보드로 입력받기
			Scanner scan= new Scanner(System.in);
			System.out.print("보낼 데이터: ");
			String msg= scan.nextLine();
			
			//2. 데이터(msg)를 우편으로 보내기 위해 우편상자(DatagramPacket)에 동봉
			//DatagramPacket: 받는 사람 주소(IP주소, port번호) 필요
			
			InetAddress addr= InetAddress.getByName("192.168.0.89"); //받는 사람 주소로 InetAddress 객체 생성
			
			DatagramPacket packet= new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, 10003);
			//1) 입력받은 데이터 msg의 바이트를 보내야하므로 .getByte / 
			//2) msg의 bytes의 배열 길이를 보내야함 .length / 
			//3) InetAddress addr= InetAddress.getByName("192.168.0.89"); 받는 사람 주소로 InetAddress 객체 생성
			//4) port번호 쓰기
			
			
			//3. 우체동에 우편박스 보내기
			socket.send(packet);
			
			System.out.println("전송 완료!");
			
		} catch (SocketException e) {
			System.out.println("Socket Exception");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
