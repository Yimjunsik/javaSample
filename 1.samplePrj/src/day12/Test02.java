package day12;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Dog();
		Animal f =	new Fish();
		// new Animal();	: �ȵ�.
			
		//Animal[] animals = new Animal[5];
		Animal[] animals = {a,f};
		for(int i=0;i<animals.length;i++){
			animals[i].breath();
		}
		
		
		
	}

}
