
public class Student {

	String name;
	int kor;
	int eng;
	
	//��� �Լ� - �޼ҵ�
	//��������� ���� ������ִ� ���
	
	void show() {
		System.out.println("�̸�:  "+ name);
		System.out.println("����:  "+ kor);
		System.out.println("����:  "+ eng);
		System.out.println();
	}
	
	
	//�ʵ忡 ���� �����ϴ� �޼ҵ�
	
	void setMembers(String name, int kor, int eng) {
		//�Ű������� ��������� ���� �ٸ� ����
		//�Ű������� ���� ��������� ����
		
		this.name=name; //this. �̶�� ���������� ����ϸ� ��������� ��Ī
		this.kor=kor;
		this.eng=eng;
				
	}//setMembers end.
	
	
	//��������� ���� �����ϴ� ����Լ�
	
	void setNames(String name) {
		this.name=name;
	}
	
	void setKor(int kor){
		this.kor=kor;
	}
	
	void setEng(int eng) {
		
		if(eng<0 || eng>100) {
			System.out.println("�߸��� �� �Է��Դϴ�.");
			return; //�Լ�����
		}
		this.eng=eng;
	}
	
	
	//������ ����ϴ� ���
	int calTotal() {
		int total=this.eng+this.kor;
		return total;
	}
	
	
	
	//��� ����ؼ� �������ִ� ����Լ�(�޼ҵ�)
	
	double calAverage() {
		double aver=(double)(kor+eng)/2;
		return aver;
	}
	
	//�ϳ��� �޼ҵ忡�� �ٸ� �޼ҵ带 ȣ������
	
	double calAverage2() {
		double aver= (double)calTotal()/2;
		return aver;
	}
	
	
}
