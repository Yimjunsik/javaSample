package day14_lab1;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LTV user = new LTV();
		user.on();
		user.off();
		
		STV user1 = new STV();
		user1.PowerOn();
		user1.PowerOff();

		// user = new STV();	//이렇게는 안된다.
		
		
	}

}

class LTV {
	void on() {
		System.out.println("LTV on");
	}

	void off() {
		System.out.println("LTV fff");
	}

}

class STV {
	void PowerOn() {
		System.out.println("STV PowerOn");
	}

	void PowerOff() {
		System.out.println("STV PowerOff");
	}
}