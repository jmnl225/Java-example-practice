
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot r= new Robot();
		r.move();
		r.attack();
		System.out.println();
		
		FlyRobot fr= new FlyRobot();
		fr.move();		//�������̵� : ���� ������� �޼ҵ�� ���
		fr.attack();
		fr.fly();
		System.out.println();
		
		SwimmingRobot sr= new SwimmingRobot();
		sr.move();		//�������̵�� �޼ҵ� ȣ��
		sr.attack();
		sr.swimmint();
		System.out.println();
		
		//���ݱ��� �� �������̵�� �޼ҵ��� ������ ������ �ٸ��� �ۼ��ϴ� ���.
		
		//������, ��������� �״�� ���� �Ϻθ� �߰��ۼ�!
		Second s= new Second();
		s.show();
		
		

	}

}
