package com.syntax.class18;

public class TypesOfVariables {
	String name;
	static String CompanyName="Syntax";
	
	void printInfo() {
		System.out.println(name+" Company "+CompanyName);
	}
	static void printCompanyInfo() {
		//System.out.println(name);==> can not access name, which is non-static variable
		System.out.println(CompanyName);
	}

	public static void main(String[] args) {
		
		TypesOfVariables obj1=new TypesOfVariables();
		obj1.name="Ram";
		
		TypesOfVariables obj2=new TypesOfVariables();
		obj2.name="Aiman";
		
		TypesOfVariables.printCompanyInfo();
	}
}
