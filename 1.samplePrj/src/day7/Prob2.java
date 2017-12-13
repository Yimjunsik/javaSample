package day7;

public class Prob2 {

	public String leftPad(String str, int size, char padChar) {

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

		Prob2 p = new Prob2();
		System.out.println(p.leftPad("SDS", 9, '@')); // @@@@@@SDS
		System.out.println(p.leftPad("SDS", 9, '@').equals("@@@@@@SDS")); // @@@@@@SDS

		System.out.println(p.leftPad("sds", 2, '&'));
		System.out.println(p.leftPad("sds", 2, '&').equals("sds"));
	}

}
