//�ٸ� ��Ű���� Ŭ������ ���ϰ� ����ϰ� �ʹٸ�! import~!
import aaa.Student;

//aaa��Ű�� �ȿ� �֤��� ��� Ŭ������ �ѹ��� import�ϱ�!

import aaa.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//class���� + ��ü���� �� ���
		
		Test t= new Test();
		t.a=10; //������� ���
		t.show(); //��� �Լ��� ���
		
		//���� �̸��� ���� Ŭ������ ����� ������ ����~!
		//�ذ�å! package!!
		//���� ���� ������ ���� ���� �̸��� class�� ������ �� ����
		
		//[�̸�, ����, ����] ������ ���� ��ü
		
		aaa.Student stu=new aaa.Student();
		//�ٸ� package�� class�� [��Ű����.Ŭ����]�� �ؾ� �ν�
		
		//������� field
		stu.name="sam";
		stu.kor=70;
		stu.eng=50;
		
		//[�̸�, ����, ����] ������ ���� ��ü �� �����!
		//�Ź� ��Ű���� �ۼ� ��
		//��Ű������ �����ϴ� ���!!! = import
		
		aaa.Student stu2=new Student();
		Student stu3=new Student();
		
		
		//java system API Ŭ���� ���� import�� �ʿ�����!
		//��, Java system API Ŭ������ ��� ��Ű���� ����� ����
		
		
		java.util.Random rnd;
		
		//java.util�� ��Ű�� �̸�!
		//aaa.Studentó�� ���ϰ� ����ϱ� ���� import�� �ߴ� ����!
		
		
		//[�̸�, ����, �ּ�]�� �����ϴ� Student ��ü ����
		bbb.Student s1= new bbb.Student(); //�̹� Student�� �����Ƿ� import�� ������ ����� �Ұ���~!
		s1.name="robin";
		//s1.age=20; //���� ������ ������ ���Ұ�
		
		
		//��Ű���� �������
		//������ ��Ű������ ��� 2�ܾ� �̻����� �����!!!!!
		//�׸��� �� �ܾ� ���̿� .ǥ��
		//ex) mrhi.java / kakao.map
		//ex)google.api.android
		//�Ҽ�-ī�װ�-��� ��
		
		mrhi.dev.World w=new mrhi.dev.World();
		
		
		
		//����Ʈ ��Ű���� �ٸ� ��Ű������ ��� ����. 
		//�׷��� �ǹ����� ����Ʈ��Ű���� ������� ����!!

	}

}
