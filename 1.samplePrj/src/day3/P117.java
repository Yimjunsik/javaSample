package day3;

import java.util.Scanner;

public class P117 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("영문자 하나를 입력하세요.");
		//String data = input.nextLine();

		//char c = data.charAt(0);
		
		char c = input.nextLine().charAt(0);

		//String data = input.nextLine().charAt(0);

		//System.out.println("\n 입력 데이터 : "+data);

		boolean result = 'A'<=c && c <='z' ;
		System.out.println(c+" : " +result);
		


}

}