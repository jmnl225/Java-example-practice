
public class Main {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=4;
		
		//��Ģ������ ���ִ� ���� ��ü ����(��ɸ� �ִ� ��ü)
		Calculator cal=new Calculator();
		
		//���� ���
		int sum=cal.add(a, b);
		System.out.println(sum);
		
		int sub=cal.subtract(a, b);
		System.out.println(sub);
		
		int mul=cal.multiply(a, b);
		System.out.println(mul);
		
		int div=cal.divide(a, b);
		System.out.println(div);
		
		
		
		
		double c=3.5;
		double d=4.6;
		
		System.out.println( cal.add(c, d) );
		System.out.println( cal.subtract(c, d));
		System.out.println( cal.multiply(c, d));
		System.out.println( cal.divide(c, d));
		
		
		
		
		//����ó�� ���̴� ���ڿ��� ��������
		
		System.out.println("123"+"456");
		
		//���ڿ��� ���ڷ� ��ȯ�ؼ� ���� ��������� ���ִ� ����� ���� ��ü�� �ִٸ�?!
		System.out.println( cal.add("123", "456"));
		
		
		
		
		
		//���� ���� = call by vallue, 
		
		int n=10;
		
		Cal ca= new Cal();
		//���޹��� ���� 1 ���������ִ� ��� ����
		ca.increase(n); //�Ķ���Ϳ� ������ �μ�(argument)���� ����: call by value
		System.out.println(n);
		
		
		// ������(�ּ�)�� �����ϴ� ��� call by reference
		int[] arr= new int[] {10, 20, 30};
	 	ca.increase(arr);
	 	System.out.println("");
		for(int t: arr) {
			System.out.println(t);
		}
		//�ּҸ� �����ؼ� �� �ּҾ��� ���� �����߱� ������ ó�� ����Ű�� �ִ� arr�� ������ ����!
		
		
		
		
		//�������� ����(=�Ķ����)
		ca.aaa(10);
		ca.aaa(10,20,30);
		
		
		
		
	} //main method 

}//main class


class Cal{
	
	//���޹��� ���� 1 ������Ű�� ��� - call by vallue
	void increase(int x) {
		x++;
		System.out.println("x: "+ x);
	}
	
	//�迭�� �Ķ���ͷ� �޾� �� ������ 1�� ������Ű�� ���
	
	void increase(int[] aaa) {
		for(int i=0; i<aaa.length; i++) {
			aaa[i]++;
		}
		System.out.print(aaa[i]+", ");
	}
	
	
	//�������� ����
	void aaa(int... a) { //...�� ��� ����, a�� �迭�� ��
		
	}
	
	
}








