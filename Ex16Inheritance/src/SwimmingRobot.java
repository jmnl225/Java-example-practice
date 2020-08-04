
public class SwimmingRobot extends Robot { //2. class Robot의 내용을 확장시켜서 여기에 덧붙이자!
	
	//1. Robot 클래스가 갖고있는 멤버를 일일이 작성 해야하잖아!!
	//Robot의 멤버를 손쉽게 가져온다ㅕㅁㄴ?!
	// => 상속!
	
	//3. extends Robot을 작성하면 아무것도 쓰지 않고도
	// 이미 Robot의 멤버들을 모두 보유한 상태가 됨
	
	//4. 이 상태에서 추가하고 싶은 기능과 변수를 작성하기만 하면 됨
	

	int duckFoot;
	
	//이동, 공격, 수영 => 다 쓰려니 넘 힘듦 아..
	
	void swimming() {
		System.out.println("음파음파!");
	}
	

}
