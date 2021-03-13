package com.syntax.class12;

public class GroupProjectTaskFour {
	public static void main(String[] args) {

		String[][] Countries = { { "USA", "Canada", "Mexico" },
				{ "Brazil", "Colombia", "Peru", "Bolivia", "Argentina" },
				{ "France", "Spain", "Italy", "UK", "Germany", "Sweden" }, { "UEA", "Sudi", "Palestine", "Syria" }, };
		for (String[] country : Countries) {
			for (String c : country) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------");
		for (int i = 0; i < Countries.length; i++) {
			for (int j = 0; j < Countries[i].length; j++) {
				System.out.print(Countries[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		int sum = Countries[0].length + Countries[1].length + Countries[2].length + Countries[3].length
				+ Countries[4].length;
		System.out.println("The Total of the counties stored is: " + sum);

	}
}
