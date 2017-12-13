package day12_prob1;

public class Rectangle extends Shape {

	private double width;
	private double hight;

	public Rectangle() {

	}

	public Rectangle(String name, double width, double hight) {
		super(name);
		// this.width = width;
		// this.hight = hight;
		this.setWidth(width);
		this.setHight(hight);
	}

	public void calculationArea(){
		
		area = width * hight;
	}
	
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}


}
