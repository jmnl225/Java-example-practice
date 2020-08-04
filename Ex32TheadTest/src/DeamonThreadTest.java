

public class DeamonThreadTest {
	public static void main(String[] args) {
		
		
		DThread t= new DThread();
		t.setDaemon(true); //���󽺷���� ���� = Main Thread�� ����Ǹ� ���� �ڵ� ���� ��!
		t.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		
		System.out.println("�������� = ���� ���");
		
	}

}


class DThread extends Thread{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("Hello");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
		}
	}
	
}



