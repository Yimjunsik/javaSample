package day16.exception;

public class Test01 {

	public static void main(String[] args) {

		System.out.println("Main Start");
		String name = null;

		if (name != null && name.length() > 0) {

			System.out.println(name.charAt(0));
		}

		try {
			Class.forName("day16.exception.Sample");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace(); //이렇게 해줘도 되지만 우리가 직접 에러메시지를 써쭐 수 있따.
			System.out.println("클래스 이름 확인 필요");
		}
		
		System.out.println("Main End");

	}

}

class Sample{
	
}