package util;

public class Array {

	public static int[] sort(int[] a) {

		int[] data = new int[a.length];
		System.arraycopy(a, 0, data, 0, a.length);	//원본을 보존 하기 위해서. 아니면 보존 불가능.
		for (int i = 0; i < data.length - 1; i++) {

			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}

		return data;

		// 유용하게 사용 가능한 함수를 만들어 보세요..
		// 단 source data a는 보존이 되도록 만드세요

		// 배열 출력 기능 추가
	}

	/**
	 * 
	 * @param a
	 * @param descmode
	 *            :
	 * @return
	 */

	/*
	 * 
	 * public static int[] sort(int[] a,boolean descmode ) {
	 * 
	 * int[] data = a; for (int i = 0; i < data.length - 1; i++) {
	 * 
	 * for (int j = i + 1; j < data.length; j++) { if (data[i] > data[j]) { int
	 * temp = data[i]; data[i] = data[j]; data[j] = temp; } } }
	 * 
	 * return data;
	 * 
	 * }
	 */
}