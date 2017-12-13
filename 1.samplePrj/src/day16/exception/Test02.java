package day16.exception;

public class Test02 {

	public static void main(String[] args) {

		try{
		Account account = new Account("ȫ�浿", 100);
		account.setMoney(-500);
		System.out.println(account.toString());
		}catch(MoneyException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Main End");
	}

}

class Account {

	private String name;
	private int money;

	@Override
	public String toString() {
		return "Account [name=" + name + ", money=" + money + "]";
	}

	public Account() {
		super();
	}

	public Account(String name, int money) throws MoneyException {
		super();
		this.name = name;
		this.setMoney(money);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) throws MoneyException {
		if(money<0){
			throw new MoneyException("Money�� �����");
		}
		this.money = money;
	}

}


class MoneyException extends RuntimeException {
	MoneyException(){
		super("Money Error");	//����Ʈ ���� �޼���
	}
	MoneyException(String msg){
		super(msg);				//���� �ѱ� ���� �޼���
	}
	
	
}