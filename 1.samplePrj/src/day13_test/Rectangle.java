package day13_test;

public class Rectangle extends Shape implements Colorable, Drawable {

	
	
	@Override
	public void calculationArea() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + "면적을 계산합니다.");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + "을 그리다.");
	}

	@Override
	public void drawColor() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + "색칠하기.");
	}

}
