import java.util.HashSet;

public class SetTest {
	public static void main(String[] args) {
		
		//Set 인터페이스: 순서대로 X, 인덱스 X, 중복 X
		
//		Set<String> set= new Set<String>(); //에러: 인터페이스는 객체 생성 불가 
		
		//Set 인터페이서를 구현한 하위클래스들을 사용
		//1. HashSet: 저장순서 파악X, 해시알고리즘으로 순서 결정, Set 계열중 가장 성능 좋음 
		//2. TreeSet: Data값에 따라 순선정해짐, red=black 사송
		//3. LinkedHashSet: 저장된 순서대로 정렬. 성능이 가장 나쁨
		
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
//		//방법2, 반복자Iterare<String> dates= set.interarp
//		while(true) {
//			if(datas.has)
//		}
		
		
		
		
		
		//방법3. 배열로 변환해서 출력
//		String[] arr= new String[set.size()];
//		set.toArray(arr);
		
		
		//사용자정의 클래스는 중복검사가 기본으로 되지 않음
		//hashcode()와 equals()메소드를 오버라이드 해야만 함
		HashSet<AAA> set3= new HashSet<AAA>();
		set3.add(new AAA(10));
		set3.add(new AAA(20));
		set3.add(new AAA(10)); //중복으로 보지 않음
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










