package day8;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu1 = new Student();
		stu1.num="001";
		stu1.name="김길동";
		stu1.major="전자공학과";
		
		stu1.display();
		
		Student stu2 = new Student("002","박길동","기계공학과");
		stu2.display();
		
		
		
	}

}
