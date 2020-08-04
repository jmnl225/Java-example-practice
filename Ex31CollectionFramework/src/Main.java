import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		
		//Collection 클래스들: 자료구조를 구현한 Java API Class- 대량의 데이터 관리
		
		//컬렉션은 저장 방법론에 따라서 크게 3가지 종류로 구분됨
		//Collection 인터페이스의 3가지 종류: List, Set, Map [모두 인터페이스]
		
		// 1) List: 자료들이 저장된 순서대로 있으며, 자동 부여된 인덱스 번호가 있음. 중복데이터 저장 가능
		// 2) Set: 자료들이 저장된 순서 상관 없이 있으며, 인덱스 번호 없음, 중복데이터 저장 불가
		//eg- 블루투스 활용
		// 3) Map: 자료들이 저장된 순서 상관 없이 있으며, 인덱스 번호 대신 문자열로 된 key값을 통해 요소들 구분, 중복된 key값 불가, 중복된 value 가능
		
		// 먼저, List 방식부터 알아보기
//		List arr= new List(); //인터페이스는 바로 객체생성 불가!
		
		// List인터페이스를 구현한 하위클래스를 객체로 만들어서 사용해야 함
		
		// 1) List: ArrayList, LinkedList, Vector
		// 2) Set: HashSet, TreeSet, LinkedHashSet
		// 3) Map: HashMap, TreeMap, LinkedHashMap
		
		
		//먼저, 가장 잘 알려져있는 ArrayList부터 사용
		//컬렉션 클래스들도 배열처럼 같은 자료형만 저장 가능
		//그 자료형을 Generic을 이용해서 지정하도록 함
		ArrayList<String> arrList= new ArrayList<String>(); //<>안에 자료형을 쓰지 않으면 default: Object
		
		
		// List 계열의 클래스가 기본적으로 보유하고 있는 메소드를 알아보기! 
		// List계열 대표 메소드: add(), size(), remove(), get() ..
		
		// 1. 요소의 갯수
		int size= arrList.size();
		System.out.println("요소개수: "+ size);
		
		
		// 2. 요소의 추가
		String s= new String("집");
		arrList.add(s);
		arrList.add(new String("가고싶다."));
		arrList.add("집~!");
		System.out.println("요소개수: "+ arrList.size());
		
		
		// 3. 요소 얻어오기
		String str= arrList.get(0);
		System.out.println(str);
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		
		
		// 4. 요소 삭제하기
		arrList.remove(1);
		System.out.println("요소개수: "+ arrList.size());
		System.out.println(arrList.get(1));
