import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//클라이언트는 서버의 IP주소, port 번호를 알아야 접속할 수 있음
		
		String serverIP="192.168.0.89";
		
		// serverIP="127.0.0.1"; //본인 PC를 지칭하는 특별한 IP주소
		// serverIP="localhost";
		
		
		//클라이언트 작업
		//1. 서버와 연결하는 Socket생성(ip주소, port번호)
		try {
			Socket socket= new Socket(serverIP, 10001);
			
			System.out.println("\n====================");
			System.out.println("서버와 연결에 성공했습니다.");
			System.out.println("====================");
			
			//2. 서버에 데이터를 보내기 위한 Stream만들기!
			//데이터를 내보내는 스트림 : 해임달(Socket)객체에게 무지개로드(OutputStream)를 열어달라!
			
			OutputStream os= socket.getOutputStream();
			
			//OutputStream은 데이터를 byte단위로 보내기에 문자열을 보내기는 불편함.
			//그래서 보조스트림을 이용하면 write작업을 보다 수월하게 작성할 수 있음
			
			PrintWriter writer= new PrintWriter(os);
			System.out.println("스트림 연결 성공! .. 데이터 전송 가능 상태");
			
			//보낼 데이터를 키보드로 입력받기
			Scanner scan= new Scanner(System.in);
			
			System.out.print("보낼 데이터: ");
			String msg= scan.nextLine();
			
			//3. Stream을 통해 데이터전송만 하면 끝!
			writer.println(msg); // 마치 System.out.println()처럼!
			writer.flush();
			
			while(true) {
				System.out.print("보낼 데이터: ");
				msg= scan.nextLine();
				
				if(msg.equalsIgnoreCase("bye")) {
					break;
				}
				
				writer.println(msg);
				writer.flush();
			}
			
			
			//4. 데이터 전송이 끝났으면 Stream 닫기!
			writer.close();
			
			System.out.println("\n====================");
			System.out.println("메세지 전송이 완료되었습니다.");
			System.out.println("====================");
			
		} catch (UnknownHostException e) {
			System.out.println("서버의 위치를 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("서버와 통신이 불가능합니다.");
		}
		
		
		
	}

}
