package day13_test;

public abstract class Shape {

	protected double area;
	protected String name;
	
	public abstract void calculationArea();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+name+", ¸éÀû :"+area+"]";
	}
}
