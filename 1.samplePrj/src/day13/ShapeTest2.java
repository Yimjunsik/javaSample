package day13;

public class ShapeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point[] p = {new Point(10,10), 
					new Point(20,10),
					new Point(10,20),
					new Point(20,20),
					};
		Rectangle r = new Rectangle(p,"BLUE");
		
		System.out.println(r);
		
		r.draw();
	}

}
