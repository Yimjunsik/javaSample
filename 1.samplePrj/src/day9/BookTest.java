package day9;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] data = { new Book("ASP", 800), new Book("PHP", 8800) };
		BookMgr bm = new BookMgr();

		bm.printBookList();

		System.out.println("======================================");
		bm.addBook(new Book("java programminjg", 1000));
		bm.addBook(new Book("java JSP", 2000));
		bm.addBook(new Book("Spring", 4000));

		bm.printBookList();
		bm.printTitleList();

	}

}
