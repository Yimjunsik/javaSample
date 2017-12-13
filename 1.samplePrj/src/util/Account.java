package util;

public class Account {

	String name;
	String num;
	int money;
	
	public Account(){
		
	}
	public Account(String name,String num,int money){
	this.name = name;
	this.num = num;
	this.money = money;
	}
	
	// �Ա�
	public void deposit(int money) {

		this.money += money;
		System.out.println("�� �� :" + money + "�� �� :" + this.money);
	}

	// ���
	public void withdraw(int money) {
		
		if(money>this.money){
			System.out.println("����. �ܾ��� �����մϴ�~~~");
			return;
		}
		this.money -= money;
		System.out.println("�� �� :" + money + "�� �� :" + this.money);

	}

	// �ܰ� ��ȸ

	public void display() {
		System.out.println("�����ȣ : " + num + ","+name+ "�� �� :" + this.money);
	}
	
	//������ü
	
	public void transfer(Account from, Account to,int money){
		if(to == null){
			System.out.println("���������� Ȯ���ϼ���.");
			return;
		}
		
		if(from.money < money){
			System.out.println("�ܰ����");
			System.out.println("������ü ����");
			return;
			
		}
		
		System.out.println("��� ���� ����");
		from.display();		//������� ����
		System.out.println("�Ա� ���� ����");
		to.display();		//�Ա����� ����
		
		System.out.println("----------������ü ���� ��------------");
		from.withdraw(money);
		to.deposit(money);
		System.out.println("------------������ü �Ϸ�--------------");
		
		
	}
	
	
	
	/*
	String accountNo;
	String name;
	int balance;
	static String bankName;

	
	
	void deposit(int amount) {
		balance += amount;

	}

	void withdraw(int amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println(amount + "�� ����\n");
		} else
			System.out.println("�ܾ� ����\n");
	}

	void check() {
		System.out.println("�� �� �� :" + bankName);
		System.out.println("���¹�ȣ :" + accountNo);
		System.out.println("��    �� :" + name);
		System.out.println("��    �� :" + balance);

	}
*/
}
