package com.syntax.class17;
public class StaticVariableDemo {
	
		// any instance variable declared with a static keyword is called static variable.
		static String name="Mina";
		
		void printInfo() {
			System.out.println(name);
		}
		
		public static void main(String[] args) {
			System.out.println(StaticVariableDemo.name);
			
		
	}
}
