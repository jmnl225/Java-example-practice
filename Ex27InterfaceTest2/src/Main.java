import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		
		//������ �������̽��� ����
		
		//Ƽ��: Unit �ζ��̽� ����
		//����1: Marine Ŭ���� ���� �� ����- �����̶�� �������� �⺻ ��� ����
		//����2: Tank Ŭ���� ���� �� ����
		//����3: Race Ŭ���� ���� ��  ����
		
		//Marine, Tank, Race�� �ݵ�� attack(), move() ����� ������ Ȯ��
		
		
		//������ ������� Ŭ�������� �̿��ؼ� ���� ���α׷��� �ۼ�
		
		
		
		//�� Ŭ������ ���������� ������� �ʰ�...
		//�θ� Ŭ������ ������ Unit �������̽� ���������� �̿��Ͽ� ��� ��������
		
		//Unit[] units= new Unit[200];
		//�迭�� ������ �����Ǿ��ֱ� ������ ���������� ������ �Ҹ��� �ݺ��Ǵ� ���� ���α׷��ֿ��� �������� ����.
		
		//���� ���� ���鶧�� ������ �迭�� �� ���� �����
		//ArrayList: ������ �迭 - ��ġ ����ó�� ��ü�� �ַ��ַ� ��������
		
		
		ArrayList<Unit> units= new ArrayList<Unit>();
		//ó�� ����: ���� 0��
		
		//��Ұ��� �����ϴ� ��ɸ޼ҵ� ȣ��
		int num= units.size();
		System.out.println("���ְ���: "+ num);
		
		//�迭�� unit��ü�� �����Ͽ� �߰�
		units.add(new Marine());
		units.add(new Tank());
		units.add(new Marine());
		units.add(new Race());		
		
		System.out.println("���ְ���: "+ units.size());
		System.out.println("\n-----------------------");
		
		//���ֱ�� ����ϱ�!
		Unit u=units.get(0); //0��° ��ġ�� ����ϳ� ����
		u.attack();
		u.move();
		
		u=units.get(1);
		u.attack();
		u.move();
//		
//		u= units.get(2);
//		u.attack();
//		u.move();
		
		for(int i=0; i<units.size(); i++){
			Unit u2= units.get(i);
			
			u2.move();
			u2.attack();
		}
		
		System.out.println("\n-----------------------\n");
		
		
		//Ȯ��� for each
		for( Unit unit: units) {
			unit.move();
			unit.attack();
		}
		
		
		//Marine�� Tank�� ������ ��� �ߵ�
		//���� ���(unit)�� Marine ��ü��?
//		if ( unit instanceof Marine) {
//			Marine m= (Marine)unit;
//			m.levelup();
//		}else if( unit instanceof Tank) {
//			Tank t=(Tank)unit;
//			t.levelup();
//		}
		
		//Marine�� Tank�� ��� Levelupable�� �ڽ��̹Ƿ�...
		Unit unit = null;
		if( unit instanceof Levelupable) {
			Levelupable a= (Levelupable)unit;
			a.levelup();

		}
		
		
	}// main static end.
}// main end.
