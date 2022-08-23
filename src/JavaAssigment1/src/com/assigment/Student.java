package com.assigment;

public class Student {
	int stdID;
	String stdName;
	int stdClass;
	public static void main(String args[]) {
		Student s1=new Student();
		s1.stdID=1111;
		s1.stdName="Deepak";
		s1.stdClass=8;
		System.out.println(s1.stdID+"  "+s1.stdName+"   "+s1.stdClass);
		Student s2=new Student();
		s2.stdID=1113;
		s2.stdName="Ram";
		s2.stdClass=9;
		System.out.println(s2.stdID+"  "+s2.stdName+"   "+s2.stdClass);
	}

}
