package day10;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a1 = new Animal();
		a1.breath();
		System.out.println(a1.kind);
		System.out.println("------------------------------------");
		
		Dog d = new Dog();
		d.display();
		d.breath();
		d.bike();
		System.out.println(d.name);
		System.out.println(d.kind);	//강아지 종류
		System.out.println(((Animal)d).kind); //동물의 종류
		System.out.println("-------------------------------------");
		
		//is A 관계
		Animal e = new Dog();
		e.breath();
		((Dog)e).bike();
		System.out.println(e.kind);
		
		
		
	}

}
