
public class SynchronizedTest {
	public static void main(String[] args) {
		//�񵿱� == ���ÿ�
		
		//���� ��ü ����
		Account acc= new Account();
		
		//acc���¿� 100�� �Ա�
//		acc.add(100);
		
		
		//acc���¿� �Ա��ϰ���� ��1
		TestThread t1= new TestThread(acc);
		
		
		//acc���¿� �Ա��ϰ���� ��2
		TestThread t2= new TestThread(acc);
		
		
		//����� ������ �� �� 100���� �Ա� ����
		t1.start();
		t2.start();
		
	}
	
	

}


//������� Ŭ����

class Account{
	
	int money= 0;
	
	//�Աݱ��
	//����ȭ ó���� ���� ������ ���� �����尡 �� �޼ҵ带 ���ÿ� �������
	//�߸��� ����� ���� �� ����.
	
	//����ȭ ó�� ���
	//��� 1) �޼ҵ忡 ����ȭ ó�� [ synchronized ]
	//�ϳ��� �����尡 �� �޼ҵ带 �������̸� �ٸ� ������� ��� �����
	
//	synchronized void add(int n) {
//		String name= Thread.currentThread().getName(); //���� �� �ڵ带 �����ϴ� Threa�� �̸��� ����
//		
//		
//		System.out.println(name+ ": �Ա��۾��� �����մϴ�.");
//		System.out.println(name+ ": ���� �ܾ�: "+ money);
//		
//		money+=n;
//		
//		//ó���ð��� �ɸ�����
//		
//		for(int i=0; i<200000000L; i++) {
//			String s= "."; //�ƹ��۾��̳� �õ�
//		}
//		
//		System.out.println(name+ ": �Ա� �� �ܾ�: "+money);
//		System.out.println();
//	}
//	
//}
	
	//���2) ����ȭ �� ���
	
	void add(int n) {
		String name= Thread.currentThread().getName(); //���� �� �ڵ带 �����ϴ� Threa�� �̸��� ����
		
		
		System.out.println(name+ ": �Ա��۾��� �����մϴ�.");
		
		//���ĺ��͸� ����ȭ ó��: �Ķ���ͷ� ����ȭ �� ��ü ����
		synchronized (this) {
			System.out.println(name+ ": ���� �ܾ�: "+ money);
			
			money+=n;
			
			//ó���ð��� �ɸ�����
			
			for(int i=0; i<200000000L; i++) {
				String s= "."; //�ƹ��۾��̳� �õ�
			}
			
			System.out.println(name+ ": �Ա� �� �ܾ�: "+money);
			System.out.println();
		}
		
	}
	
}


//�Ա��ϰ���� Thread Ŭ����

class TestThread extends Thread{
	
	Account acc; //������ ���� ���°�ü ����
	
	String name; //�� �̸�
	
	public TestThread(Account acc) {
		this.acc= acc;
//		this.name= name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//100���� �Ա��ϴ� �۾�
		acc.add(100);
	}
	
}










