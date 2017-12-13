package day4;

public class P168 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1~100까지 합계
		// 1+2+3+4+....99+100 =

		int sum = 0;

		for (int i = 1; i <= 100; i++) {

			if(i%4 == 0);
			sum += i;

			// System.out.println(sum);
		}
		System.out.println(sum);

		
		
		System.out.println("----------------------");
		
		
		sum = 0;
		int i=1;
		
		while(i<=100){
			sum+=i;
			i++;
		}System.out.println(sum);
	
	
		while(sum==5050){
			System.out.println("~~~~~~~");
			break;
		}
	
		boolean flag = false;
		do{
			System.out.println("do while"+flag);
			break;
		}while(flag);
		
	}

}
