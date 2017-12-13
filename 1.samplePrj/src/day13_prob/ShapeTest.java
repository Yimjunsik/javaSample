package day13_prob;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape[] shapes = { new Rectangle(5, 6), new RectTriangle(6, 2) };

		for (int i = 0; i < shapes.length; i++) {
			System.out.println("area : " + shapes[i].getArea());
		}

		for (int i = 0; i < shapes.length; i++) {

			if (shapes[i] instanceof Resizable){
				((Resizable) shapes[i]).resize(0.5);
				System.out.println("new area :" + shapes[i].getArea());
			}
		}

	}

}
