package Book_vr04;

import java.io.Serializable;

public class Book implements Comparable<Book>, Serializable {

	
	
	private String title;
	private int price;

	public Book() {	}
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0)
			return;
		// this.price = price;
	}

	public void display() {
		System.out.printf("Book[%s : %d ¿ø]%n", title, price);
	}

	@Override
	public String toString() {
		
		return "Book["+title+","+price+"]";
	}

	@Override
	public int compareTo(Book o) {

		return price-o.price;
	}
}
