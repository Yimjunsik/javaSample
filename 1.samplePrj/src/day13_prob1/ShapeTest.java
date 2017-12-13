package day13_prob1;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(5.0, 6.0);
		RectTriangle ret = new RectTriangle(6.0, 2.0);

		Shape[] shape = { rec, ret };

		for (int i = 0; i < shape.length; i++) {
			System.out.println("area : "+shape[i].getArea());
		}

		for (int i = 0; i < shape.length; i++) {
			if (shape[i] instanceof Resizable) {
				((Resizable) shape[i]).resize(0.5);
				System.out.println("new area :"+shape[i].getArea());
			}
		}

	}

}
