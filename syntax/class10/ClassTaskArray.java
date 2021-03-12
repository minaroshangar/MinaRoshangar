package com.syntax.class10;

public class ClassTaskArray {
public static void main(String[] args) {
	
	//Create an array of names and store all names of your group. 
	//Then print your name from that array. (use 2 different ways of creating an array).
String [] names= {"Mina", "Murasa", "Noah"};	
System.out.println(names[0]+names.length);
System.out.println("============second task==============");
//Create an array of words: Java, Saturday, day, coding, is. 
//Print the following sentence using elements of array: “Saturday is Java coding Day”.
String [] words= {"Java", "Saturday", "day", "coding", "is"};
System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]+" and lenght of array is: "+words.length);
}
}
