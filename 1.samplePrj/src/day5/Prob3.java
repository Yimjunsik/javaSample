package day5;

import java.util.Arrays;

public class Prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";

		// 프로그램을 구현부 시작.
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다.

		// 프로그램 구현부 끝.

		for (int i = 0; i < sourceString.length(); i++) {
			char c = sourceString.charAt(i);

			if (c == 'x' || c == 'y' || c == 'z') {
				encodedString += (char) (c - 23);
			} else if (c == ' ') {
				encodedString += c;

			} else {
				encodedString += (char) (c + 3);
			}

		}

		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);

		System.out.println("====================================");
		String msg = "hello Java";
		char[] s = msg.toCharArray();
		char[] t = new char[s.length];
		for (int i = 0; i < s.length; i++) {

			if (s[i] >= 'A' && s[i] <= 'Z') {
				t[i] = (char) (s[i] + 32);
			} else if (s[i] == ' ') {
				t[i] = s[i];

			} else {
				t[i] = (char) (s[i] - 32);
			}

		}
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(t));
		
		String name = new String("홍길동");
		String msg2 = new String(t);
		
		System.out.println(msg);
		System.out.println(msg2);
		

	}

}
