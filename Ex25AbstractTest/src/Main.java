
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4.28 �����Ϥ����� ������ ><~!!!!! �ų�����~!~!!!!!!
		
		//Animal <- Dog, Cat, Pig Ŭ���� ����
		Animal[] anis= new Animal[5];
		anis[0]= new Dog();
		anis[1]= new Cat();
		anis[2]= new Dog();
		anis[3]= new Pig();
		anis[4]= new Animal() {
			@Override
			void say() {
				// TODO Auto-generated method stub
				System.out.println("�� �� !");
			}
		}; //���� �����Ҹ��� �� �ѹ��� ���
		
		anis[0].say(); //���� �����ϴ� ��ü Dog�� say()�� �ߵ�
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();
		System.out.println();
		
		//�߻�Ŭ������ ��ü���� �Ұ�: �Ǽ��� ���� �� ����
//		Animal ani= new Animal(); //error
		
		
//		Test t= new test(); //error
		
		//�߻�Ŭ������ ����� ���� new�� �ϴ� ���� �ƴ϶�, ����� Ŭ������ ����� �̸� ��ü�� �����Ͽ� ���
		
		
		AAA obj= new AAA(); //������ ȣ��
		obj.aaa();
		obj.a= 100;
		Test.ccc(); //static�� �θ����� Ŭ�����̸����� ȣ��
		Test.b= 50;
		System.out.println();
		
		
		//�߻�Ŭ������ ������ ���
		Test t= null; //�θ���������
		t= new AAA(); //��ĳ����: �θ� �ڽ��� ����
		t.aaa();
		
		t= new BBB();
		t.aaa();
		
		//Test��� �߻�Ŭ������ ����ϰ� �ʹٸ�
		//�׻� ���ο� Ŭ������ ����� extends�� �ؼ� ����ؾ��Ѵ�!
		
		//���� �ϴٺ��� Ŭ���� �̸��� ����ϴ� ���� ¥��!!
		//Ŭ������ �̸� ���� ���ο� Ŭ������ �����ϴ� ���
		// => �͸� Ŭ���� : Anonymous class
		
		Test t2= new Test() {
			//�ݵ�� �߻�޼ҵ带 �������̵� �ؾ���
			@Override
			void aaa() {
				// TODO Auto-generated method stub
				System.out.println("�͸�Ŭ������ aaa()");
			}
			@Override
			void bbb() {
				// TODO Auto-generated method stub
				System.out.println("�͸�Ŭ������ bbb()");
			}
			
			
			//������ ���ο� �޼ҵ� ����
			void output() {
				System.out.println("�͸�Ŭ������ �޼ҵ�");
			}
	
			
			
		}; //�͸�Ŭ������ ��ü�� new, �����ϸ鼭 Ŭ������ �����ϴ� ���! ********
		
		
		
		t2.aaa();
//		t2.output(); //�͸�Ŭ�������� �����޼ҵ�� ���������� ����� ���⿡ ���Ұ�
		
		//�̸��� �ִ� Ŭ������ ���� �ڷ���(class)�� ��ü�� ������ ���� ����
		new AAA();
		new AAA();
		
		//�͸� Ŭ������ �̸��� ���⿡ new�Ҷ� 1���� ���� ����!
		
		
	}//Main static class end.

}//Main class end.


//Test�� ����� ���ο� class
class BBB extends Test {

	@Override
	void aaa() {
		// TODO Auto-generated method stub
		System.out.println("BBB Ŭ������ aaa");
	}
	
	
	void bbb() {
		// TODO Auto-generated method stub
		System.out.println("BBB Ŭ������ bbb");
	}
	
	
}





//Test �߻�Ŭ������ ����� ���ο�Ŭ���� ����
class AAA extends Test{
	//�߻� �޼ҵ带 ������ Ŭ������ ��ӹ����� �ݵ�� �߻�޼ҵ带 �������̵� �ؾ���!!!!!
	
	//constructor	
	public AAA() {
		System.out.println("AAA ��ü����");
	}
	
	
	@Override
	void aaa() {
		// TODO Auto-generated method stub
		System.out.println("AAA Ŭ������ aaa �޼ҵ� �������̵�");
	}
	
	
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("");
	}
	
}



abstract class Animal{//����� ���� Ŭ����
	//����� ���� �̸��� �����ϴ� �޼ҵ�: �������̵� ��
	abstract void say(); // �߻�޼ҵ�
	
	//�߻� �޼ҵ带 ������ Ŭ������ �ݵ�� �߻�Ŭ�������߸� ��
	
	
	
}

class Dog extends Animal{
	//�߻�޼ҵ带 ������ Ŭ������ ��ӹ����� �ݵ��!!!
	//�߻�޼ҵ带 �������̵� �ؾ��� �ǹ��� ����!!!
	
	void say() {//override
		System.out.println("�п�!");
	}
	
}

class Cat extends Animal{
	
	void say(){
		System.out.println("�߿�~");
	}
}

class Pig extends Animal{
	@Override
	void say() {
		// TODO Auto-generated method stub
		System.out.println("�ܲ�..");
	}
}








