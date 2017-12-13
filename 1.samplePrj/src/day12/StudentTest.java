package day12;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String name = new String("java Test~~~");
		String name2 = new String("java Test~~~");
		System.out.println(name);
		System.out.println(name.toString());

		
		java.util.Date date = new java.util.Date();
		java.util.Date date2 = new java.util.Date();
		System.out.println(date);
		System.out.println(date.toString());

		
		Student s = new Student("ȫ�浿", 22, 1);
		Student s2 = new Student("ȫ�浿", 22, 2);
		System.out.println(s.toString());

		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		
		
	}

}
