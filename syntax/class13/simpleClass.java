package com.syntax.class13;

public class simpleClass {

	String var1;
	int var2;
	
	public void method() {
		System.out.println("value of var 1 "+var1);
	}
	public String returnTheValueOfvar1() {
		return "Monika";
	}
	public void method2(String variable1) {
		var1=variable1;
	}
	
	public static void main(String[] args) {
		simpleClass class1=new simpleClass();
		class1.var1="eva";
		class1.method2("Mina");
		class1.method();
		System.out.println(class1.returnTheValueOfvar1());
		
	}
}
