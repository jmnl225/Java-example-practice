import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		
		//Collection Ŭ������: �ڷᱸ���� ������ Java API Class- �뷮�� ������ ����
		
		//�÷����� ���� ����п� ���� ũ�� 3���� ������ ���е�
		//Collection �������̽��� 3���� ����: List, Set, Map [��� �������̽�]
		
		// 1) List: �ڷ���� ����� ������� ������, �ڵ� �ο��� �ε��� ��ȣ�� ����. �ߺ������� ���� ����
		// 2) Set: �ڷ���� ����� ���� ��� ���� ������, �ε��� ��ȣ ����, �ߺ������� ���� �Ұ�
		//eg- ������� Ȱ��
		// 3) Map: �ڷ���� ����� ���� ��� ���� ������, �ε��� ��ȣ ��� ���ڿ��� �� key���� ���� ��ҵ� ����, �ߺ��� key�� �Ұ�, �ߺ��� value ����
		
		// ����, List ��ĺ��� �˾ƺ���
//		List arr= new List(); //�������̽��� �ٷ� ��ü���� �Ұ�!
		
		// List�������̽��� ������ ����Ŭ������ ��ü�� ���� ����ؾ� ��
		
		// 1) List: ArrayList, LinkedList, Vector
		// 2) Set: HashSet, TreeSet, LinkedHashSet
		// 3) Map: HashMap, TreeMap, LinkedHashMap
		
		
		//����, ���� �� �˷����ִ� ArrayList���� ���
		//�÷��� Ŭ�����鵵 �迭ó�� ���� �ڷ����� ���� ����
		//�� �ڷ����� Generic�� �̿��ؼ� �����ϵ��� ��
		ArrayList<String> arrList= new ArrayList<String>(); //<>�ȿ� �ڷ����� ���� ������ default: Object
		
		
		// List �迭�� Ŭ������ �⺻������ �����ϰ� �ִ� �޼ҵ带 �˾ƺ���! 
		// List�迭 ��ǥ �޼ҵ�: add(), size(), remove(), get() ..
		
		// 1. ����� ����
		int size= arrList.size();
		System.out.println("��Ұ���: "+ size);
		
		
		// 2. ����� �߰�
		String s= new String("��");
		arrList.add(s);
		arrList.add(new String("����ʹ�."));
		arrList.add("��~!");
		System.out.println("��Ұ���: "+ arrList.size());
		
		
		// 3. ��� ������
		String str= arrList.get(0);
		System.out.println(str);
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		
		
		// 4. ��� �����ϱ�
		arrList.remove(1);
		System.out.println("��Ұ���: "+ arrList.size());
		System.out.println(arrList.get(1));
