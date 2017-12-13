package day12_prob1;

public abstract class Shape {

	protected double area;
	private String name;

	public Shape() {

	}

	public Shape(String name) {
		super();
		// this.name = name;
		this.setName(name);
	}

	abstract void calculationArea();

	public void print() {
        System.out.printf("%s의 면적은  %f %n",name,area);
	}

	
	public double getArea(double r) {
		return area;
	}

	public double getArea(double width, double hight) {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
