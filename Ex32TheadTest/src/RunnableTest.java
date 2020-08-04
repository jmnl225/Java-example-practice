
public class RunnableTest {
	public static void main(String[] args) {
		
		//Thread�� ����� 2���� ���
		//1. Thread class ��� (extends) �� Ŭ������ �����Ͽ� ���
		//2. Runnable �������̽��� ������(implements) Ŭ������ �����Ͽ� ���
		
		//Person�̸鼭 Thread�� ��ü ����
		PersonThread pt= new PersonThread();
		pt.name= "Sam";
		pt.age= 20;
		
		//������ �̸�, ���̸� 1�ʸ��� ������ִ� ��� ����
		//Thread�� �����Ű�� ���
//		pt.start(); //����: Runnable���� start�޼ҵ尡 ����
		
//		pt.run(); //����ȵ�!!!!!!! �Ǵ� �� ó�� ��������
		//run�� ���� ȣ���ϸ� ������ Thread�� �ϴ� ���� �ƴ϶� Main�� �ϰԵ�
		
		
		//Runnable�� ������ �����ϴ� ��� X
		//�ٸ� Thread Ŭ���� ��ü�� ������ �޾ƾ� ��.
		
		Thread t= new Thread(pt); //�����ڿ� Runnable�� �����ϸ� �� �����尡 ��� Start ����
		t.start(); // �����ڷ� ���� Runnable ��ü�� run()�� ��� ����
		
		System.out.println("aaa"); //Main Thread�� ����
		
		
		//Runnable�� ����ϴ� �� �ٸ� ���
		//Runnable�� ��ӹ޴� Ŭ������ �����ϸ鼭 ��ü ����
		//�͸� Ŭ����
		Runnable r=new PersonThread() {
			@Override
			public void run() {
				for(int i=0; i<100; i++) {
					System.out.println("��������԰�ʹ� ������");
				}
			}
		};
		
		Thread t2= new Thread(r);
		t2.start(); //�� �͸�Ŭ�������� ���� run()����� ����
		
		//�� �͸�Ŭ������ �� �ٿ��� �ۼ�
		
		Thread t3= new Thread(new Runnable() {
			public void run() {
				System.out.println("�͸�Ŭ���� ���");
			}
		});
		t3.start();
		
		//���� �ݺ�
		while(true) {
			System.out.println("kkk");
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println("���ͷ�Ʈ �߻�!");
				break;
			}
		}
		
		//���ѹݺ� ����2��° �溱
		
		while(true) {
			System.out.println("kkk");
			
			//Ȥ�� ���ͷ�Ʈ( .interraupt �޼ҵ尡 ȣ�� �Ǿ��ִ���?
		}
		
		
	}

}

// Person�� ��� �ɷ��� ���� �����鼭 Thread�� �ɷµ� �־����� �ϴ� Ŭ����
class PersonThread extends Person implements Runnable{
	//Runnable �������̽��� �߻�޼ҵ� (abstract)�� run()�� override�� �ؾ߸� ��
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			System.out.println(name+ " ,"+ age);
			
			//1�� ���
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
	}
}



class Person{
	String name;
	int age;
}