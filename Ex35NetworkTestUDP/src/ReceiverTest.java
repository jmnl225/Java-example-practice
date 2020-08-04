import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. ����(Datagram)�� ���� ��ü��(DatagramSocket) �غ��ϱ�
		try {
			DatagramSocket socket= new DatagramSocket(10003); //10003: port number
			
			//2. ���� ������ ����(������)�� ���� �� �ִ� �ڽ�(DatagramPacket) �غ�
			// �� byte �迭 ���� (����Ʈ�� ���� ���� �� �ִ� �ڽ�)
			byte[] buf= new byte[1024]; //�����ο� ������� �� �迭
			DatagramPacket packet= new DatagramPacket(buf, buf.length);
			
			System.out.println("�޼����� ��ٸ��ϴ�.");
			
			socket.receive(packet); //socket�� receive ���� packet��
			//�޼����� �޾Ƽ� packet���� buf �迭�� �Է�(����). �޼����� ���� �� ���� ���
			 
			//byte[] (buf)�� String���� ��ȯ
			String s= new String(buf);
			System.out.println("���� �޼���: "+s);
			
			
			
		} catch (SocketException e) {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
