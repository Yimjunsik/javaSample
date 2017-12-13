package day11_prob1;

public class Student extends Person {

	private int id;

	public Student() {
		super();
		System.out.println("Student() 수행.");
	}

	public Student(String name, int age, int id){
		super(name, age);
		this.setId(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void print(){
		System.out.printf("Student[이름 : %s, 나이 : %d, 학번 : %d]%n",
					super.getName(),super.getAge(),this.getId());
	}
	
}
