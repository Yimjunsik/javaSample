package day5;

import java.util.Arrays;
import java.util.Scanner;

public class P187 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");

		int[] num;
		num = new int[Integer.parseInt(scanner.nextLine())];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1; // 0보다는 크거나 같고, 1보다는 작은
														// double형 난수 발생

		}

		/*
		 * num[0]=10; num[1]=20; num[2]=30; num[3]=40; num[4]=50;
		 */

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		System.out.println();
		System.out.println(Arrays.toString(num)); // for문을 쓰지 않고 출력.

	}

}
