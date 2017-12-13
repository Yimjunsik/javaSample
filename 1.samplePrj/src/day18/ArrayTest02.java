package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayTest02 {

	public static void main(String[] args) {

		Employee[] emp = new Employee[100];
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("007", "홍길동", "기술부"));
		list.add(new Employee("003", "학길박", "기술부"));
		list.add(new Employee("004", "다길동", "기술부"));
		list.add(new Employee("005", "라길동", "기술부"));
		list.add(new Employee("006", "바길동", "기술부"));
		list.add(new Employee("007", "마길동", "기술부"));
		
		// 정렬 후 출력
		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("====================================");
		
		// 삭제 작업
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee data = it.next();
			if (data.getNum().equals("006")) {
				System.out.println(data + " : 사원 정보 제거합니다.");
				it.remove();
			}

		}
		System.out.println("===============사원 목록===============");
		for (Employee data : list) {
			System.out.println(data);

		}
		System.out.println("======================================");

		// 검색

		System.out.println("이름이 홍씨인 사원 목록 검색");
		for (Employee data : list) {
			if (data.getName().charAt(0) == '홍') {
				System.out.println(data);
			}
		}
		System.out.println("========================================");
		Employee[] data = new Employee[list.size()];
		System.out.println(Arrays.toString(data));
	}

}

class Employee extends Object implements Comparable<Employee> {

	String num; // 사번
	String name;
	String dept;

	public Employee() {
	}

	public Employee(String num, String name, String dept) {
		this.num = num;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
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
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
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

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + ", dept=" + dept + "]";
	}

	@Override
	public int compareTo(Employee o) {

		return num.compareTo(o.num);
	}

}