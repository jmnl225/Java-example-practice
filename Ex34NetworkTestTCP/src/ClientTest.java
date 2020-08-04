import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Ŭ���̾�Ʈ�� ������ IP�ּ�, port ��ȣ�� �˾ƾ� ������ �� ����
		
		String serverIP="192.168.0.89";
		
		// serverIP="127.0.0.1"; //���� PC�� ��Ī�ϴ� Ư���� IP�ּ�
		// serverIP="localhost";
		
		
		//Ŭ���̾�Ʈ �۾�
		//1. ������ �����ϴ� Socket����(ip�ּ�, port��ȣ)
		try {
			Socket socket= new Socket(serverIP, 10001);
			
			System.out.println("\n====================");
			System.out.println("������ ���ῡ �����߽��ϴ�.");
			System.out.println("====================");
			
			//2. ������ �����͸� ������ ���� Stream�����!
			//�����͸� �������� ��Ʈ�� : ���Ӵ�(Socket)��ü���� �������ε�(OutputStream)�� ����޶�!
			
			OutputStream os= socket.getOutputStream();
			
			//OutputStream�� �����͸� byte������ �����⿡ ���ڿ��� ������� ������.
			//�׷��� ������Ʈ���� �̿��ϸ� write�۾��� ���� �����ϰ� �ۼ��� �� ����
			
			PrintWriter writer= new PrintWriter(os);
			System.out.println("��Ʈ�� ���� ����! .. ������ ���� ���� ����");
			
			//���� �����͸� Ű����� �Է¹ޱ�
			Scanner scan= new Scanner(System.in);
			
			System.out.print("���� ������: ");
			String msg= scan.nextLine();
			
			//3. Stream�� ���� ���������۸� �ϸ� ��!
			writer.println(msg); // ��ġ System.out.println()ó��!
			writer.flush();
			
			while(true) {
				System.out.print("���� ������: ");
				msg= scan.nextLine();
				
				if(msg.equalsIgnoreCase("bye")) {
					break;
				}
				
				writer.println(msg);
				writer.flush();
			}
			
			
			//4. ������ ������ �������� Stream �ݱ�!
			writer.close();
			
			System.out.println("\n====================");
			System.out.println("�޼��� ������ �Ϸ�Ǿ����ϴ�.");
			System.out.println("====================");
			
		} catch (UnknownHostException e) {
			System.out.println("������ ��ġ�� ã�� �� �����ϴ�.");
		} catch (IOException e) {
			System.out.println("������ ����� �Ұ����մϴ�.");
		}
		
		
		
	}

}