//		System.out.println(arrList.get(2)); //Exception
		
		
		
		//5. Ư�� ��ġ�� ��� �߰��ϱ�
		
		arrList.add(1, "���� ������");
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		
		
		//6. ������ �� �ε�����ȣ�� �ƴ϶� ��ü ���������� ���� ����
		String s2= new String("Test");
		arrList.add(s2);
		System.out.println("��Ұ���: "+arrList.size());
		arrList.remove(s2); //��� ���������� �̿��ؼ� ����
		System.out.println("��Ұ���: "+arrList.size());
		
		
		//7. ��� ��� �����
		arrList.clear();
		System.out.println("��Ұ���: "+arrList.size());
		
		
		//8. �ߺ��� ������ ���� ����
		arrList.add("�������� ���Ѵ�");
		arrList.add("�������� ���Ѵ�");		
		arrList.add("�������� ���Ѵ�");
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		
		
		
		//9. ����� �� ���� ��ɵ�..
		System.out.println(arrList.isEmpty()); //����ִ��� ����[true, false]
		System.out.println(arrList.contains("�������� ���Ѵ�")); //�� �����Ͱ� �ִ��� ����[true, false]
		System.out.println(arrList.contains("������"));
		
		
		
		//10. �� ���� ������� �߰��ϱ� (�ٸ� �÷��� ��ü�� ��Ҹ� �߰�)
		arrList.clear();
		arrList.add("��");
		arrList.add("����");
		arrList.add("�ʹ�");
		
		
		ArrayList<String> arrList2= new ArrayList<>();
		arrList2.add("please");
		arrList2.add("~!");
		
		arrList.addAll(arrList2); //�߰��� ����� ����
		
		System.out.println( arrList.toString() ); //�ڵ����� ��� ������ [, , ]�Ἥ ���ڿ��� ������
		
		
		
		//10-2. Ư�� ��ġ�� ������ �ѹ濡 �߰�
		arrList.addAll(1, arrList2);
		System.out.println( arrList.toString() );
		
		
		
		//11. Ư�� ��ҵ��� �ѹ��� ����
		ArrayList<String> arrList3= new ArrayList<String>();
		arrList3.add("����");
		arrList3.add("�ʹ�");
		arrList.removeAll(arrList3); //���� ����� ����
		System.out.println( arrList.toString() );
		
		
		
		//12. Ư�� ��ҵ鸸 ����� ����
		arrList.add("�Ф�");
		arrList.retainAll(arrList3);
		System.out.println( arrList.toString() );
		
		
		
		//13. Ư�� ��ҵ��� ��� ���ԵǾ� �ִ��� �ѹ濡 ��
		arrList.clear();
		arrList2.clear();
		
		arrList.add("�ФФ�");
		arrList.add("����");
		arrList.add("�̤�");
		arrList.add("�Ф�");
		arrList.add("�̤�");
		arrList.add("�Ф�");
		arrList.add("�ФФ�");
		
		arrList2.add("����");
		arrList2.add("�̤�");

		System.out.println(arrList.containsAll(arrList2));
		
		
		
		//14. List �迭���� �ִ� ���
		//Ư�� ��Ұ� ���° �濡 �ִ��� - ���ϰ��� int��[index ��ȣ]
		System.out.println( arrList.indexOf("�ФФ�"));
		System.out.println(arrList.lastIndexOf("�ФФ�"));
		System.out.println(arrList.lastIndexOf("aa")); //��ã���� -1
		
		
		
		
		//��ҵ��� ���������� ������

		//��� 1) for�� ����ϱ�
		for(int i=0; i<arrList.size(); i++) {
			
			String t= arrList.get(i);
			System.out.println( t );
			
		}
	
		System.out.println();
		
		//���2) Ȯ�大�� for�� (for each)
		
		for(String t : arrList ) {
			System.out.println(t);
		}
		
		System.out.println();
		
		
		//���3) iterator()..�� �̿�-> Set ����
		
		//���4) List�� �迭�� �����ؼ� ���
		//�� List��ü -> �迭 ��ü�� ��ȯ
		String[] arr= new String[arrList.size()];
		arrList.toArray(arr); //��Ұ����� ��� �����
		
		System.out.println( Arrays.deepToString(arr) ); //ARrayŬ����
		
		
		
		//�� ��!
		//���α׷��Ӱ� ������ Ŭ������ ArrayList�� ���� ����
		ArrayList<Person> persons= new ArrayList<Person>();
		Person p= new Person();
		p.name="Sam";
		p.age= 20;
		
		persons.add(p);
		System.out.println("��� ����: "+ persons.size());
		
		
		Person p2= persons.get(0);
		p2.show();
		
		
		
		persons.add( new Person() );
		System.out.println("��Ұ���: "+ persons.size());
		
		
		
		//�⺻�� �ڷ����� �����ϰ� �ʹٸ�..
		
		//ArrayList<int> arrList5= new ArrayList<int>(); //Generic�� �⺻�� ����� �Ұ�
		
		
		//int�� �ڵ����� ��ü������ �����ִ� WrapperŬ������ �̿�
		ArrayList<Integer> arrList5= new ArrayList<Integer>();
		arrList5.add(20); //�ڵ� new Integer()- auto boxing ���
		arrList5.add(30);
		arrList5.add(40);
		
		int n= arrList5.get(2); //Integer(30)�� �ڵ����� 30���� ��ȯ- auto unboxing
		System.out.println(n);
				 
		
		
		//����
		//List �迭�� �ٸ� Ŭ������
		
		LinkedList<String> linkList= new LinkedList<String>();
		//������� ArrayList�� ���� ���� - ���ɸ� �ٸ�
		//ArrayList���� ����� ����, ���� ���� ����.
		//ArrayList���� Ư�� ��ġ�� ���� �о���� ���� ����.
		
		linkList.add("����");
		linkList.add("������");
		System.out.println(linkList.size());
		System.out.println(linkList.get(0));
		System.out.println(linkList.get(1));
		
		
		
		//Vector(ArrayList�� 99% ���� - ����ȭ ó��(thread)�� �Ǿ�����)
		
		Vector<String> vector = new Vector<String>();
		
		
		//List�������̽��� �迭�� �ִ� ArrayList, LinkedList, Vector�� ��� ������� ����
		//List��������(�θ���������)�� ����Ŭ���� ��ü���� ��� ������ �� ����
		
		List<String> list= null;
		list= new ArrayList<String>();
		list= new LinkedList<String>();
		list= new Vector<String>();
		
		
		
		
		
		//�迭�� List�� �����ϱ�
		String[] arr2= new String[] {"��","����","�ʹ�"};
		List<String> li= Arrays.asList(arr2);
		System.out.println(li.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}//main end.


//����� ���� class

class Person{
	String name;
	int age;
	
	void show() {
		System.out.println("������!");
		System.out.println("name: "+ name);
		
	}
}





