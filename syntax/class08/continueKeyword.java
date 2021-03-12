package com.syntax.class08;

public class continueKeyword {
public static void main(String[] args) {
	
	for(int i=1; i<=10; i++) {
		System.out.println("hello");
		if(i==3) {
			continue;    // when we have continue, and the condition is true, continue will just dont print the code after continue
			
		}
		System.out.println("I am inside the loop");
	}
		System.out.println("------------------------------------");
		
		/*
		 * print number from 1-10  except 5 , 6
		 */
		for (int i=1; i<=10; i++) {
			if(i==5 || i==6) {
				continue;
			}
			System.out.println(i+" ");
		}
System.out.println("------------------------------------");
		
		/*
		 * print number from 1-30  except those that are devisable by 4
		 */
for(int i=1; i<=40; i++) {
	if(i%4==0) {
		continue;
	}
	System.out.println(i+" ");
}

	}
}

