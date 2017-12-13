package day13_prob1;

public abstract class Shape {

	int numSides;

	public Shape() {
	}

	public Shape(int numSides, double area) {
		this.numSides = numSides;
	}

	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	public abstract double getArea();

}
