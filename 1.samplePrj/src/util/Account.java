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
	
	// 입금
	public void deposit(int money) {

		this.money += money;
		System.out.println("입 금 :" + money + "잔 고 :" + this.money);
	}

	// 출금
	public void withdraw(int money) {
		
		if(money>this.money){
			System.out.println("에러. 잔액이 부족합니다~~~");
			return;
		}
		this.money -= money;
		System.out.println("출 금 :" + money + "잔 고 :" + this.money);

	}

	// 잔고 조회

	public void display() {
		System.out.println("통장번호 : " + num + ","+name+ "잔 고 :" + this.money);
	}
	
	//계좌이체
	
	public void transfer(Account from, Account to,int money){
		if(to == null){
			System.out.println("계좌정보를 확인하세요.");
			return;
		}
		
		if(from.money < money){
			System.out.println("잔고부족");
			System.out.println("계좌이체 종료");
			return;
			
		}
		
		System.out.println("출금 계좌 정보");
		from.display();		//출금통장 정보
		System.out.println("입금 계좌 정보");
		to.display();		//입금통장 정보
		
		System.out.println("----------계좌이체 수행 중------------");
		from.withdraw(money);
		to.deposit(money);
		System.out.println("------------계좌이체 완료--------------");
		
		
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
			System.out.println(amount + "원 인출\n");
		} else
			System.out.println("잔액 부족\n");
	}

	void check() {
		System.out.println("은 행 명 :" + bankName);
		System.out.println("계좌번호 :" + accountNo);
		System.out.println("이    름 :" + name);
		System.out.println("잔    액 :" + balance);

	}
*/
}
