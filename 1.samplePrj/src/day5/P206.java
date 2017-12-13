package day5;

import java.util.Arrays;

public class P206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = {11,22,33,44,55};
		String[] names = {"홍길동","고길동","박길동","최길동","이길동"};
		
		for(int i=0;i<names.length;i++){
		
			System.out.println(names[i].charAt(0)+"**"+" "+scores[i]);
			
		}
		
		System.out.println("------------------------------------");
		for( int data :scores){	//scores로 부터 데이터를 꺼내는데 data에 int타입으로 받겠다.
			
			System.out.println(data);
		}
		System.out.println("------------------------------------");
		
		for(String data :names){
			System.out.println(data);
		}
		
		
	}

}
