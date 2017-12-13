package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest2 {

	public static void main(String[] args) {

		Employee emp1 = new Employee("±è", "001");
		Employee emp2 = emp1;

		Set<Employee> set = new TreeSet<>();
		//Set<Employee> set = new HashSet<>();
		set.add(emp1);
		set.add(emp2);

		System.out.println(set);

		set.add(new Employee("°í", "002"));
		set.add(new Employee("°­", "009"));
		set.add(new Employee("È«", "005"));
		set.add(new Employee("¹Ú", "011"));
		set.add(new Employee("°í", "022"));
		System.out.println(set);

		for (Employee data : set) {

			System.out.println(data);
			System.out.println("---------------------------");
		}
		System.out.println("**************************");
		Iterator<Employee> it =set.iterator();
		while (it.hasNext()) {
			Employee employee = (Employee) it.next();
			System.out.println(employee);
			
		}

	}

}

class Employee implements Comparable<Employee> {

	String name;
	String num;

	public Employee() {
	}

	public Employee(String name, String num) {
		super();
		this.name = name;
		this.num = num;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", num=" + num + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee o) {
		return num.compareTo(o.num);
	}

}