package Book_vr03;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookMgr {
	private List<Book> bookList = new ArrayList<Book>();

	FileBook file = new FileBook();
	String fileName = "c:/file/book.data";

	public BookMgr() throws Exception {

		bookList = (List<Book>) file.read(fileName);

		if (bookList == null || bookList.size() == 0) {

			String fileName = "c:/file/sample1.txt";
			Scanner s = new Scanner(new File(fileName));

			while (s.hasNextLine()) {
				String readLine = s.nextLine();
				String[] data = readLine.split("/");
				bookList.add(new Book(data[0], Integer.parseInt(data[1].trim())));
			}
		}
		
		Thread job = new AutoSave();
		job.start();

	}

	public void filesave() {

		file.save(bookList, fileName);

	}

	public BookMgr(Book[] data) {
	
		
	
	}

	public void addBook(Book data) {
		bookList.add(data);
	}

	public void printBookList() {
		for (int i = 0; i < bookList.size(); i++) {
			bookList.get(i).display();
		}
	}

	public void printTitleList() {
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i).getTitle());
		}
	}

	// 검색 기능추가
	public void searchBookList(String title) {
		int c = 0;

		for (Book data : bookList) {
			if (data.getTitle().equals(title)) { // i번째 book리스트에서
				data.display();
				c++;
			}
			if (c == 0) { // 검색된 데이터가 없다는 뜼.
				System.out.println("요청한 도서가 없습니다.");
			}
		}
	}

	// 삭제 기능 추가
	// .....

	public void delete(String title) {

		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			if (book.getTitle().equals(title)) {
				System.out.println("삭제 도서 정보 :" + book);
				it.remove();

			}

		}

	}

	public void printTotalPrice() {
		int total = 0;
		for (int i = 0; i < bookList.size(); i++) {
			total += bookList.get(i).getPrice();
		}
		System.out.println("전체 책 가격의 합 : " + total);
	}

	class AutoSave extends Thread {

		@Override
		public void run() {

			while (true) {
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				file.save(bookList, fileName);
				System.out.println("AutoSave...");
			}

		}

	}

}
