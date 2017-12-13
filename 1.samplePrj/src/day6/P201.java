package day6;

import java.util.Arrays;

public class P201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length == 0) {
			System.out.println("�迭�� ����� ���� �Ķ���ͷ� �Է��� �ּ���.");
			return;
		}

		int[] num = new int[Integer.parseInt(args[0])];

		for (int i = 0; i < num.length; i++) {

			num[i] = (int) (Math.random() * 45) + 1;

			if (i == 0)
				continue;

			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}

			}

		}

		int[] target = new int[num.length];
		System.arraycopy(num, 0, target, 0, num.length);

		System.out.println(Arrays.toString(target));
		System.out.println(Arrays.toString(num));
		// �� 1 ~ 45 ������ ������ �̿��� �ʱ�ȭ.

		// ======================================================

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		System.out.println("=============================");
		System.out.println("���� �� :");
		System.out.println(Arrays.toString(num));

	}

}
