package day7;

public class Prob3 {

	public static String leftPad(String str, int size, char padChar) { //메소드 선언.

		String result = "";

		if (str.length() > size) {
			return str;
		}
		for (int i = 0; i < size - str.length(); i++) {
			result += padChar;
		}
		return result + str;
	}

	public static void main(String[] args) {
		String s = Prob3.leftPad("SDS", 7, '!');	//메소드 호출
		System.out.println(s.equals("!!!!SDS"));
		System.out.println(s);
	}
	
}
