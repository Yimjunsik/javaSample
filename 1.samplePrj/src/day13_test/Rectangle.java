package day13_test;

public class Rectangle extends Shape implements Colorable, Drawable {

	
	
	@Override
	public void calculationArea() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + "������ ����մϴ�.");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + "�� �׸���.");
	}

	@Override
	public void drawColor() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + "��ĥ�ϱ�.");
	}

}
