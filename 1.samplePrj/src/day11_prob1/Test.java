package day11_prob1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object s = new Student("길동", 20, 1);

		// ((Student)s).print(); //Object 밑에 String가 있는데 무작정 다운캐스팅은 위험하다.
		if (s instanceof Student)
			((Student) s).print(); // 무조건 캐스팅하다 보면 문제가 발생할 것이기 떄문에 체크를 먼저 한다.
		s = "Hello";

		if (s instanceof Student)
			((Student) s).print(); // 다운캐스팅 하기 전에 타입체크를 하는 것이 좋다.
		// instanceof는

		String name = "OOO";
		Student s1 = new Student("길동", 20, 1);
		Teacher t1 = new Teacher("홍샘", 40, "java");
		Employee e1 = new Employee("홍길동", 44, "교무실");

		Person[] p = { s1, t1, e1, new Student("고길동", 22, 2) }; // 배열은 동일한 데이터
																// 타입을 관리한다.
		// Person타입의 배열은
		// Student,Teacher,Employee 모두를 하나의 배열로 
		// 관리하겠다.

		System.out.println("==========================================");
		for (int i = 0; i < p.length; i++) {
			// ((Student)p[i]).print(); //이렇게 하면 문제가 있다.
			if (p[i] instanceof Student)
				((Student) p[i]).print();
			if (p[i] instanceof Employee)
				((Employee) p[i]).print();
			if (p[i] instanceof Teacher)
				((Teacher) p[i]).print();
		}
		System.out.println("==========================================");

		for (int i = 0; i < p.length; i++) {
			p[i].print();

		}
		System.out.println("========================================");
		Person pp = null;
		pp.print();
		System.out.println("-----------------------------------------");		
		
		Object[] obj = { name, s1, t1, e1 }; // 오브젝트의 배열은 주소를 다 모아서 관리할래.
		// Person[] p = {name,s1,t1,e1}; //name은 String타입이므로 에러가 발생. 오브젝트는 모두
		// 관리가능하지만
		// Person은 Student,Teacher,Employee의 것들만 관리가 가능.
		// 그래서 아래와 같이 처리해줘야 함.
		for(int i=0;i<obj.length;i++){
		if(obj[i] instanceof Person)
			((Person)obj[i]).print();
		}
			
		
	}

}
