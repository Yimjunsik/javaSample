package day2;

import java.util.Scanner;

public class P40 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = null;
		input = new Scanner(System.in);
		
		System.out.print("학생이름을 입력하세요. :");
		String name = input.nextLine();
		// .nextLine은 문자열 한줄만 읽어들이겠다. 즉, 엔터를 치는 순간까지 처리하겠다는 뜻.
		
		System.out.println("정수를 입력하세요. ex)90");
		//int score = Integer.parseInt(input.nextLine());
		int score = input.nextInt();
		input.nextLine(); //점수를 입력하고 나서 엔터를 소진시켜 주기 위해 굳이 입력.
		// input.nextLine의 값을 받아서...
		
		System.out.printf("이름 : %s , 점수 : %d",name,score);
		
		input.close(); // input을 끊어주겠다.
		input = null;
		
		// main함수에서는 초기화가 필요.
		
	}

}
