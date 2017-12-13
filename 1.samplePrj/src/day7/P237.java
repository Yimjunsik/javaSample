package day7;

public class P237 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] score;
		String name;
		Employee emp1 = new Employee(); // 홍길동이라는 사원의 정보
		emp1.display();
		emp1.num = "001";
		emp1.name = "홍길동";
		emp1.dept = "기획부";

		Employee emp2 = new Employee(); // 김길동이라는 사원의 정보
		emp2.display();
		emp2.num = "002";
		emp2.name = "고길동";
		emp2.dept = "개발부";

		emp1.display();
		emp2.display();

	}

}
