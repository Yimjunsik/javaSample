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
			//e.printStackTrace(); //�̷��� ���൵ ������ �츮�� ���� �����޽����� ���� �� �ֵ�.
			System.out.println("Ŭ���� �̸� Ȯ�� �ʿ�");
		}
		
		System.out.println("Main End");

	}

}

class Sample{
	
}