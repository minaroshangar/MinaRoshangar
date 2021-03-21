package com.syntax.class17;

public class VarTask2 {
	String studentName;
	String studentID;
	static int numberOfStudents;

	public static void main(String[] args) {
		VarTask2 student1 = new VarTask2();
		student1.studentName = "mina";
		student1.studentID = "1234";
		student1.numberOfStudents++;
		System.out.println(student1.studentID + " name " + student1.studentName + " number of students "
				+ student1.numberOfStudents);

		VarTask2 student2 = new VarTask2();
		student2.studentName = "ayob";
		student2.studentID = "0034";
		student2.numberOfStudents++;
		System.out.println(student2.studentID + " name " + student2.studentName + " number of students "
				+ student2.numberOfStudents);
	}

}
/*
 * Create a Class called Students Create three variables studentName , studentID
 * and numberOfStudents Create three objects of the Students Class Set the value
 * for studentName , studentID and increment the numberOfStudents for each
 * object Print out total number of students
 */
