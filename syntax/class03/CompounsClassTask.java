package com.syntax.class03;

public class CompounsClassTask {
	public static void main(String[] args) {
		// Declare variable and increase by 500 using shorthand operator

		int a = 200;
		a += 500;
		System.out.println(a);

		// Declare variable and decrease by 67 using shorthand operator
		a -= 67;
		System.out.println(a);

		// Declare variable cakePiece=11 and divide cakePiece between 4 people using
		// shorthand operator

		int cakepiece = 11;
		cakepiece /= 4;
		System.out.println(cakepiece);

		// Declare variable cake=25 and divide cake between 7 people . Using shorthand
		// operator found out how many pieces of cake left after it was distributed
		// equally among 7 people
		int cake = 25;
		cake %= 7;
		System.out.println(cake);
//		cake %= 7;
//		System.out.println(cake);

	}
}
