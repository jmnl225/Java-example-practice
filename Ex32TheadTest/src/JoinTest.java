

public class JoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JThread t= new JThread();
		t.start();
		
		//Thread�� ���ÿ� �ϴ� ������,
		//�� JThread�� �۾�(run �޼ҵ�)�� ����� �� ����
		//�ٸ� �������� �۾��� ��ٸ��� ��� -> block
		try {
		t.join();
		}catch (InterruptedException e1) {}
		
		//��, join�� thread�� ���ÿ� �۾��ϴ� ����� ����
		
		
		//���� Thread���� �ٸ� �۾��� ����
		for(int i=0; i<10; i++) {
			System.out.println("Main");
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
			
			
			
		}
		
		
		
	}

}

class JThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("aaa");
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		
		
	}
}