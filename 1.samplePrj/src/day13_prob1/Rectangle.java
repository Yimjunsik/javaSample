package day13_prob1;

public class Rectangle extends Shape implements Resizable {

	double width;
	double height;

	public Rectangle() {

	}

	public Rectangle(double width, double height) {

		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double s) {
		this.width = this.width * s;
		this.height = this.height * s;
	}

	@Override
	public double getArea() {
		return width * height;
	}

}
