
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//thread(������) = ���ÿ� �����۾��� ó���ϴ� ��ä�
		//1. Process: �������� �ϳ��� �ڹ� ���α׷�
		//2. thread: �ϳ��� ���μ��� �ȿ��� �����ϴ� �ϲ�
			
		// ��, thread�� �ۼ��Ǿ� �ִ� �ڵ带 �о �����ϴ� �༮		
		
		
		//���ÿ� �������ϴ� �۾��� �ִٸ� ex) ���� �ٿ�ε� �ϸ� �������, or ü���ϱ�...
		
		
		//���� �ٿ�ε� ��
		
		//1) 20�� ���� �ٿ�ε�
//		for (int i=0; i<20; i++) {
//			System.out.println(i+"��° ���� �ٿ�ε� ��");
//			
//			//������ ���� ������
//			(int k=2000000000; k<100000000; k++);
//		}
		
		// 2) �������
	
//	for(int i=0; i<20; i++) {
//		System.out.println(i+"��° ���� ���");
//		for(int k=0; k<2000000L; k++) {
//		}
//	}
		
			
			//�� �ΰ��� �۾��� ���ÿ� �����Ű�� �� ������ �Ϸ�.
			
			//�⺻���� ����������ִ� Main thread(����)�ܿ�
			//Ư�� �۾��� �ƴ��������� ��ü�� �ִٸ�
			//���ÿ� �����۾��� ����
			//-> �� �� ����ϴ� ����� �ٷ� thread
		
		
		
		
		// ��, �Ϲݰ�ü�� thread��ü�� �ٸ���!
			//��ü�� ���� ������ٰ� �ؼ� ���� thread�� ������� ���� �ƴϴ�.
			//���δٸ� ��ü ����
		
//		WorkerA a= new WorkerA();
//		a.work();
//		//���� �ٿ�ε�
//		
//		WorkerB b= new WorkerB();
//		b.work();
//		//���� ���
		
		
		//�ᱹ �Ϲ� ��ü�� ����, �޼ҵ带 �����Ű�� MAin thread�� ȥ�� ����
		//-> ���ÿ� �ϴ� �� �ƴϴ�
		
		
		//��¥ main thread ���� �����Ǥ� thread��ü�Ѹ� �����غ���
		//Thread�� ��ü�� ������� Thread��� Ŭ������ ����ϴ� Ŭ������ ���� ����
		//�����Ͽ� ����ü�� ����
		
		AThread a= new AThread();
		//�������� �۾��� �����ϵ��� ���- ��������!
		//����Thread���� ������ �������� �ؾ���
		
		a.start();
		
		BThread b= new BThread();
		b.start();
		
		//���� Thread�� ���� �켱������ �ְ�ʹٸ�
		a.setPriority(0); //�켱����[0~10] 0= ���� 10= ����
		
		
		//�� ������ Ȯ���� ���� �ƴϰ�, ����.
		
		//Main Thread�� thread�̹Ƿ�
		//A,B�� Ư�� �۾��� �ϴ� ���� MAin�� �ٸ� ���� ���� ����

		for(int i=100; i<120; i++) {
			System.out.println("�ŷ����̾�");
		}
		
		
		
		

	}

}// main end.


//Thread�� �ɷ��� ���� Ŭ������ ����

class AThread extends Thread {
	//��� ThreadŬ������ �۾��� �ݵ�� �� �޼ҵ� �ȿ��� �ؾ���
	//Thread Ŭ������ �ִ� run()�̶�� �޼ҵ带 �������̵��ؼ� �����
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//�� �ȿ� �� Thread�� ������ �ϴ� �۾� �ڵ�. 
		//ex) ���ϴٿ�ε� �۾�
		
		for(int i=0; i<20; i++) {
			 System.out.println(i+"�� ���� ���");
			 
			//1�� ���.. (Thread�� 1�ʰ� ������)
			 try {Thread.sleep(1000);
			 }catch(Exception e) {
			 for(int k=0; k<2000000000L; k++) {
				 
			 }
		 }
		
	}
	
}
}

//��������� �����ϴ� Ŭ����

class BThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		 for(int i=0; i<20; i++) {
			 System.out.println(i+"�� ���� ���");
			 
			 //1�� ���
			 try {
			 Thread.sleep(1000);
			 }catch(Exception e) {}
			 for(int k=0; k<200000000L; k++) {
				 
			 }
		 }
	}
	
}












//�Ϲ� Ŭ����

class WorkerA{
	void work() {
		//���� �ٿ�ε� �۾�
		 for(int i=0; i<20; i++) {
			 System.out.println(i+"�� ���� �ٿ�ε� ��...");
			 
			 for(int k=0; k<200000000L; k++) {
				 
			 }
		 }
		
	}
}

class WorkerB{
	void work() {
		//���� ��� �۾�
		 for(int i=0; i<20; i++) {
			 System.out.println(i+"�� ���� ���");
			 
			 for(int k=0; k<200000000L; k++) {
				 
			 }
		 }
		
	}
} 






