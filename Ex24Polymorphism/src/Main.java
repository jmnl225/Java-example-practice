import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ִϸ�(dog, cat, pig) ��ü�� ������
		//�ִϸ� ���尴ü ����
		
		AnimalFactory af= new AnimalFactory();
		
		//�ٿ�ĳ����
		
		
//		Dog d= af.makeAnimal(1); 
//		//�� �޼ҵ��� ���� �ڷ����� Animal�� ���̱� ������ Dog ��ü��� ��������� ����ȯ�� �ؾ���!!!
//		d.say();
//		d.guardHouse();
//		
//		Cat c= (Cat)af.makeAnimal(2);
//		c.say();
//		c.handleDeacon();
//		
//		Pig p= (pig)af.makeAnimal(3);
//		p.say();
//		p.eatAndEat();
//		
//		
//		//Animal �������� �Ϸ� ���� �ٸ����ϴ� �������
//		Animal ani5=null;
//		ani5=
		
		//ani5 Dog���� ������� ���Ұ�

				
		//Animal = gardhouse�� ����� ��� ����
		//ani ����ȯ �켱����
		
				
		//------------------------------------------------------------		
				
				
		//���뿹��
		//�����ϰ� ����ĳ���͸� ����� �ʹٸ�..
		//�����ϰ� 5������ ��ü �����ϰ� �̸� ����!
				
		Random rnd= new Random();

		
//		int n= rnd.nextInt(3)+1;
		
//		Animal an= af.makeAnimal(n); //Dog or Cat or Pig
//		an.say();
		
		
		Animal[] anis= new Animal[5];
		for(int i=0; i<anis.length; i++)
		{
			int n= rnd.nextInt(3)+1;
			anis[i]=af.makeAnimal(n);
//			anis[i].say();
		}
		
		//�� ��ü���� say() ����
		for(int i=0; i<anis.length; i++) {
			anis[i].say();
//			anis[i].sleep();
			
			//������� ��ü���� ������� ���
			//���ο� ������! : instanceof
			// � ��ü�� Ŭ������ �´°��� �˷��ִ� ������
			
			if( anis[i] instanceof Dog ) {
				Dog dog= (Dog)anis[i];
				dog.guardHouse();
			}
			else if( anis[i] instanceof Cat ) {
				Cat cat= (Cat)anis[i];
				cat.handleDeacon();
			}
			else if( anis[i] instanceof Pig ) {
				((Pig)anis[i]).eatAndEat();
			}
			
		}		
		
		
		//Animal Ŭ������ ��ü�� ��������� ������ Ŭ������ �ƴ�
		//�Ǽ��� Animal�� ��ü�� ���� ���� ����.
		//Animal a= new Animal();
		//a.say(); //����� ������ �� ����!
		//���α׷����� �������� �ʴ� ��ɸ޼ҵ�� ���������� ����
		
		//�� Animal�� �Ǽ��ζ� ����(new) ���� �ʵ��� ���������� ����ʹ�!
		
		//abstract �߻� Ŭ������ ����� new�� ��ü ���� �Ұ�!
		
		
	}

}
