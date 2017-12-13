package day2;

import java.util.Date;

public class Test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Date now = new Date();
		//해석 : java.util에 있는 Date 클래스를 메모리에 올리세요.
		
		System.out.println(now);
		System.out.println(now.getYear());
		//getYear에 줄이 쳐진 이유는 Decreate된 클래스를 의미.
		//캘린더라는 다른 새로운 클래스를 쓰라는 의미.
		
		java.sql.Date today = null;
		System.out.println(today);
		
		now = null;
		
		
		//콘솔창에 띄워진 실행시킨 결과는 메모리에 올라간 시각.
		
	}

}
