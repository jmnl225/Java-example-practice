
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�Ϲ����� Ŭ������ ��ü������ ����
		Test t= new Test();
		
		//Test Ŭ������ �̳�Ŭ������ Nice���
//		Nice n; //�νĺҰ�!
		
		//�ƿ��� Ŭ���� ���� ����ϸ� �νĵ�.
//		Test.Nice n;
		
		//�ν��� �Ǵ��� ��ü ������ �Ұ�!
//		Test.Nice n2= new Test.Nice(); //��ü���� �ȴ�~!
		
		
		//�ܺο��� �̳�Ŭ������ �� ����ϰ� �ʹٸ�?
		// -> �ƿ��� ��ü���� �����޶�� ��Ź����. ����� �޾ƾ���!
		
		Test.Nice n2=t.makeInnerClassObject();
		n2.k=50;
		n2.aaa();
		
		
		//�����ڵ��� ���� �Ⱦ��ϴ� �ڵ�/ ǥ�⹮��!!
//		Test.Nice n3= t.new Nice();
//		n3.aaa();
		
		
		
		Test t2= new Test(); //�ƿ��Ͱ�ü�� ������ٰ� �̳ʰ�ü�� �ڵ����� �������� ����!
		
		//static �̳�Ŭ������ �ƿ��;��� ��ü���� ����!
		 First.Hello h=new First.Hello();
		
		
		
	}

}
