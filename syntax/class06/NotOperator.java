package com.syntax.class06;

public class NotOperator {
	public static void main(String[] args) {
		// ! operator is always placed before the condition

		boolean rain = false;
		if (!rain) {
			System.out.println("I will go to park!");
		}

		boolean boo = !true;
		System.out.println(boo);// false
		System.out.println("==================");
		boolean boo1 = !false;
		System.out.println(boo1);// true

		boolean traffic = false;

		if (!traffic) {
			System.out.println("I will come on time");
		}
		System.out.println("==================");
		String day = "Monday";

		if (!day.equals("Friday")) {
			System.out.println("today is not friday");
		}
		System.out.println("==================");

		boolean homework = false;
		if (!homework) {
			System.out.println("no homework, I will be happy");
		}
	}
}
