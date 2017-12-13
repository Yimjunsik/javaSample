package day5;

import java.util.Arrays;

public class P192 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] src = {11,22,33,44,55,66,77};
		System.out.println(Arrays.toString(src));
		
		int[] dest = new int[src.length*2];
		System.out.println(Arrays.toString(dest));
		
		System.arraycopy(src, 0, dest, 0, src.length);	// Array copy
		System.out.println(Arrays.toString(dest));
	}

}
