package day15.exception;

public class Test04 {

	public static void main(String[] args) {

		System.out.println("Start");
		Account a = new Account();
		try {
			a.setMoney(-900);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=========================");

		try {
			Account b = new Account("000", -500);
			System.out.println(b);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		System.out.println("End");

	}

}

class Account {
	String name;
	int money;

	public Account() {
		super();
	}

	public Account(String name, int money) throws Exception {

		this.name = name;
		setMoney(money);
		;
	}

	public void setMoney(int money) throws Exception {
		if (money < 0)
			throw new Exception("Money Error!");
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", money=" + money + "]";
	}

}