package day3;

import java.util.Scanner;

public class P117 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������ �ϳ��� �Է��ϼ���.");
		//String data = input.nextLine();

		//char c = data.charAt(0);
		
		char c = input.nextLine().charAt(0);

		//String data = input.nextLine().charAt(0);

		//System.out.println("\n �Է� ������ : "+data);

		boolean result = 'A'<=c && c <='z' ;
		System.out.println(c+" : " +result);
		


}

}