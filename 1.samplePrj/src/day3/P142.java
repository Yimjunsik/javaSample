package day3;

import java.util.Scanner;

public class P142 {

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
		System.out.println("�������� ���ó��...");
		if(90<=jumsu){
			grade = 'A';
			
		}else if(jumsu>=80){
			grade = 'B';
		
		}else if(jumsu>=70){
			grade = 'C';
		
		}else if(jumsu>=60){
			grade = 'D';
		
		}else if(jumsu<60){
			grade = 'F';
		}
				
		System.out.println(jumsu+" �� ����� "+grade);
	}

}
