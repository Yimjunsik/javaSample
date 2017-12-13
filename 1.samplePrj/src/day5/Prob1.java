package day5;

public class Prob1 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";

		// 프로그램을 구현부 시작.
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다.

		// 프로그램 구현부 끝.

		// 암호화할 문자열 : everyday we have is one more than we deserve
		// 암호화된 문자열 : hyhubgdb zh kdyh lv rqh pruh wkdq zh ghvhuyh

		for (int i = 0; i < sourceString.length(); i++) {

			if (sourceString.charAt(i) < 'x' && sourceString.charAt(i) >= 'a') {

				encodedString += (char) (sourceString.charAt(i) + 3);

			} else if (sourceString.charAt(i) == ' ') {

				encodedString += sourceString.charAt(i);
			} else {
				encodedString += (char) (sourceString.charAt(i) - 23);
			}

		}

		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);

	}
}