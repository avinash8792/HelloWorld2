package com.avi.first;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World ..... From Main class");
		System.out.println("Made changes");
		
		ClassB cb = new ClassB();
		ClassC cc = new ClassC();
		
		cb.sayHello();
		cc.sayHi();
		
	}

}
