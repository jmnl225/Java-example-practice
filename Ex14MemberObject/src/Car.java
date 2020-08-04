
public class Car {
	
	Person p; //다른 클래스를 멤버변수로 쓰자!
	int model; //모델번호
	
	
	
	//멤버 출력
	void show() {
		
		System.out.println("model: "+model);
		p.show(); //이미 person에 출력기능에 ㅣㅇㅆ는걸?
		
	}
	
	
	//멤버 입력
	void setMembers(int model, Person p) {
		this.model=model;
		this.p=p;
		
	}//아... 이건 좀 아닌데 ㅠ?
	
	//멤버입력 오버로딩
	void setMembers(int model, String name, int age) {
		this.model= model;
//		this.p.name= name;	//error
//		this.p.age= age;	//error
		//Person p 참조변수에 객체를 안 만들어서!!!!!!!!
		//포인트가 가리키는 객체가 없음!!!!!!!!!
		//입력이 안 된 다 ~!~!!!! 
		this.p= new Person();
		this.p.name= name;
		this.p.age= age;
	}
	
	
	//생성자!!!
	public Car(int model, String name, int age) {
		this.model= model;
//		this.p.name		
//		this.p = new Person();
//		this.p.setMembers("Chanel, 66");
		this.p = new Person(name, age);
	}
	
	//생성자 메소드 오버로딩
	public Car() {
		this.model= 0;
		this.p= new Person();
	}
		
}
	
	//생서ㅇ자 \\\ㅔㅔ
	
	
	
	

