package day9;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] data = { new Book("Servlet", 500), new Book("자바 프로그래밍", 900), new Book("SQL", 700) };
		BookMgr bm = new BookMgr(data);
		Scanner scanner = new Scanner(System.in);
		int cmd = 0;

		while (true) {

			System.out.println("========================");
			System.out.println("도서 정보 프로그램");
			System.out.println("1. 도서 목록 보기");
			System.out.println("2. 도서 등록");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색");
			System.out.println("5. 프로그램 종료");
			System.out.println("========================");
			System.out.print("원하는 명령을 입력하세요.");

			
			cmd = Integer.parseInt(scanner.nextLine().trim());

			switch (cmd) {

			case 0:
				break;

			case 1:
				bm.printBookList();
				break;

			case 2:
				System.out.print("등록할 도서 제목을 입력하세요.");
				String title = scanner.nextLine();

				System.out.print("등록할 도서 가격을 입력하세요.");
				int price = scanner.nextInt();
				
				scanner.nextLine(); // enter 라인을 소진 시켜주기 위해서 들어가야 함?
				
				Book data1 = new Book(title, price);
				bm.addBook(data1);
				// bm.printBookList();
				System.out.println("등록된 도서정보는 다음과 같습니다.");
				bm.searchBookList(title);
				break;

			case 3:
				System.out.println("삭제작업 수행.");
				System.out.println("삭제할 도서 제목을 입력하세요.");
				title = scanner.nextLine();
				bm.delete(title);
				break;

			case 4:
				System.out.println("도서 검색 기능을 수행합니다.");
				System.out.println("검색할 도서 제목을 입력하세요");
				title = scanner.nextLine();
				bm.searchBookList(title);
				break;

			case 5:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); // 프로그램 종료
				break;

			default:
				System.out.println("다시 선택해주세요.");
				break;
			}
		}
	}

}
