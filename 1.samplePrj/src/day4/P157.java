package day4;

public class P157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		System.out.println("영어 소문자 코드값 확인.");
		
		char c = 'a', d = 'A';
				
		for (int count=97;count<=122;count++){
		
			System.out.println(c+ " = " +(int)(c++) + "  " + d+ " = " + (int)d++);
		
		}
		
		System.out.println(c);
		
	}

}
