
//��ɸ� �ִ� Ŭ������ �ִ�

public class Calculator {
	
	//������� �޼ҵ� �����
	
	int add(int x, int y) {
		return x+y;
	}
	
	//�������
	
	int subtract(int x, int y) {
		return x-y;
	}
	
	//����
	
	int multiply(int x, int y) {
		return x*y;
	}
	
	//������
	
	int divide(int x, int y) {
		return x/y;
	}
	
	//��� ������ �����. -> �Ǽ��� ����� �߰�
	//����� ���� �ڷ����� �ٸ� ��
	//�޼ҵ��� �̸��� �ٸ��� �ָ� ���߿� ����� �� ���ŷ��ݾ�
	//�׸��� �� ���ڸ����� �ְܹ���
	//�̸��� ���Ծ��� �Ķ���͸� �ٸ��� ����ϴ� �޼ҵ� ���� ����!!!!!!!!!!!!!!!!!!!!!!!!
	//�����ε�(Over Loading)
	double add(double x, double y) {
		double sum= x+y;
		return sum;
	}
	
	double subtract(double x, double y) {
		return x-y;
	}
	
	double multiply(double x, double y) {
		return x*y;
	}
	
	double divide(double x, double y) {
		return x/y;
	}
	
	
	//���ڿ��� ���ڷ� ��ȯ�Ͽ� �����ϴ� ���!
	int add(String s1, String s2) {
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		return n1+n2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
