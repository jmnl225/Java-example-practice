
public class SleepTest {
	public static void main(String[] args) {
		
		SThread t = new SThread();
		t.start(); // run�޼ҵ� �ڵ����� - 10�� �� "Hello" ���
		
		//�ڴ� Thread �����
		t.interrupt();
		
	}
	
}


class SThread extends Thread{
	
	@Override
	public void run() {
		//10�� �Ŀ� "Hello" ���
		
		//10�� ���
		try {
			Thread.sleep(10000);
			// sleep�߿� interrupt()�� �ɸ��� ����
		}catch (InterruptedException e) {
			System.out.println("�ڴµ� �� ����!");
		}
		
		System.out.println("Hello");
	}
	
}
