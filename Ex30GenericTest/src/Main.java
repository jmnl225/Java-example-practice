
public class Main {
	public static void main(String[] args) {
		
		//Generic [���׸�]
		//Ŭ������ �����Ҷ� �ڷ����� �������� �ʰ�, new �� �� �����ϵ��� �ϴ� ���
		
		Box box= new Box();
		
		box.a= 10;
		
		
		box.setA(10);		//�ڵ� new Integer : Wrapper
		System.out.println(box.getA());
		
		box.setA(3.14);		//�ڵ� new Double : Wrapper
		System.out.println(box.getA());
		
		box.setA("Hello");	//�ڵ� new String
//		System.out.println( box.getA() );
		String s= (String)box.getA();
		//��, Object �ڷ����� ���� ���� ���� �� ���� �ٿ�ĳ������ �ؾ���
		
		//�׷��� ��ü�� ������ ��(new) �ڷ����� �����ϴ� ��� ���
		Box2<String> box2; //<> �ڸ��� String�� �����߱⿡ Box2 Ŭ���� �ȿ� �ִ� T �۾��� ��� String���� ����
		
		
		box2.setA("aaa);"
		
				
		
		//����ó�� �������� �Ϻ� ������ ���� ����
		
		box.setA(10);
		int num= (Integer)box.getA(); //���ϵǴ� ���� integer�� �ƴ� object ��ü�� �ν�
		
		
		int b= new Integer(50); //�ڵ����� 50���� ��ȯ��
		Integer k= 50;
		
		
		
		//��, �⺻��()Primitive �ڷ����� <>�ȿ� ��� �Ұ�
		//Bpx2<int>
		
		Box2<Integer> b4= new Box2<Integer>();
		b4.setA( new Integer (10));
		Integer i=
		
		
		
		
		
		
		
	}

}

//���׸� ������ ��밡��
class Box3<T


//���׸� - Ŭ������ ������ �� ����� �ڷ����� �������� ����
//���� �ٲ�ġ�� ����: �� Ŭ������ ��ü�� new�� �� <T>��ġ�� ������ �ڷ������� Ŭ���� �ȿ� �ִ� T �۾����� �ٲ�ġ�� ��
class Box2<T>{
	
	T a;
}

Void setA(T a) {
	this.a= a;
}

T getA() {
	return this.a;
}





//���� �ڽ�- �ڷ��� ���� ���� �����ϴ� ��

class Box{
	Object a; //java�� �ֻ��� Ŭ����(root Ŭ����) 
	
	void setA(Object a) {
		this.a= a;
	}
	
	Object getA() {
		return this.a;
	}
	
	
}