
public class Student {
	
	//�����ִ� �����͸� ������ �� �ִ� ������ ����
	//Field = �������
	
	String name;
	int kor;
	int eng;
	double aver;
	
	//����� ����
	//�� ) ȭ�鿡 aaa��� �۾��� ������ִ� ���! (function->method)
	void show() {
		//aaa�۾� ����ڵ� ���๮
		System.out.println("aaa");
	}
	
	void output() {
		System.out.println("�̸�: "+name);
		System.out.println("����: "+kor);
		System.out.println("����: "+eng);
		System.out.println("���: "+aver);
		System.out.println("-------------------");
		
		
		
		
		
	}
	
	
	//��հ���� �����!
	
	void calAverage() {
		
		aver=(double)(kor+eng)/2;
		
	}

}
