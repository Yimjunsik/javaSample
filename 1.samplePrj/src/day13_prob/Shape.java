package day13_prob;

public abstract class Shape {

	int numSides;

	// public Shape() {}

	public Shape(int numSides) {

		this.numSides = numSides;
	}

	public int getNumsides() {
		return numSides;
	}

	abstract double getArea();
}

interface Resizable {
	public abstract void resize(double s);

}

class RectTriangle extends Shape {

	double w;
	double h;

	public RectTriangle(int w, int h) {
		super(3);
		this.w = w;
		this.h = h;
	}

	@Override
	double getArea() {
		return w * h / 2;
	}

}

class Rectangle extends Shape implements Resizable {

	double w;
	double h;

	public Rectangle(int w, int h) {
		super(4);
		this.w = w;
		this.h = h;
	}

	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		h = h * s;
		w = w * s;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return w * h;
	}

}