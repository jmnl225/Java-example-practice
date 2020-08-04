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
		
		
		//UDP: User Datagram Protocol - ��ġ ���������� ��İ� ���
		
		//1. ������ ���� ��ü�� �����
		try {
			DatagramSocket socket=new DatagramSocket();
			
			//���� ������ Ű����� �Է¹ޱ�
			Scanner scan= new Scanner(System.in);
			System.out.print("���� ������: ");
			String msg= scan.nextLine();
			
			//2. ������(msg)�� �������� ������ ���� �������(DatagramPacket)�� ����
			//DatagramPacket: �޴� ��� �ּ�(IP�ּ�, port��ȣ) �ʿ�
			
			InetAddress addr= InetAddress.getByName("192.168.0.89"); //�޴� ��� �ּҷ� InetAddress ��ü ����
			
			DatagramPacket packet= new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, 10003);
			//1) �Է¹��� ������ msg�� ����Ʈ�� �������ϹǷ� .getByte / 
			//2) msg�� bytes�� �迭 ���̸� �������� .length / 
			//3) InetAddress addr= InetAddress.getByName("192.168.0.89"); �޴� ��� �ּҷ� InetAddress ��ü ����
			//4) port��ȣ ����
			
			
			//3. ��ü���� ����ڽ� ������
			socket.send(packet);
			
			System.out.println("���� �Ϸ�!");
			
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