//		System.out.println(arrList.get(2)); //Exception
		
		
		
		//5. 특정 위치에 요소 추가하기
		
		arrList.add(1, "집에 보내줘");
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		
		
		//6. 제거할 때 인덱스번호가 아니라 객체 참조변수로 제거 가능
		String s2= new String("Test");
		arrList.add(s2);
		System.out.println("요소개수: "+arrList.size());
		arrList.remove(s2); //요소 참조변수를 이용해서 제거
		System.out.println("요소개수: "+arrList.size());
		
		
		//7. 요소 모두 지우기
		arrList.clear();
		System.out.println("요소개수: "+arrList.size());
		
		
		//8. 중복된 데이터 저장 가능
		arrList.add("공휴일을 원한다");
		arrList.add("공휴일을 원한다");		
		arrList.add("공휴일을 원한다");
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		
		
		
		//9. 요소의 비교 관련 기능들..
		System.out.println(arrList.isEmpty()); //비어있는지 여부[true, false]
		System.out.println(arrList.contains("공휴일을 원한다")); //그 데이터가 있는지 여부[true, false]
		System.out.println(arrList.contains("공휴일"));
		
		
		
		//10. 한 번에 여러요소 추가하기 (다른 컬렉션 객체의 요소를 추가)
		arrList.clear();
		arrList.add("집");
		arrList.add("가고");
		arrList.add("싶다");
		
		
		ArrayList<String> arrList2= new ArrayList<>();
		arrList2.add("please");
		arrList2.add("~!");
		
		arrList.addAll(arrList2); //추가할 목록을 만듦
		
		System.out.println( arrList.toString() ); //자동으로 요소 값들을 [, , ]써서 문자열로 보여줌
		
		
		
		//10-2. 특정 위치에 여러개 한방에 추가
		arrList.addAll(1, arrList2);
		System.out.println( arrList.toString() );
		
		
		
		//11. 특정 요소들을 한번에 제거
		ArrayList<String> arrList3= new ArrayList<String>();
		arrList3.add("가고");
		arrList3.add("싶다");
		arrList.removeAll(arrList3); //지울 목록을 만듦
		System.out.println( arrList.toString() );
		
		
		
		//12. 특정 요소들만 남기고 제거
		arrList.add("ㅠㅠ");
		arrList.retainAll(arrList3);
		System.out.println( arrList.toString() );
		
		
		
		//13. 특정 요소들이 모두 포함되어 있는지 한방에 비교
		arrList.clear();
		arrList2.clear();
		
		arrList.add("ㅠㅠㅠ");
		arrList.add("ㅎㅎ");
		arrList.add("ㅜㅜ");
		arrList.add("ㅠㅜ");
		arrList.add("ㅜㅜ");
		arrList.add("ㅠㅜ");
		arrList.add("ㅠㅠㅠ");
		
		arrList2.add("ㅋㅋ");
		arrList2.add("ㅜㅜ");

		System.out.println(arrList.containsAll(arrList2));
		
		
		
		//14. List 계열에만 있는 기능
		//특정 요소가 몇번째 방에 있는지 - 리턴값이 int형[index 번호]
		System.out.println( arrList.indexOf("ㅠㅠㅠ"));
		System.out.println(arrList.lastIndexOf("ㅠㅠㅠ"));
		System.out.println(arrList.lastIndexOf("aa")); //못찾으면 -1
		
		
		
		
		//요소들을 순차적으로 얻어오기

		//방법 1) for문 사용하기
		for(int i=0; i<arrList.size(); i++) {
			
			String t= arrList.get(i);
			System.out.println( t );
			
		}
	
		System.out.println();
		
		//방법2) 확장ㄷ된 for문 (for each)
		
		for(String t : arrList ) {
			System.out.println(t);
		}
		
		System.out.println();
		
		
		//방법3) iterator()..를 이용-> Set 수업
		
		//방법4) List를 배열로 변경해서 출력
		//즉 List객체 -> 배열 객체로 변환
		String[] arr= new String[arrList.size()];
		arrList.toArray(arr); //요소값들이 모두 복사됨
		
		System.out.println( Arrays.deepToString(arr) ); //ARray클래스
		
		
		
		//그 외!
		//프로그래머가 정의한 클래스도 ArrayList에 저장 가능
		ArrayList<Person> persons= new ArrayList<Person>();
		Person p= new Person();
		p.name="Sam";
		p.age= 20;
		
		persons.add(p);
		System.out.println("요소 개수: "+ persons.size());
		
		
		Person p2= persons.get(0);
		p2.show();
		
		
		
		persons.add( new Person() );
		System.out.println("요소개수: "+ persons.size());
		
		
		
		//기본형 자료형을 저장하고 싶다면..
		
		//ArrayList<int> arrList5= new ArrayList<int>(); //Generic은 기본형 사용이 불가
		
		
		//int를 자동으로 객체형으로 감싸주는 Wrapper클래스를 이용
		ArrayList<Integer> arrList5= new ArrayList<Integer>();
		arrList5.add(20); //자동 new Integer()- auto boxing 기술
		arrList5.add(30);
		arrList5.add(40);
		
		int n= arrList5.get(2); //Integer(30)을 자동으로 30으로 변환- auto unboxing
		System.out.println(n);
				 
		
		
		//별외
		//List 계열의 다른 클래스들
		
		LinkedList<String> linkList= new LinkedList<String>();
		//사용방법은 ArrayList와 완전 같음 - 성능만 다름
		//ArrayList보다 요소의 삽입, 삭제 등이 빠름.
		//ArrayList보다 특정 위치의 값을 읽어오는 것이 느림.
		
		linkList.add("ㅎㅎ");
		linkList.add("ㅋㅋㅋ");
		System.out.println(linkList.size());
		System.out.println(linkList.get(0));
		System.out.println(linkList.get(1));
		
		
		
		//Vector(ArrayList와 99% 같음 - 동기화 처리(thread)가 되어있음)
		
		Vector<String> vector = new Vector<String>();
		
		
		//List인터페이스의 계열에 있는 ArrayList, LinkedList, Vector는 모두 사용방법이 같음
		//List참조변수(부모참조변수)로 하위클래스 객체들을 모두 참조할 수 있음
		
		List<String> list= null;
		list= new ArrayList<String>();
		list= new LinkedList<String>();
		list= new Vector<String>();
		
		
		
		
		
		//배열을 List로 변경하기
		String[] arr2= new String[] {"집","가고","싶다"};
		List<String> li= Arrays.asList(arr2);
		System.out.println(li.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}//main end.


//사용자 정의 class

class Person{
	String name;
	int age;
	
	void show() {
		System.out.println("집집집!");
		System.out.println("name: "+ name);
		
	}
}





