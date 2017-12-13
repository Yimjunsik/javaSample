package day7;

public class StudentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.name = "È«±æµ¿";
		s1.score = new int[] { 88, 99, 50 };

		
		
		// Student[] s = new Student[5];
		Student[] s = { new Student(), 
						new Student(), 
						new Student(), 
						new Student(), 
						new Student() 
						};
	
		
			s[4].name="ÃÖ¾¾";
			s[4].score = new int[]{99,99,99};

	
			for(int i=0; i<s.length;i++){
				s[i].process();
				s[i].display();
			}
	}

}
