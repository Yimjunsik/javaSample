package day5;

import java.util.Arrays;

public class P205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names;				//�迭 ����
		names = new String[5];		//�迭 ����
		System.out.println(Arrays.toString(names));		//�ʱ�ȭ �ϱ� ��.
		
		for(int i=0;i<names.length;i++){
			names[i] = "Hello "+i;
		}
		System.out.println(Arrays.toString(names));		//�ʱ�ȭ ��
	}

}
