package day9;

import util.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a1 = new Account("ȫ�浿","001",3000);
		//a1.deposit(5000);
		//a1.withdraw(2000);
		Account a2 = new Account("��浿","002",1000);
		a2 = null;
		a1.transfer(a1, a2, 1000);
		
		
	}

}
