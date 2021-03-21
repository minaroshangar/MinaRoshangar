package com.syntax.class17;

public class VariableTask1 {
String empID;
double salary;
String CEO="Sumair";


public static void main(String[] args) {
	VariableTask employee=new VariableTask();
	employee.empID="123";
	employee.salary=15000;
	System.out.println(employee.empID+" salar"+employee.salary+"CEO"+employee.CEO);
	
	VariableTask employee1=new VariableTask();
	employee1.empID="1234";
	employee1.salary=1000;
	System.out.println(employee1.empID+" salar"+employee.salary+"CEO"+employee.CEO);
}
}
/*
 * Create a Class called Employee:
Create three  variables  empID , salary and set the CEO to "Sumair" 
Create two objects of the class Employee 
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
 */

