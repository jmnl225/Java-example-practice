
public class ThreadControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ÿ�̾� �����ϴ� ���� ��ü ����
		
		CThread t= new CThread();
		t.start();
		
		
		//3�� �� �޽� (Thread�� �Ͻ�����)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		
//		t.wait(); //�̷��� �ϴ°͵� stopó�� �����
		//�Ͻ��������θ� ���� ���� isWait�� true�� ����
		t.isWait= true;
		
		
		//3�� �Ŀ� �̾��ϱ� (Resume)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		t.resumeThread();
		
//		t.notify();
		
		
		//3�� �� ���. (Thread ���� = run �޼ҵ� ����)
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		//Thread, Ÿ�̾� ���� �������� �۾� ���߱� ���!
		
//		t.stop();//deprecated�� �޼ҵ�, ����� �������� ����
		//�������� �ݺ��۾��� ������ ���缭 �ڿ������� �� ��. �߰��� ����.
		
		//Thread�� run()�޼ҵ尡 ����Ǹ� ���
		//�ٽ� start�� �ص� ������ ����! -> Thread�� ��ȸ��.
		//��, Thread�� �۾������� 1ȸ��
		
		//while���� ���߸� run()�޼ҵ��� �۾��� ����
		//while���� ���ߴ� ���
		//while���� �ݺ� ���ǿ� boolean ������ ����Ͽ� �������� ����
		
		t.isRun= false;
		
	}

}

//Ÿ�̾ ���� �۾� �����ϴ� ������Ŭ���� ����
class CThread extends Thread{
	
	boolean isRun= true;
	boolean isWait= false;
	
	@Override
	public void run() {
		//Ÿ�̾� 4���� �����ϴ� �۾� - �ݺ�����
		while(isRun) {
			System.out.println("1�� Ÿ�̾� ����");
			System.out.println("2�� Ÿ�̾� ����");
			System.out.println("3�� Ÿ�̾� ����");
			System.out.println("4�� Ÿ�̾� ����");
			System.out.println();
			
			//�޽��ΰ�? - �Ͻ������ΰ�?
			
			if(isWait) {
				try {
					synchronized (this) {
						wait();
					}
				} catch (InterruptedException e) {} //�� �����带 �Ͻ�����
			}
			
			
			
			//1�� ���
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
		}// while end.
		
		System.out.println("CThread ���");
		
	}// run method end.
	
	
	//�̾��ϴ� ��� �޼ҵ�
	
	void resumeThread() {
		
		isWait= false; //�޽ı�� ����
		
		synchronized (this) {
			this.notify();
		}
		
	}
	
	
}// CThread class end.