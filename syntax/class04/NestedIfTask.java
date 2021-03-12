package com.syntax.class04;

public class NestedIfTask {

	public static void main(String[] args) {
		
		/*
		 * chk assignment, based on score display a msg
		 */
		
		boolean completed=true;
		int score=90;
		
		if(completed) {
			System.out.println();
			if(score>90) {
				System.out.println("great job");
			}else if(score>80) {
				System.out.println("good job");
			}else if(score>70) {
				System.out.println("try more to do better");
			}else {
				System.out.println("study more");
			}
		}else {
			System.out.println("plz make sure to complete ur assignment");
		}
	}

}

