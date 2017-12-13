package day11_prob1;

public class Person {

	private String name;
	private int age;

	public Person() {
		super();
		System.out.println("Person() ผ๖วเ.");
	}

	public Person(String name, int age) {
		super();
		this.setName(name);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void print() {
		// TODO Auto-generated method stub
		
	}

}
