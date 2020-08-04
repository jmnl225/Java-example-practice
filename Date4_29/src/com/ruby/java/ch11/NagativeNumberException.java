package com.ruby.java.ch11;

public class NagativeNumberException extends Exception {
	
	public NagativeNumberException() { //새로운 에러를 추가
		
		super("음수는 허용하지 않습니다.");
		
	}

}
