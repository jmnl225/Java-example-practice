
public class SwimmingRobot extends Robot {
	
	//���ο� ��ɸ� �߰��ϸ� ��
	
	void swimmint() {
		System.out.println("����!");
	}
	
	
	//�������̵� override
	void move() {
		System.out.println("÷��÷��");
	}


	@Override //annotation: �����ּ�
	void attack() {
		// TODO Auto-generated method stub
		System.out.println("��� �߻�");
	}
	
	
	
	
	
	
	
}
