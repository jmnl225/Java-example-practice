import java.util.HashSet;

public class SetTest {
	public static void main(String[] args) {
		
		//Set �������̽�: ������� X, �ε��� X, �ߺ� X
		
//		Set<String> set= new Set<String>(); //����: �������̽��� ��ü ���� �Ұ� 
		
		//Set �������̼��� ������ ����Ŭ�������� ���
		//1. HashSet: ������� �ľ�X, �ؽþ˰������� ���� ����, Set �迭�� ���� ���� ���� 
		//2. TreeSet: Data���� ���� ����������, red=black ���
		//3. LinkedHashSet: ����� ������� ����. ������ ���� ����
		
//		HashSet<String>= new HashSet<>
//		
//		
//		a.b
//		
//		d
//		for(String t: set) {
//			System.out.println( t );
//		}
//		
//		//TreeStroom
//		
//		LinkedHashSet<String>
//		sysout
//		
//		
//		//���2, �ݺ���Iterare<String> dates= set.interarp
//		while(true) {
//			if(datas.has)
//		}
		
		
		
		
		
		//���3. �迭�� ��ȯ�ؼ� ���
//		String[] arr= new String[set.size()];
//		set.toArray(arr);
		
		
		//��������� Ŭ������ �ߺ��˻簡 �⺻���� ���� ����
		//hashcode()�� equals()�޼ҵ带 �������̵� �ؾ߸� ��
		HashSet<AAA> set3= new HashSet<AAA>();
		set3.add(new AAA(10));
		set3.add(new AAA(20));
		set3.add(new AAA(10)); //�ߺ����� ���� ����
		System.out.println(set3.size());
		
		
		
		
		
		
		
	}
}



class AAA{
	int a;
	
	public AAA(int a) {
		this.a= a;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.a;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return ((AAA)obj).a== this.a;
	}
	
}










