package com.syntax.class15;

public class StringClass {
public static void main(String[] args) {
	String class1="          class     ";
	String name="Ayob";
	String lastName="Metry";
	System.out.println(name);
	
	//length==> number of characters in a string object
	System.out.println(name.length());
	
	//Lower case and upper case
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
	
	//.concat ==> can work only with string, not int
	System.out.println(name.concat(lastName));
	
	//.isEmpty ==>returns false and true based if the data is empty or not
	System.out.println(name.isEmpty());
	
	//.Trim ==>trimes spaces before and after the name
	System.out.println(class1.trim());
	
	//.contains  ==> will return true or false and checks the entire word
	System.out.println(name.contains("y"));
	
	//.startswith  ==>returns true or false and just check the starting part
	System.out.println(name.startsWith("A"));
	
	//.endsWith  ==>returns true or false and just checks the end value
	System.out.println(lastName.endsWith("e"));
	
	//.equals ==>will return true or flase if the value is equal to the present value
	System.out.println(name.equals("ayb"));
	
	//.equalsIgnoreCase  ==>will ignoe the Cap or Small letter
	System.out.println(name.equalsIgnoreCase(lastName));
	
	//.charAt ==>prints the specific index
	System.out.println(name.charAt(1));
	int sum=0;
	for(int i=0;i<name.length();i++) {
		
		if(name.charAt(i)=='y') {
			System.out.println("y found");
			sum++;
		}
		
	}
	System.out.println(sum+ "y is found");
}
}
