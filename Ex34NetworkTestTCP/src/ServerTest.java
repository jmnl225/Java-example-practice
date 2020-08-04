import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//TCP[Transmission Control Protocol]통신
		// IP주소부터 알아야 통신 가능 
		
		//JAVA에서 본인 PC의 IP주소 관련 정보를 관리하는 클래스 존재: InetAddress
		//본인의 IP주소를 코드로 확인할 수 있는 방법
		
		try {
			System.out.println( InetAddress.getLocalHost().getHostAddress() );
			System.out.println(InetAddress.getLocalHost().getHostName());
			System.out.println(InetAddress.getLocalHost().toString());
		} catch (UnknownHostException e) {}
		
		System.out.println();
		System.out.println();
		//통신을 구현하려면 1가지 용어를 알아야 합니다.
		//1. IP 주소 - 그 컴퓨터의 고유한 주소(숫자) : 42억개  - 4byte
		//2. port번호 - 그 컴퓨터 안에서의 프로그램 분류번호(65천개) : 0~1024번 사용 X 
		//ex) 부산항(IP번호), 3번 항구(port번호)
		
		
		//서버 프로그램 구현
		//1. 서버 소켓을 만들어 내는 작업
		
		try {
			ServerSocket serverSocket= new ServerSocket(10001); //port number 지정
			
			System.out.println("서버 소켓이 생성되었습니다.");
			
			//2. 클라이언트의 접속을 기다리기..
			System.out.println("클라이언트의 접속을 기다립니다..");
			Socket socket= serverSocket.accept(); //여기서 커서가 대기함. -클라이언트가 접속할때까지 대기. 
			//만약 대기하다가 클라이언트가 접속하면, 접속관리객체(Socket)을 리턴
			System.out.println("\n====================");
			System.out.println("클라이언트가 접속하셨습니다.");
			System.out.println("====================");
			
			
			//3. 데이터를 받기위한 무지개로드(InputStream) 열기
			InputStream is= socket.getInputStream(); //바이트스트림
			InputStreamReader isr= new InputStreamReader(is); //바이트 스트림을 문자 스트림으로 변환 - 한글자씩 뱉음
			BufferedReader reader= new BufferedReader(isr); // 보조문자스트림: 한 글자씩 받아서 String으로 저장.
			
			
			//4. 스트림을 이용하여 데이터 읽기
			String msg= reader.readLine();
			System.out.println("받은 데이터: "+ msg);
			
			while(true) {
				msg= reader.readLine(); //상대방이 보낼때까지 커서가 여기서 대기.
				if(msg==null) break; //입력을 보내지 않고 연결이 끊겼을 경우.
				System.out.println("받은 데이터: "+ msg);
			}
			
			
			//5. 데이터 받기가 끝났으니 Stream 닫기
			reader.close();
			
			System.out.println("\n====================");
			System.out.println("접속이 끝났습니다.");
			System.out.println("====================");
			
			
		} catch (IOException e) {
			System.out.println("통신이 끊어졌습니다.");
		} 
		
		
	}

}
