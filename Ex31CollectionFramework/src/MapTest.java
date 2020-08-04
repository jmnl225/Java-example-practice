import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		
		
		//key-value 데이터를 저장하는 방식
		//Map도 인터페이스이므로 직접 객체생성 불가
		
		//Map을 구현한 하위 클래스들을 사용
		
		HashMap<String, String> map= new HashMap<String, String>();
		
		TreeMap<String, String> map3= new TreeMap<String, String>(); //key값 알파벳 정렬
		LinkedHashMap<String, String> map4= new LinkedHashMap<String, String>(); //저장된 순서대로 정렬
		Hashtable<String, String> map5= new Hashtable<String, String>(); //99% HashMap과 비슷함. 동기화처리가 되어있음.
		
		//요소 추가
		map.put("상태", "졸려");
		map.put("ID", "Sam");
		map.put("PW", "1234");
		map.put("Say", "졸려"); //중복 value는 허용됨
		map.put("Say", "Hello!"); //중복 key값 안됨, 기존 key의 value 변경
		
		System.out.println("요소개수: "+map.size());
		
		//요소 얻어오기
		String st= map.get("상태");
		System.out.println(st);
		System.out.println(map.get("ID"));
		System.out.println(map.get("PW"));
		System.out.println(map.get("Say"));		
		//못 찾으면 null
		
		//순차적으로 출력해보기
		//for문 불가 - index가 없음
		//확장된 for문도 불가
//		for( String t: map) Error!
		
		
		System.out.println("---------------------------");
		
		
		//방법 1. ***자주 사용***
		//일단 key 값을 쭉 뽑아 옴.
		Set<String> keys= map.keySet();
		for(String t : keys ) {
//			System.out.println( t );
			System.out.println( t + " : " + map.get(t));
		}
		System.out.println();
		
		//방법2. Map객체를 Set으로 변환?
		Set<Entry<String, String>> entries= map.entrySet();
		for(Entry<String, String> e : entries ) {
			System.out.println( e.getKey()+ " : " + e.getValue());
		}
		
		
		System.out.println();
		//만약 key 값을 인덱스 번호로 하고싶다면
		//key의 자료형을 integer로 생성
		
		HashMap<Integer, String> map2= new HashMap<Integer, String>();
		map2.put(0, "AWW");
		map2.put(1, "So");
		map2.put(2, "Sleepyyy");
		
		for (int i=0; i<map2.size(); i++) {
			System.out.println(map2.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
