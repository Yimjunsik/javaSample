package day3;

import java.util.Scanner;

public class P154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ű���带 ���ؼ� ������ �Է¹ް�,
		//�� ������ ��ȿ�ϴٸ� ���ó��
		
		int jumsu;
		char grade = ' ';
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���. ex> 100");
		jumsu = Integer.parseInt(scanner.nextLine());
		
		if(!(0<=jumsu && jumsu<=100)){
			
			System.out.println("jumsu�� ��ȿ���� �ʾ� ���� �˴ϴ�...");
			return;
			
		} 
		
		//���ó��
		System.out.println("�������� switch���� ���ó��...");
		

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
		System.out.println(jumsu+" �� ����� "+grade);

	}

}
