package day8;

public class Calc {

	/*
	 * public static int add() { return 0; }
	 * 
	 * public static int add(int a, int b) {
	 * 
	 * return a + b;
	 * 
	 * }
	 */
	
	
	
	/**
	 * 
	 * @param a ���ϰ��� �ϴ� ������
	 * @return �հ谡 ���ϵȴ�.
	 */
	
	public static int add(int... a) {

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		return sum;

	}

	public static double add(double a, double b) {
		return a + b;
	}

}
