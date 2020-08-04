import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		
		
		//key-value �����͸� �����ϴ� ���
		//Map�� �������̽��̹Ƿ� ���� ��ü���� �Ұ�
		
		//Map�� ������ ���� Ŭ�������� ���
		
		HashMap<String, String> map= new HashMap<String, String>();
		
		TreeMap<String, String> map3= new TreeMap<String, String>(); //key�� ���ĺ� ����
		LinkedHashMap<String, String> map4= new LinkedHashMap<String, String>(); //����� ������� ����
		Hashtable<String, String> map5= new Hashtable<String, String>(); //99% HashMap�� �����. ����ȭó���� �Ǿ�����.
		
		//��� �߰�
		map.put("����", "����");
		map.put("ID", "Sam");
		map.put("PW", "1234");
		map.put("Say", "����"); //�ߺ� value�� ����
		map.put("Say", "Hello!"); //�ߺ� key�� �ȵ�, ���� key�� value ����
		
		System.out.println("��Ұ���: "+map.size());
		
		//��� ������
		String st= map.get("����");
		System.out.println(st);
		System.out.println(map.get("ID"));
		System.out.println(map.get("PW"));
		System.out.println(map.get("Say"));		
		//�� ã���� null
		
		//���������� ����غ���
		//for�� �Ұ� - index�� ����
		//Ȯ��� for���� �Ұ�
//		for( String t: map) Error!
		
		
		System.out.println("---------------------------");
		
		
		//��� 1. ***���� ���***
		//�ϴ� key ���� �� �̾� ��.
		Set<String> keys= map.keySet();
		for(String t : keys ) {
//			System.out.println( t );
			System.out.println( t + " : " + map.get(t));
		}
		System.out.println();
		
		//���2. Map��ü�� Set���� ��ȯ?
		Set<Entry<String, String>> entries= map.entrySet();
		for(Entry<String, String> e : entries ) {
			System.out.println( e.getKey()+ " : " + e.getValue());
		}
		
		
		System.out.println();
		//���� key ���� �ε��� ��ȣ�� �ϰ�ʹٸ�
		//key�� �ڷ����� integer�� ����
		
		HashMap<Integer, String> map2= new HashMap<Integer, String>();
		map2.put(0, "AWW");
		map2.put(1, "So");
		map2.put(2, "Sleepyyy");
		
		for (int i=0; i<map2.size(); i++) {
			System.out.println(map2.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
