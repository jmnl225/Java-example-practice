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
		
		
		//TCP[Transmission Control Protocol]���
		// IP�ּҺ��� �˾ƾ� ��� ���� 
		
		//JAVA���� ���� PC�� IP�ּ� ���� ������ �����ϴ� Ŭ���� ����: InetAddress
		//������ IP�ּҸ� �ڵ�� Ȯ���� �� �ִ� ���
		
		try {
			System.out.println( InetAddress.getLocalHost().getHostAddress() );
			System.out.println(InetAddress.getLocalHost().getHostName());
			System.out.println(InetAddress.getLocalHost().toString());
		} catch (UnknownHostException e) {}
		
		System.out.println();
		System.out.println();
		//����� �����Ϸ��� 1���� �� �˾ƾ� �մϴ�.
		//1. IP �ּ� - �� ��ǻ���� ������ �ּ�(����) : 42�ﰳ  - 4byte
		//2. port��ȣ - �� ��ǻ�� �ȿ����� ���α׷� �з���ȣ(65õ��) : 0~1024�� ��� X 
		//ex) �λ���(IP��ȣ), 3�� �ױ�(port��ȣ)
		
		
		//���� ���α׷� ����
		//1. ���� ������ ����� ���� �۾�
		
		try {
			ServerSocket serverSocket= new ServerSocket(10001); //port number ����
			
			System.out.println("���� ������ �����Ǿ����ϴ�.");
			
			//2. Ŭ���̾�Ʈ�� ������ ��ٸ���..
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�..");
			Socket socket= serverSocket.accept(); //���⼭ Ŀ���� �����. -Ŭ���̾�Ʈ�� �����Ҷ����� ���. 
			//���� ����ϴٰ� Ŭ���̾�Ʈ�� �����ϸ�, ���Ӱ�����ü(Socket)�� ����
			System.out.println("\n====================");
			System.out.println("Ŭ���̾�Ʈ�� �����ϼ̽��ϴ�.");
			System.out.println("====================");
			
			
			//3. �����͸� �ޱ����� �������ε�(InputStream) ����
			InputStream is= socket.getInputStream(); //����Ʈ��Ʈ��
			InputStreamReader isr= new InputStreamReader(is); //����Ʈ ��Ʈ���� ���� ��Ʈ������ ��ȯ - �ѱ��ھ� ����
			BufferedReader reader= new BufferedReader(isr); // �������ڽ�Ʈ��: �� ���ھ� �޾Ƽ� String���� ����.
			
			
			//4. ��Ʈ���� �̿��Ͽ� ������ �б�
			String msg= reader.readLine();
			System.out.println("���� ������: "+ msg);
			
			while(true) {
				msg= reader.readLine(); //������ ���������� Ŀ���� ���⼭ ���.
				if(msg==null) break; //�Է��� ������ �ʰ� ������ ������ ���.
				System.out.println("���� ������: "+ msg);
			}
			
			
			//5. ������ �ޱⰡ �������� Stream �ݱ�
			reader.close();
			
			System.out.println("\n====================");
			System.out.println("������ �������ϴ�.");
			System.out.println("====================");
			
			
		} catch (IOException e) {
			System.out.println("����� ���������ϴ�.");
		} 
		
		
	}

}
