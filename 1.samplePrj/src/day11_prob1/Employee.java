package day11_prob1;

public class Employee extends Person {

	private String dept;

	public Employee() {
		super();
		System.out.println("Employee() 수행.");
		
	}

	public Employee(String supername, int superage, String dept) {
		super(supername, superage);
		this.setDept(dept);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void print() {
		System.out.printf("Employee[이름 : %s, 나이 : %d, 부서 : %s]%n", super.getName(), super.getAge(), this.getDept());

	}

}
