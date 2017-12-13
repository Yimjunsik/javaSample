package Book_vr02;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookMgr {
	private List<Book> bookList = new ArrayList<Book>();

	public BookMgr() throws Exception {
		String fileName = "c:/file/sample1.txt";
		try (Scanner s = new Scanner(new File(fileName))) {
			while (s.hasNextLine()) {
				String readLine = s.nextLine();
				String[] data = readLine.split("/");
				bookList.add(new Book(data[0], Integer.parseInt(data[1].trim())));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

		}
	}

	public BookMgr(Book[] data){}

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

	// �˻� ����߰�
	public void searchBookList(String title) {
		int c = 0;

		for (Book data : bookList) {
			if (data.getTitle().equals(title)) { // i��° book����Ʈ����
				data.display();
				c++;
			}
			if (c == 0) { // �˻��� �����Ͱ� ���ٴ� ��.
				System.out.println("��û�� ������ �����ϴ�.");
			}
		}
	}

	// ���� ��� �߰�
	// .....

	public void delete(String title) {

		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			if (book.getTitle().equals(title)) {
				System.out.println("���� ���� ���� :" + book);
				it.remove();

			}

		}

	}

	public void printTotalPrice() {
		int total = 0;
		for (int i = 0; i < bookList.size(); i++) {
			total += bookList.get(i).getPrice();
		}
		System.out.println("��ü å ������ �� : " + total);
	}

}
