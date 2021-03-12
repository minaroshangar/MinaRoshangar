package com.syntax.class11;

public class TwoDArrayTask {
	public static void main(String[] args) {
		String[][] array = { { "Mr", "Mrs", "Ms", "Miss" }, { "Smith", "Obama", "Jackson", "Jordan" } };
		System.out.println(array[0][1] + " " + array[1][0]);// Mrs Smith
		System.out.println(array[0][0] + " " + array[1][1]);// Mr Obama
		System.out.println(array[0][2] + " " + array[1][2]);// Ms Jackson
		System.out.println(array[0][3] + " " + array[1][3]);// Miss Jordan

		System.out.println("===========Second Task=============");

		String[][] array1 = { { "Mina", "Murasa", "Madina", "Muzho" }, { "A", "B", "C", "D" } };
		System.out.println(array1[0][1] + " " + array1[1][0]);// MINA A
		System.out.println(array1[0][0] + " " + array1[1][1]);// MURASA B
		System.out.println(array1[0][2] + " " + array1[1][2]);// MADINA C
		System.out.println(array1[0][3] + " " + array1[1][3]);// MUZHO D

		// length for entire array
		System.out.println(array1.length);

		// length from first array
		System.out.println(array1[0].length);

		// retrieving values fromm all columns and rows
		// iterates over single row
		for (int i = 0; i < array1.length; i++) {

			// iterates every column
			for (int c = 0; c < array1[i].length; c++) {
				System.out.print(array[i][c] + " ");
			}
			System.out.println();
		}
	}
}
/*
 * Create a 2D array values: Mr, Mrs, Ms, Miss and Smith, Jordan, Jackson,
 * Obama. After storing values print the following: Mrs Smith, Mr Obama, Ms
 * Jackson, Miss Jordan.
 */
//Create a 2D array that first row will contain 4 names and second row will contain grades.
//Then your program should print name of the students that has A and B grade