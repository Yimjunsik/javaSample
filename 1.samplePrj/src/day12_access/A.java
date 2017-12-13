package day12_access;

public class A {

	public String name1 = "A";
	protected String name2 = "A";
	String name3 = "A";
	private String name4 = "AA";

	
}

class B {
	A a;
	void print(){
		System.out.println();
	}
}
