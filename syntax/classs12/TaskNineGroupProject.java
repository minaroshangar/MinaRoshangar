package com.syntax.classs12;

public class TaskNineGroupProject {
public static void main(String[] args) {
	int[] numbers ={ 100, 50, 75, 1000,55,67,1005 };
	int largest=0;
	int secondLargest=0;

	for(int i=0;i<numbers.length;i++) {
		
			if(numbers[i]>largest) {
				secondLargest=largest;
				largest=numbers[i];
			} else if(numbers[i]> secondLargest && numbers[i]!=largest) {
				secondLargest=numbers[i];
			}
	}
	
System.out.println("largest number is "+largest);			
System.out.println("2nd largest num is "+secondLargest);
		
	}}