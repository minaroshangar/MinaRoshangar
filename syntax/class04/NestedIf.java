package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean isFriday=true;
		int day=3;
		
		if(isFriday) {
			System.out.println("I will watch movie");
			if(day==3) {
				System.out.println("I will watch action movie");
			}else {
				System.out.println("I will watch cartoon");
			}
		}else {
			System.out.println("I will study java");
		}
	}

}
