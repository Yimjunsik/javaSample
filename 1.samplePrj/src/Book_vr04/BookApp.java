package Book_vr04;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		
		Book[] data = {
				new Book("Servlet",500),
				new Book("�ڹ� ���α׷���",900),
				new Book("SQL",700)
				
		};
		
		BookMgr bm = null;
		try {
			bm = new BookMgr();
		} 
		catch (FileNotFoundException e) {
			bm = new BookMgr(data);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Scanner scanner = new Scanner(System.in);
		
		int cmd = 0;

		
		while (true) {

			System.out.println("========================");
			System.out.println("���� ���� ���α׷�");
			System.out.println("1. ���� ��� ����");
			System.out.println("2. ���� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� �˻�");
			System.out.println("5. ����");
			
			System.out.println("6. ���α׷� ����");
			System.out.println("========================");
			System.out.print("���ϴ� ����� �Է��ϼ���.");

			try {
				cmd = Integer.parseInt(scanner.nextLine().trim());

			} catch (Exception e) {
				System.out.println("���ڷθ� �Է����ּ���.");
			} finally {
			}

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

			case 5 :
				System.out.println("��������� ���Ͽ� �����մϴ�.");
				bm.filesave();
				break;
				
			case 6:
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
