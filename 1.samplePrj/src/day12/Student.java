package day12;

import java.util.Date;

public class Student extends Object {

	private String name;
	private int age;
	private int id;

	public Student() {
		super();
	}

	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {

		// return "Student["+name+","+age+","+id+"]";
		StringBuilder sb = new StringBuilder();
		sb.append("Student[");
		sb.append(name);
		sb.append(",");
		sb.append(age);
		sb.append(",");
		sb.append(id);
		sb.append("]");
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		// 강사님이 하신 것.
		if (!(obj instanceof Student))
			return false;
		Student data = (Student) obj;

		if (id == data.id && age == data.age && name.equals(data)) {
			return true;
		}
		return false;

		// 내가 오버라이드 한것.
		// return obj instanceof Student && this.getName() == ((Student)
		// obj).getName()
		// && this.getAge() == ((Student) obj).getAge() && this.getId() ==
		// ((Student) obj).getId();

	}
}
