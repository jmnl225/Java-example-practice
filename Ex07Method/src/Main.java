import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//�л� ���� ���� ���α׷�
		//�̸�, ����, ���� ���

		String name;
		int kor;
		int eng;
		double aver;
		
		name="sam";
		kor=70;
		eng=80;
		
		aver=(double)(kor+eng)/2;
		
		
		//�л��� �������̸�? -> ������ �����߻�
		//���� ������ �ѹ��� ���� - �迭
		//�迭�� ���� �ڷ����� ���� �� ����
		
		//�ڷ������� ���� ����� �л� �����Ͱ� �л�Ǿ��־� ������
		//�����ִ� �����ͳ��� ���� (=class) , ������ ȿ����.
		
		//�����ִ� �����ͳ��� ������ �����ϴ� class ����
		//���ο� Ŭ���� ����! ������ .java������ ����� ���� ����
		
		
		
		//���� ����� StudentŬ������ ��ü�� ����
		
		
		Student stu= new Student();
		stu.name="sam";
		stu.kor=70;
		stu.eng=80;
		stu.aver=(double)(stu.kor+stu.eng)/2;
		
		Student stu2= new Student();
		stu2.name="Robin";
		stu2.kor=40;
		stu2.eng=45;
		stu2.aver=(double)(stu2.kor+stu2.eng)/2;

		
		//ȭ�� ���
		//System.out.println(stu); //��ü����
		System.out.println("�̸�: "+stu.name);
		System.out.println("����: "+stu.kor);
		System.out.println("����: "+stu.eng);
		System.out.println("���: "+stu.aver);
		System.out.println();
		
		System.out.println("�̸�: "+stu2.name);
		System.out.println("����: "+stu2.kor);
		System.out.println("����: "+stu2.eng);
		System.out.println("���: "+stu2.aver);
		
		
		//��ü ����� ����
		int ko=10;
		stu.kor=ko;
		
		System.out.println("����� kor��: "+stu.kor);
		System.out.println();
		
		
		
		
		//����� �� �����͸� Ű����� �Է¹��� ���� ����.
		
		//Ű���� �Է±���� ���� ��ü ����
		Scanner scan=new Scanner(System.in);
		
		Student stu3=new Student();
		stu3.name=scan.next();
		stu3.kor=scan.nextInt();
		stu3.eng=scan.nextInt();
		stu3.aver=(double)(stu3.kor+stu3.eng)/2;
		
//		System.out.println("�̸�: "+stu3.name);
//		System.out.println("����: "+stu3.kor);
//		System.out.println("����: "+stu3.eng);
//		System.out.println("���: "+stu3.aver);
//		
		//�̷� ������ ���� ����ϴ� ���
		//�� ��ü���� Ư���� ������ ������ �� �ִ� ����� �� �� �ִٸ�~? (method)
		
		
		//java ������ class�ȿ� Ư�� ����(���)�� �����ϴ� �ڵ带 �ۼ��� �� ����
		//�̷� Ư�� �ڵ尡 �ۼ��� ������ �Լ���� �θ���. 
		//METHOD
		
		stu3.show(); //�޼ҵ� ȣ��
		
		//��ü�� ������ ����� ���� ������ ���� �ʰ�
		//��ü�� ��±���� �̿��ؼ� ���ϰ� ��� ����
		
		stu3.output();
		
		Student stu4=new Student();
		stu4.name="Choi";
		stu4.kor=80;
		stu4.eng=63;
		//����� ����ϴ� ��ɵ� ������!
		stu4.calAverage();
		
		stu4.output();
		
		//��������� ���� �����ϴ� �͵�!?
		//Ư�� ����� �����ϸ鼭 �����͸� ����! (=�Ķ����)
		
		//TODO: ���� ������ �Է±�� �����!
		
	}

}
