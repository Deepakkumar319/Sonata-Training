package com.sonata2;

public class Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}

	public static void main(String[] args) {
		Calculator a1=new Calculator();
		
		
		System.out.println(a1.add(10,20));
		System.out.println(a1.mul(10, 20));
	}

}
