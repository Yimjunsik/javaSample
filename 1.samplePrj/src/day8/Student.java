package day8;

public class Student {

	String name;
	String major;
	String num;
	
	public Student(){
		this("000","이름","OOO학과");
		
	}
	public Student(String num,String name,String major ){
		this.num=num;
		this.name=name;
		this.major=major;
	}
	
	public void display(){
		System.out.printf("Student[%s,%s,%s] %n",num,name,major);
	}
	
}
