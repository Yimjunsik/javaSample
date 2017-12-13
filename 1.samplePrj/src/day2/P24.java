package day2;

public class P24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 600;
		int y = 700;
		int tmp = 0;
		
		System.out.println("x:"+ x + "y" + y);
		
		System.out.printf("x = %d , y = %d %n ", x,y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println(" x : " + x + "y:" + y);
		
		System.out.printf("x = %d, y=%d \n", x,y);
		
	}

}
