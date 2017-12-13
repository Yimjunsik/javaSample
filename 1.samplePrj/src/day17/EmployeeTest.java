package day17;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee<String, String> e1 = new Employee<String, String>();
		e1.number = "2017";

		Employee<Integer, Integer> e2 = new Employee<Integer, Integer>();
		e2.number = 2015;

		Employee e3 = new Employee();
		e3.number = 2222;
		e3.number = "444";
	}

}

class Employee<T, P> {
	String name;
	T number;
	P age;

	public Employee() {
		super();
	}

	public Employee(String name, T number, P age) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getNumber() {
		return number;
	}

	public void setNumber(T number) {
		this.number = number;
	}

	public P getAge() {
		return age;
	}

	public void setAge(P age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", age=" + age + "]";
	}

}
