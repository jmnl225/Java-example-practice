
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Student��ü ����
		Student stu= new Student();
		stu.name="Sam Smith";
		stu.kor=80;
		stu.eng=70;
		
		
		stu.show();
		
		Student stu2= new Student();
		//���� ������ �����ϴ°� ������~!
		
		stu2.setMembers("robid", 40, 60); //����� ȣ���ϸ鼭 �����ϰ��� �ϴ� ���� �Ķ���Ϳ� �Է�
		stu2.show();
		
		Student stu3= new Student();
		stu3.setMembers("Choi", 50, 60);
		stu3.show();
		
		//��������߿��� �ϳ��� ���� �����ϱ�!
		
		//����������� ���� �����ϴ� ����Լ��� �ʼ������θ���
		
		stu3.setEng(75);
		stu3.show();
		
		//� �л��� ������ ������ �ʹٸ�!
		//int total=stu3.kor+stu3.eng;
		//System.out.println("����:  "+total);
		
		
		//��������ɵ� ��ü ������ �����ֵ���!
		
		int total=stu3.calTotal();
		System.out.println("����:  "+total);
		
		
		//������
		
		double aver= (double)stu3.calTotal()/2;
		System.out.println("���1:  "+aver);
		
		//��հ�굵 ��ü ������ �ϰ� ������!
		//��, ��� ��� ��� �߰� 
		
		double average=stu3.calAverage();
		System.out.println("���2:  "+average);
		
		//�޼ҵ� �ȿ��� �޼ҵ� ȣ��
		aver=stu3.calAverage2();
		System.out.println("���3:  "+aver);
		
		
		
		//�ᱹ
		//��ü�� ����+�޼ҵ带 ���� ��!
		
		//��ü �߿��� �޼ҵ常 �ִ� �༮�� ���� -> ����

	}

}
