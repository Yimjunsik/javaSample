package day5;

import java.util.Arrays;

public class P206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = {11,22,33,44,55};
		String[] names = {"ȫ�浿","��浿","�ڱ浿","�ֱ浿","�̱浿"};
		
		for(int i=0;i<names.length;i++){
		
			System.out.println(names[i].charAt(0)+"**"+" "+scores[i]);
			
		}
		
		System.out.println("------------------------------------");
		for( int data :scores){	//scores�� ���� �����͸� �����µ� data�� intŸ������ �ްڴ�.
			
			System.out.println(data);
		}
		System.out.println("------------------------------------");
		
		for(String data :names){
			System.out.println(data);
		}
		
		
	}

}
