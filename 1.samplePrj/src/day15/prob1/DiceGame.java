package day15.prob1;

public class DiceGame {

	public static void main(String[] args) {

		DiceGame game = new DiceGame();

		int result1;
		try {
			result1 = game.countSameEye(10);
			System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result1);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}

		int result2;
		try {
			result2 = game.countSameEye(-10);
			System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result2);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}finally {	// finally ���� ���ܰ� �߻��ϰų� �߻����� �ʰų� ������ ����Ǵ� ��.
			
		}

	}

	int countSameEye(int n) throws Exception {
		if (n < 0){
			throw new Exception("�ּ� 1�� �̻��� ������ ��.");
		// ����
		}
		Dice a = new Dice(8);
		Dice b = new Dice(8);
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (a.play() == b.play())
				count++;
		}
		return count;

	}
}
