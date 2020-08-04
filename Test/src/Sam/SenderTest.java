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
		
		//UDP : User Datagram Protocol - ��ġ ���������� ��İ� ���
		
		
		try {
			//1. ������ ���� ��ü�븸���
			DatagramSocket socket= new DatagramSocket();
			
			// ���� ������ Ű����� �Է¹ޱ�
			Scanner scan= new Scanner(System.in);
			System.out.print("���� ������ : ");
			String msg= scan.nextLine();
			
			//2. ������(msg)�� �������� ������ ���� �������(DatagramPacket)�� ����, �� ���ڿ� �޴»�� �ּ�(ip�ּ�, port��ȣ)�� �ۼ�
			InetAddress addr= InetAddress.getByName("192.168.0.87"); //�޴»�� �ּҷ� InetAddress��ü ����
			DatagramPacket packet= new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, 10003);
			
			//3. ��ü�뿡 ����ڽ� ������
			socket.send(packet);
			
			System.out.println("���ۿϷ�!!");						
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
