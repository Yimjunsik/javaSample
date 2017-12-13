package day13_product;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer buyer = new Buyer();
		buyer.buy(new Computer());
		buyer.buy(new TV());
		buyer.buy(new VCR());
		buyer.buy(new HP());
		buyer.buy(new Audio());
		
		
	}

}

class Product {
	int price;
	int point;

}

class TV extends Product {}
class Computer extends Product {}
class VCR extends Product {}
class HP extends Product{}
class Audio extends Product {}

	


class Buyer {
	int money;
	int point;
	

	void buy(Product t) {
		money -= t.price;
		point += t.point;
		
	}
	void buy(TV t) {
		money -= t.price;
		point += t.point;

	}
	void buy(Computer t) {
		money -= t.price;
		point += t.point;
		
	}
	

}