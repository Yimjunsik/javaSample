package day15.prob1;

public class DiceGame {

	public static void main(String[] args) {

		DiceGame game = new DiceGame();

		int result1;
		try {
			result1 = game.countSameEye(10);
			System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}

		int result2;
		try {
			result2 = game.countSameEye(-10);
			System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}finally {	// finally 블럭은 예외가 발생하거나 발생하지 않거나 무조건 실행되는 블럭.
			
		}

	}

	int countSameEye(int n) throws Exception {
		if (n < 0){
			throw new Exception("최소 1번 이상은 던져야 함.");
		// 구현
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
