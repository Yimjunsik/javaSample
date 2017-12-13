package day16.lang;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {

		int[] num = {77,8,99,34};
		int[] num2 = num.clone();
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		System.out.println(num);
		System.out.println(num2);
		
		String[] str1 = {"È«±æµ¿","°í±æµ¿","±è±æµ¿"};
		String[] str2 = str1.clone();
		str1[0] = "~~~~~";
		System.out.println(Arrays.toString(str1));
		System.out.println(Arrays.toString(str2));
	
		}
		
	}


