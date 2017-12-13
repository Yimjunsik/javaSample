package day6;

public class P220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] num = new int[4][3];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		int[][] two = { { 1, 2, 3 }, { 5, 4, 3, 2, 1 }, { 9, 1 } };
		for (int i = 0; i < two.length; i++) {
			for (int j = 0; j < two[i].length; j++) {
				System.out.print(two[i][j] + " ");
			}
			System.out.println();
		}
	}

}
