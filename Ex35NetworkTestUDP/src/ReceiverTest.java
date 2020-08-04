import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. 우편(Datagram)을 받을 우체통(DatagramSocket) 준비하기
		try {
			DatagramSocket socket= new DatagramSocket(10003); //10003: port number
			
			//2. 받은 우편물의 내용(데이터)를 담을 수 있는 박스(DatagramPacket) 준비
			// 빈 byte 배열 생성 (바이트를 전달 받을 수 있는 박스)
			byte[] buf= new byte[1024]; //여유로운 사이즈로 빈 배열
			DatagramPacket packet= new DatagramPacket(buf, buf.length);
			
			System.out.println("메세지를 기다립니다.");
			
			socket.receive(packet); //socket아 receive 해줘 packet에
			//메세지를 받아서 packet안의 buf 배열에 입력(저장). 메세지를 받을 때 까지 대기
			 
			//byte[] (buf)를 String으로 변환
			String s= new String(buf);
			System.out.println("받은 메세지: "+s);
			
			
			
		} catch (SocketException e) {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
