package day15.exception;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("START");

		try {
			System.out.println("try{");

			System.out.println(args[0].length());
			int num = Integer.parseInt(args[0]);
			System.out.println(10/num);
			System.out.println("}");
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("접근할 수 없는 배열 인덱스 사용...");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 입력해 주세요.");
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("~~~~~~~~");
		}
		finally {
			System.out.println("자원 반납은 여기에...");
		}
		System.out.println("END");

	}

}
