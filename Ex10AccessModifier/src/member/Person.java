package member;

public class Person {
	
	//�̸�, ����, ���� (���� ����
	private String name;
	private int age;
	private String nation;
	
	//��������� �� �����ϴ� ����Լ�(�޼ҵ�)
	
	public void setMembers(String name, int age, String nation) {
		this.name= name;
		this.age= age;
		this.nation= nation;
	}

	//��� ������ ����ϴ� ��� �Լ�
	public void show() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("nation: "+nation);
		System.out.println();
	}

	
	//���Ϳ� ���� �ڵ����� �����
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	
	
/*	//����������� ���� �����ϴ� set �Լ� :: ���� �޼ҵ�!
	
	public void setName(String name) {
		this.name= name;
	}
	
	public void setAge(int age) {
		this.age= age;
	}
	
	public void setNation(String nation) {
		this.nation= nation;
	}
	
	
	//����������� ���� �������ִ� (private�̶� ���� �� �� ����!) :: ���� �޼ҵ�!!
	// get �����
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getNation() {
		return this.nation;
	}
*/
	
	
	
}
