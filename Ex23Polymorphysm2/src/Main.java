
public class Main {
	
	public static void main(String[] args) {
		
		
		//��) �ۿ� ����ĳ���� 3���� (Dog, Cat, Pig)
		Dog d= new Dog();
		Cat c= new Cat();
		Pig p= new Pig();
		
		d.say();
		c.say();
		p.say();
		System.out.println();
		
		
		//���� �̷� ������ü���� �����������?
		//Dog 5, Cat 10, Pig 3
		
		//�迭�� ���� ������ü�� �ϳ��� �����ϴ� ���� ����
//		Dog[] dogs= new Dog[5];
//		Cat[] cats= new Cat[10];
//		Pig[] pigs= new Pig[3];
		
		//���������� ĳ���ͺ��� �迭�� �����ֱ⿡ ��ü�� �ϳ��� ������ �� ����
		//ĳ���ͺ��� ���� ���� �ƴ� �ϳ��� �迭�� ��� ��ü�� ��� ����ϸ� �� �����ϰ� ��밡��
		
		//Dog, Cat, Pig�� �ϳ��� ���� ���� �Ұ���. => ���� �ٸ� class(�ڷ���
		
		//�̷��� �� Dog, Cat, Pig�� ��� ������ �� �ִ�
		//���� �ڷ������� ���� �ִٸ� �ϳ��� �迭�� ���� ���� ����
		
		// Dog, Cat, Pig �� Animal�� ��Ӱ�����?
		// Animal ���������� Dog, Cat, Pig ��ü ������ ������
		
		Animal ani= (Animal)new Dog(); //��ĳ����[�θ�-�ڽ� ����]
		Animal ani2= new Cat();
		Animal ani3= new Pig();
		
		
//		double a=10; //int 10�� �ڵ����� double�� ����ȯ
//		int b= (int)3.14; //���� ����ȯ�� ǥ������. 
		
		ani.say();//���������� �����ϴ� ������ü�� say()�ߵ�
		ani2.say();
		ani3.say();
		System.out.println();
		
		//�̷����̸� animal���������� �迭�� �����..
		//�������� �� �����ϰ� ������� ����!
		
		Animal[] anis= new Animal[5]; //Animal �������� 5���� ���� ��!!!! ��� �ȿ��� null���� �����ִ�. ��ü�� ����Ű�� �۾��� ��!!!!!! �������.
		anis[0].say();
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();
		
		anis[0]=new Dog();
		anis[1]=new Cat();
		anis[2]=new Dog();
		anis[3]=new Pig();
		anis[4]=new Cat();
		
		anis[0].say();
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();
		System.out.println();
		
		for(int i=0; i<anis.length; i++) {
			anis[i].say();
		}
		System.out.println();
		
		
		//Ȯ��� for��
		for(Animal t : anis) {
			t.say();
		}
		
		
		
		//�������� �迭�θ� ������ ����!
		//�޼ҵ��� �Ķ���ͳ� ����Ÿ�����ε� �ſ� �����ϰ� ���
		
		
		
		
		
	}
		
}
