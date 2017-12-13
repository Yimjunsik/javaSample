package day12_prob1;

public class Circle extends Shape {

	private double radius;
				//radius : 반지름 or 반경
	public Circle() {

	}

	public Circle(String name, double radius) {
		super(name);
		this.setRadius(radius);
		// this.radius = radius;
	}

	public void calculationArea() {
             area =  Math.PI*radius*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	

	
}
