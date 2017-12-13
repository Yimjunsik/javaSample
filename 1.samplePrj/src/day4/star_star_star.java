package day4;

public class star_star_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ***
		// ***
		// ***

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {

				System.out.print("*");
			}
			System.out.println();

		}

		System.out.println("---------------------------------");

		// *
		// **
		// ***

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
