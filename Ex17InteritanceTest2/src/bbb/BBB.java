package bbb;

import aaa.AAA;

public class BBB extends AAA {// AAA�� �ٸ� ��Ű���� Ŭ�������� �׳��� �ν��� �Ұ���!
	
	//�̹� AAA�� 4�� ������ ����
	
	void show() {
//		System.out.println( a ); // a�� �ִ°� ������ private �̿��� ��� �Ұ�!
//		System.out.println( b ); // b�� default �ٸ� ��Ű���� ����� ���� �Ұ�!
		System.out.println( c ); // BBB�� AAA�� ��Ӱ��迩�� ����
		System.out.println( d ); // public
	}
	
	
	
}
