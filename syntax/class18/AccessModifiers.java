package com.syntax.class18;

public class AccessModifiers {

	// acces modifiers help access control the access to class properties/atributes
	// and methods/behaviors
	// 4 types
	// private, default, publc, protected
	// public: can be accessed anywhere in the project
	// default: can only be accessed within the same package
	// protected: can be accessed inside child classes
	// private: can be accessed within same class

	public String name;
	private String bankAccountPassword;
	String SSNNumber;

	public void printInfo() {
		System.out.println(name);
		System.out.println(bankAccountPassword);
		System.out.println(SSNNumber);
	}

	public static void main(String[] args) {
		AccessModifiers obj1 = new AccessModifiers();
		System.out.println(obj1.bankAccountPassword);
		System.out.println(obj1.name);
	}

}
