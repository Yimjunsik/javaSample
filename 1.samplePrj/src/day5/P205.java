package day5;

import java.util.Arrays;

public class P205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names;				//배열 선언
		names = new String[5];		//배열 생성
		System.out.println(Arrays.toString(names));		//초기화 하기 전.
		
		for(int i=0;i<names.length;i++){
			names[i] = "Hello "+i;
		}
		System.out.println(Arrays.toString(names));		//초기화 후
	}

}
