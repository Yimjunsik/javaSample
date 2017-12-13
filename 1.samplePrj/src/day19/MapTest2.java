package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
	public static void main(String[] args) {

		Map<String, Student> map = new HashMap<>();
		
		
		
		Student[] s = {
		new Student("2017001", "김", 11, 11),
		new Student("2017002", "이", 22, 22),
		new Student("2017003", "박", 33, 33),
		new Student("2017004", "홍", 44, 44),
		new Student("2017004", "서", 44, 44),
		new Student("2017005", "최", 99, 99)
		};
		
		for(int i=0;i<s.length;i++){
			map.put(s[i].getNum(), s[i]);
	
		}
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String num = (String) it.next();
			map.get(num);
			System.out.println(map.get(num));
		}
		
		
		
		
		//System.out.println(map);
		
	}

}

class Student {

	String num;	//학번. 절대 중복 X
	String name;
	int ko, math, avg;

	public Student() {
		super();
	}

	public Student(String num, String name, int ko, int math) {
		super();
		this.num = num;
		this.name = name;
		this.ko = ko;
		this.math = math;
	}

	
	
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", avg=" + avg + "]";
	}

}