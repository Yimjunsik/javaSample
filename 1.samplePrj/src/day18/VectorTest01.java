package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {

		Student[] s = new Student[100];
		s[0] = new Student();

		List<Student> list = new Vector<Student>();
		// µî·Ï

		list.add(new Student("È«±æµ¿", 90, 99));
		list.add(new Student("±è¾¾", 100, 90));
		list.add(new Student("°í¾¾", 100, 90));
		list.add(new Student("¹Ú¾¾", 100, 90));
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.remove(list.get(2));
		System.out.println(list);

		int delindex = -1;
		for (int i = 0; i < list.size(); i++) {
			Student data = list.get(i);
			data.avg();
			// list.remove(i);
			// System.out.println(list.size());
			if (data.name.equals("È«±æµ¿")) {
				delindex = i;
			}
		}
		// list.remove(delindex);
		System.out.println(list);
		System.out.println("=======================");

		for (Student data : list) {
			// System.out.println(data);
			data.avg();
			// list.remove(data);
		}
		System.out.println(list);

		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
			if (data.name.equals("È«±æµ¿"))

			it.remove();

		}

		// System.out.println(list);
		System.out.println(list.contains(new Student("°í¾¾", 90, 99)));

		// Student[] temp = (Student[]) list.toArray();
		Student[] temp2 = new Student[list.size()];
		list.toArray(temp2);

		Arrays.sort(temp2);

		// Collections.sort(list);

		for (Student data : temp2) {
			System.out.println(data);
			System.out.println("---------------");
		}

	}

}

class Student implements Comparable<Student> {
	String name;
	int ko;
	int math;
	double avg;

	public Student() {
		super();
	}

	public Student(String name, int ko, int math) {
		super();
		this.name = name;
		this.ko = ko;
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", avg=" + avg + "]";
	}

	public void avg() {
		avg = (ko + math) / 2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ko;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}

}