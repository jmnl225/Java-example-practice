
public class Main {
	public static void main(String[] args) {
	
		//� ������ ���������� ����- ȸ������ ����
		// ȸ������: �Ϲ�ȸ��, �л�, ����, �ٷ��л�
		
		
		//1. �Ϲ�ȸ��: �̸�, ����
		//2. ��	  ��: �̸�, ����, ����
		//3. ��	  ��: �̸�, ����, ��������
		//4. �ٷ��л�: �̸�, ����, ����, ����
		
		
		
		//1. �Ϲ�ȸ��
		
		Person p=new Person("Sam", 23);
		p.show();
		System.out.println();
		
		//2. �л�
		
		Student st= new Student("Robin", 20, "android");
		st.show();
		System.out.println();
		
		//3. ����
		
		Professor pro= new Professor("Lee", 50, "mobile optimizition");
		pro.show();
		System.out.println();
		
		//4. �ٷ��л�
		
		AlbaStudent alba= new AlbaStudent ("Hong", 23, "web", "PC management");
		alba.show();
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
