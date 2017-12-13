package day11_prob1;

public class Teacher extends Person {

	private String subject;

	public Teacher() {
		super();
		System.out.println("Teacher() 수행.");
	}

	public Teacher(String name, int age, String subject) {
		super(name, age);
		//super();
		//this.setName(name);
		//this.setAge(age);
		
		this.setSubject(subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print(){
		System.out.printf("Teacher[이름 : %s, 나이 : %d, 담당과목 : %s]%n",
				super.getName(),super.getAge(),this.getSubject());
	
	}

}
