package day4;

import java.util.Scanner;

public class P155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char gender;
		String regNo;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("�ֹι�ȣ�� �Է��ϼ���. ex) 990909-2993314");
		regNo = scanner.nextLine();
		
		if(regNo.length()!=14){
		
			System.out.println("�ֹι�ȣ Error!!");
			return ;
			
		}else
				
		gender = regNo.charAt(7);
		System.out.println(regNo+" => "+gender);
		
		//if	,	switch
		
		switch(gender){
		case '1':
		case '3':
			System.out.println("����");
			break;
			
		case '2':
		case '4':
			System.out.println("����");
			break;
		
		default :
			System.out.println("�ֹι�ȣ ����...");
		}
		
	}

}
