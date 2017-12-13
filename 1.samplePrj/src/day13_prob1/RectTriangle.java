package day13_prob1;

public class RectTriangle extends Shape {

	double width;
	double height;

	public RectTriangle() {
	
	}

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}


	@Override
	public double getArea() {
		return width * height / 2;
	}
	
}
