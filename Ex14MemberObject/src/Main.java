
public class Main {
	public static void main(String[] args)
	{
		
		//Ŭ���� �ȿ� �ٸ� Ŭ������ ���������� ��������� ���� ��쿡 ���� �������
		
		Car car= new Car();
		//������� ���
		System.out.println(car.model);
		System.out.println( car.p );
		System.out.println();
		
		//��������� �� ����
		car.model=9999;
		car.p= new Person(); //��ü�� ������־����!!!!!!!!!!!!!!!!!! 
		//���������� �����ϱ� ���ؼ��� ��ü�� ���� ��������.
		
		//������� ���
		System.out.println(car.model);
		//System.out.println( car.p );
		//��������� �����ϴ� ��ü�� ��������� ����ؾ� Data�� ��.
		System.out.println(car.p.name);
		System.out.println(car.p.age);
		System.out.println();
		
		//����� �����ϴ� ��ü�� ��� �������� ���� �����ؾ���~
		car.p.name="Sam";
		car.p.age=20;
		
		
		System.out.println( car.model );
		System.out.println( car.p.name );
		System.out.println( car.p.age );
		System.out.println();
		
		//Person�� ������� ���⼭ �� ���� ��?
		//��ü�� �� ����� ��ü ������ �ؾ���!
		
		
		System.out.println( car.model ); //car�� �� ���� ���� ����~
		car.p.show();
		
		car.show();
		
		//�׷��ٸ� ��ü�� �Է��� �ִ°͵�...?
		//�̰͵� �޼ҵ�� ����!
		
		//���ο� ��ü�� ���� ����� �ʰ� ��� ����
//		Car car2= new Car();
//		car2.model=1122;
//		car2.p=new Person();
//		car2.p.name="Robin";
//		car2.p.age=25;
		
		//Person�� ����� ������ �����ϱ� ���ٴ� �Է±���� �ִٸ� �� ������ �ڵ尡 �������ٵ�!!!
		
//		car2.p.setMembers("Robin", 25);
//		car2.show();
		
		//�̷����̸� Car�� ����� ���Ե� �޼ҵ带 �̿�
//		Car car3= new Car();
//		Person p= new Person();
//		p.setMembers("Jack", 19);
//		car3.setMembers(1122, p); //p�� ��ü�� �����ؾ��� �� ��
//		//��...........�̰� �� �ƴѵ�..............?
//		
//		Car car4=new Car();
//		car4.setMembers(3232, p);
//		car4.show();
		
		//�� �� ���ƺ��̱� �ϴµ�.
		//���ο� ��ü �����Ҷ����� �����ٿ� �� setMembers() �޼ҵ� ȣ�� �ڵ尡 ���ݾ�
		//�׳� ��ü ������ �� ����� �̸� �ʱ�ȭ �ȴ�?
		
		Car car5=new Car(5515, "Lee", 40);
		car5.show();
		
		
		
		
		
		
		
		
	}
}
