import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;

public class CollectionsClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Collections Ŭ������ static �޼ҵ� �Ұ�
		// 1) sort()
		// 2) shuffle()
		
		
		
		ArrayList<String> datas= new ArrayList<String>();
		
		datas.add("����!!");
		datas.add("������");
		datas.add("��̳�!");
		datas.add("���ʹ�");
		datas.add("���� ���� �;�!");
		datas.add("��!!");
		System.out.println(datas.toString());
		
		
		//����Ʈ�� ��ҵ� ����
		Collections.sort(datas);
		System.out.println( datas.toString());
		
		
		//��ҵ��� ��ġ�� �����ϰ� ������
		Collections.shuffle(datas);
		System.out.println( datas.toString());
		
		
		
		//�ڷᱸ������ ���� ������ 2���� ���屸��
		//Stack(����)�� Queue(ť)�� ������ ���
		//1. Stack: Push(����߰�) / Pop(��� ������)   FILO(First Input Last Output) ���� ����� ���� ���߿� ����
		//2. Queue: offer(����߰�) / poll(��� ������) FIFO(First Input First Output) ���� ����� ���� ���� ����
		
		
		//���� �� ������ ���� Ŭ������ ����
		Stack<String> stack= new Stack<String>();
		stack.push("��!");
		System.out.println(stack.size()); 
		String s= stack.pop(); // ���� ��Ҥð� �������� = ������ �پ��. Get�� �ٸ�!!
		System.out.println(stack.size()); 
		
		
		System.out.println("=========");
		
		Queue<String> queu= null; //ť�� �׳� ��� ���ϰ� �����ؼ� ���
		queu.offer("�߾�!");
		String s2= queu.poll(); //���� ��Ұ� ��������
		
		
		
		
		
		
		
		
	}

}
