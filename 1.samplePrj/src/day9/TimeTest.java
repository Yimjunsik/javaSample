package day9;

import util.Time;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time t1 = new Time();

		Time t2 = new Time(15, 7, 22);

		// System.out.println(t2.hour()); // X
		t2.setHour(13);
		System.out.println(t2.getHour() + "Ω√");

		
		t2.setMinute(-77);
		t2.setSecond(-77);
		System.out.println(t2.getSecond() + "√ ");
	
		

	}

}
