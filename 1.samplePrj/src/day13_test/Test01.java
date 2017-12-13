package day13_test;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c = new Circle();
		c.calculationArea();
		c.draw();
		c.drawColor();

		Shape s = c;
		s.calculationArea();
		System.out.println(c);
		System.out.println(s);

		Drawable d = c;
		d.draw();

		Shape[] ss = { new Circle(), new Rectangle() };
	
		for(int i = 0; i<ss.length;i++){
			((Drawable)ss[i]).draw();
			((Colorable)ss[i]).drawColor();
			
		}
	}

}
