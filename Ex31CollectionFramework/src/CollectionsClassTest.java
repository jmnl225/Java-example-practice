import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;

public class CollectionsClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Collections 클래스의 static 메소드 소개
		// 1) sort()
		// 2) shuffle()
		
		
		
		ArrayList<String> datas= new ArrayList<String>();
		
		datas.add("졸려!!");
		datas.add("내일은");
		datas.add("어린이날!");
		datas.add("놀고싶다");
		datas.add("집에 가고 싶어!");
		datas.add("집!!");
		System.out.println(datas.toString());
		
		
		//리스트의 요소들 정렬
		Collections.sort(datas);
		System.out.println( datas.toString());
		
		
		//요소들의 위치를 랜덤하게 섞어줌
		Collections.shuffle(datas);
		System.out.println( datas.toString());
		
		
		
		//자료구조에서 가장 유명한 2가지 저장구조
		//Stack(스택)과 Queue(큐)의 구조와 용어
		//1. Stack: Push(요소추가) / Pop(요소 꺼내기)   FILO(First Input Last Output) 먼저 저장된 것이 나중에 나옴
		//2. Queue: offer(요소추가) / poll(요소 꺼내기) FIFO(First Input First Output) 먼저 저장된 것이 먼저 나옴
		
		
		//실제 이 구조를 위한 클래스가 존재
		Stack<String> stack= new Stack<String>();
		stack.push("들어가!");
		System.out.println(stack.size()); 
		String s= stack.pop(); // 실제 요소ㅓ가 빠져나옴 = 개수가 줄어듦. Get과 다름!!
		System.out.println(stack.size()); 
		
		
		System.out.println("=========");
		
		Queue<String> queu= null; //큐는 그냥 사용 못하고 구현해서 사용
		queu.offer("야압!");
		String s2= queu.poll(); //실제 요소가 빠져나옴
		
		
		
		
		
		
		
		
	}

}
