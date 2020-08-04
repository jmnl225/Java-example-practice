import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			//1. Datagram(����)�� ���� ��ü��(DatagramSocket) �غ��ϱ�
			DatagramSocket socket= new DatagramSocket(10003); //10003 : ��Ʈ��ȣ
			
			//2. ���� ������ ����(������)�� ���� �� �ִ� �ڽ�(DatagramPacket) �غ�
			// �� byte�迭 ����
			byte[] buf= new byte[1024];//�����ο� ������� �� �迭����
			DatagramPacket packet= new DatagramPacket(buf, buf.length);
			
			System.out.println("�޼����� ��ٸ��ϴ�.");
			socket.receive(packet);//�޼����� �޾Ƽ� Packet�ȿ� buf�迭�� �־���. �޼����� ���� �� ���� Ŀ���� ���⼭ ����ϰ� ����.
			
			//byte[](buf)�� String��ȯ
			String s= new String(buf);
			System.out.println("���� �޼��� : "+ s);			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
