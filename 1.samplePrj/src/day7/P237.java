package day7;

public class P237 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] score;
		String name;
		Employee emp1 = new Employee(); // ȫ�浿�̶�� ����� ����
		emp1.display();
		emp1.num = "001";
		emp1.name = "ȫ�浿";
		emp1.dept = "��ȹ��";

		Employee emp2 = new Employee(); // ��浿�̶�� ����� ����
		emp2.display();
		emp2.num = "002";
		emp2.name = "��浿";
		emp2.dept = "���ߺ�";

		emp1.display();
		emp2.display();

	}

}
