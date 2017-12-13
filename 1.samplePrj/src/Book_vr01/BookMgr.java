package Book_vr01;

public class BookMgr {

	private int count = 0; // �������� �ý��ۿ��� �����ϰ� �ִ� å�� ����
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

	// �˻� ����߰�
	public void searchBookList(String title) {
		int c = 0;

		for (int i = 0; i < count; i++) {
			if (bookList[i].getTitle().equals(title)) { // i��° book����Ʈ����
				bookList[i].display();
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
		for (int i = 0; i < count; i++) {
			if (bookList[i].getTitle().equals(title)) {

				System.out.println("���� �մϴ�. :");
				bookList[i].display(); //������ ���� ���.

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
		System.out.println("��ü å ������ �� : " + total);
	}

}
