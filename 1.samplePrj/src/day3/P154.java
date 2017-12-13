package day3;

import java.util.Scanner;

public class P154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//키보드를 통해서 점수를 입력받고,
		//그 점수가 유효하다면 등급처리
		
		int jumsu;
		char grade = ' ';
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요. ex> 100");
		jumsu = Integer.parseInt(scanner.nextLine());
		
		if(!(0<=jumsu && jumsu<=100)){
			
			System.out.println("jumsu가 유효하지 않아 종료 됩니다...");
			return;
			
		} 
		
		//등급처리
		System.out.println("이제부터 switch구문 등급처리...");
		

		switch(jumsu/10){
		
		case 10:
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		case 6:
			grade='D';
			break;
		default:
			grade='F';
		
		}
		System.out.println(jumsu+" 의 등급은 "+grade);

	}

}
