package com.syntax.class15;

public class StringClassMore {
public static void main(String[] args) {
	
	
	String name="mina is firstname";
	
	//.indexOf  ==>will give us the index number of specific character
	System.out.println(name.indexOf('a'));//3
	
	//.subString  ==>will give u an input after the specific index till the end
	System.out.println(name.substring(4));
	
	//but if we specify initial index and end index it will just print the mentioned indexes
	System.out.println(name .substring(5,7));
	
}
}
