package com.syntax.class10;

public class ArrayClassTask {
public static void main(String[] args) {
	//creat an array of char and store grades into it.A, B, C, D
	//print grade B
	
	char[ ]grade=new char[6];
	grade[0]='A';
	grade[1]='B';
	grade[2]='C';
	grade[3]='D';
	grade[4]='E';
	grade[5]='F';
	System.out.println(grade[1]);
	int size=grade.length;
	System.out.println(size);
	System.out.println("===========anotherway================");
	
	char[] grades= {'A', 'B', 'C','D'};
	System.out.println(grades[1]+" "+grades.length);
//	int size1=grades.length;
//	System.out.println(size1);
}
}
