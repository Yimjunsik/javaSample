package day3;

public class P120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c = '0'; // 0 ~ 9
		
		boolean f1,f2;
		boolean result = (f1 = '0' <= c) && (f2 = c <= '9');
		System.out.println(result);
		
		boolean result1 = 48 <= c && c<=57;
		
		System.out.println('0' + " => " + (int)'0');
		System.out.println('9' + " => " + (int)'9');
		System.out.println(c + " Àº ¼ýÀÚ ? " + result);
		
		System.out.println(Integer.toBinaryString(11));
		System.out.println(Integer.toBinaryString(3));
		System.out.println( 11 & 3);
		
		
	}

}
