package day11_prob1;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu = new Student("홍길동",20,200201);
		Teacher teacher = new Teacher("이순신",30,"JAVA");
		Employee emp = new Employee("유관순",40,"교무과");
		
		stu.print();
		teacher.print();
		emp.print();
		
	}

}
