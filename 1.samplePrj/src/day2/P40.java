package day2;

import java.util.Scanner;

public class P40 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = null;
		input = new Scanner(System.in);
		
		System.out.print("�л��̸��� �Է��ϼ���. :");
		String name = input.nextLine();
		// .nextLine�� ���ڿ� ���ٸ� �о���̰ڴ�. ��, ���͸� ġ�� �������� ó���ϰڴٴ� ��.
		
		System.out.println("������ �Է��ϼ���. ex)90");
		//int score = Integer.parseInt(input.nextLine());
		int score = input.nextInt();
		input.nextLine(); //������ �Է��ϰ� ���� ���͸� �������� �ֱ� ���� ���� �Է�.
		// input.nextLine�� ���� �޾Ƽ�...
		
		System.out.printf("�̸� : %s , ���� : %d",name,score);
		
		input.close(); // input�� �����ְڴ�.
		input = null;
		
		// main�Լ������� �ʱ�ȭ�� �ʿ�.
		
	}

}
