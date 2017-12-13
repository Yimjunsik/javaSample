package day9;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] data = { new Book("Servlet", 500), new Book("�ڹ� ���α׷���", 900), new Book("SQL", 700) };
		BookMgr bm = new BookMgr(data);
		Scanner scanner = new Scanner(System.in);
		int cmd = 0;

		while (true) {

			System.out.println("========================");
			System.out.println("���� ���� ���α׷�");
			System.out.println("1. ���� ��� ����");
			System.out.println("2. ���� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� �˻�");
			System.out.println("5. ���α׷� ����");
			System.out.println("========================");
			System.out.print("���ϴ� ����� �Է��ϼ���.");

			
			cmd = Integer.parseInt(scanner.nextLine().trim());

			switch (cmd) {

			case 0:
				break;

			case 1:
				bm.printBookList();
				break;

			case 2:
				System.out.print("����� ���� ������ �Է��ϼ���.");
				String title = scanner.nextLine();

				System.out.print("����� ���� ������ �Է��ϼ���.");
				int price = scanner.nextInt();
				
				scanner.nextLine(); // enter ������ ���� �����ֱ� ���ؼ� ���� ��?
				
				Book data1 = new Book(title, price);
				bm.addBook(data1);
				// bm.printBookList();
				System.out.println("��ϵ� ���������� ������ �����ϴ�.");
				bm.searchBookList(title);
				break;

			case 3:
				System.out.println("�����۾� ����.");
				System.out.println("������ ���� ������ �Է��ϼ���.");
				title = scanner.nextLine();
				bm.delete(title);
				break;

			case 4:
				System.out.println("���� �˻� ����� �����մϴ�.");
				System.out.println("�˻��� ���� ������ �Է��ϼ���");
				title = scanner.nextLine();
				bm.searchBookList(title);
				break;

			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0); // ���α׷� ����
				break;

			default:
				System.out.println("�ٽ� �������ּ���.");
				break;
			}
		}
	}

}
