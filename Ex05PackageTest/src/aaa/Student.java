package aaa;

import bbb.Nice;


//[이름, 국어, 영어] 데이터 저장 클래스
public class Student {
	
	//멤버변수 field
	public String name;
	public int kor;
	public int eng;
	
	
	
	//메인함수가 아닌 곳에서도 사용자정의 class사용이 가능

	Person p=new Person();
	
	bbb.Nice n=new bbb.Nice();
	//편하게 하고싶다면 import
	Nice nice=new Nice();
	
	aaa.Student s=new aaa.Student();
	
}
