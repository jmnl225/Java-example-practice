package com.ruby.java.ch11;

import java.io.FileInputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		
		try(FileInputStream fi= new FileInputStream("a.text")){
			
			int c= fi.read();
			System.out.println((char) c);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
