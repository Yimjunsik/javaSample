package day5;

public class Prob1 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";

		// ���α׷��� ������ ����.
		// ���� : ���� 'a'�� �������� 97�̸�, 'z'�� 122�Դϴ�.

		// ���α׷� ������ ��.

		// ��ȣȭ�� ���ڿ� : everyday we have is one more than we deserve
		// ��ȣȭ�� ���ڿ� : hyhubgdb zh kdyh lv rqh pruh wkdq zh ghvhuyh

		for (int i = 0; i < sourceString.length(); i++) {

			if (sourceString.charAt(i) < 'x' && sourceString.charAt(i) >= 'a') {

				encodedString += (char) (sourceString.charAt(i) + 3);

			} else if (sourceString.charAt(i) == ' ') {

				encodedString += sourceString.charAt(i);
			} else {
				encodedString += (char) (sourceString.charAt(i) - 23);
			}

		}

		System.out.println("��ȣȭ�� ���ڿ� : " + sourceString);
		System.out.println("��ȣȭ�� ���ڿ� : " + encodedString);

	}
}