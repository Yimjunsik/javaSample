package day11_prob1;

public class Student extends Person {

	private int id;

	public Student() {
		super();
		System.out.println("Student() ����.");
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
		System.out.printf("Student[�̸� : %s, ���� : %d, �й� : %d]%n",
					super.getName(),super.getAge(),this.getId());
	}
	
}
