package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {

		Student[] students = new Student[100];
		int count = 0;

		try (Scanner scanner = new Scanner(new File("studentdata.txt"))) {
			while (scanner.hasNextLine()) {
				String readLine = scanner.nextLine();
				String[] data = readLine.split("/");
				students[count] = new Student(data[0], Integer.parseInt(data[1]));
				count++;

			}
		} catch (Exception e) {

			if (e instanceof FileNotFoundException) {
				System.out.println("studentdata.txt 문서를 준비하세요.");
			} else {
				e.printStackTrace();
			}
		} finally {
		}
		System.out.println(Arrays.toString(students));

		// Arrays.sort(students,0,count);

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
			System.out.println("====================================");
		}
		System.out.println("*************Main end************");

	}

}

class Student implements Comparable<Student> {
	String name;
	int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		// return age - o.age;
		int result = name.compareTo(o.name);
		return (result != 0) ? result : age - o.age;
	}

}
