package com.syntax.class15;

public class MethodSTUDENTS {
	String name;
	int age;
	String studentId;
	String schoolName;
	
	void study() {
		System.out.println(name+ " studies in "+ schoolName);
	}
	void payTution() {
		System.out.println(name+ " pays the tution");
	}
	
	
public static void main(String[] args) {
	MethodSTUDENTS obj =new MethodSTUDENTS();
	obj.name="Mina";
	obj.age=34;
	obj.schoolName="kabul";
	obj.study();
	obj.payTution();
}
}
