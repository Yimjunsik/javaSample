package Book_vr01;

public class BookMgr {

	private int count = 0; // 도서관리 시스템에서 관리하고 있는 책의 개수
	private Book[] bookList = new Book[100];

	public BookMgr() {
	}

	public BookMgr(Book[] data) {
		System.arraycopy(data, 0, bookList, count, data.length);
		count = count + data.length;

	}

	public void addBook(Book data) {
		bookList[count] = data;
		count++;

	}

	public void printBookList() {
		for (int i = 0; i < count; i++) {
			bookList[i].display();

		}
	}

	public void printTitleList() {
		for (int i = 0; i < count; i++) {
			System.out.println(bookList[i].getTitle());

		}
	}

	// 검색 기능추가
	public void searchBookList(String title) {
		int c = 0;

		for (int i = 0; i < count; i++) {
			if (bookList[i].getTitle().equals(title)) { // i번째 book리스트에서
				bookList[i].display();
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
		for (int i = 0; i < count; i++) {
			if (bookList[i].getTitle().equals(title)) {

				System.out.println("삭제 합니다. :");
				bookList[i].display(); //삭제할 도서 출력.

				System.arraycopy(bookList, i + 1, bookList, i, count - i);
				
				count--;
				
				break;
			}
		}

	}

	public void printTotalPrice() {
		int total = 0;
		for (int i = 0; i < bookList.length; i++) {
			total += bookList[i].getPrice();
		}
		System.out.println("전체 책 가격의 합 : " + total);
	}

}
