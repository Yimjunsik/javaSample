package day7;

import java.util.Arrays;

public class Student {

	String name;
	int[] score = new int[3];
	double sum;
	double avg;

	public void process() {

		sum = 0;
		for (int i = 0; i < score.length; i++) {

			sum += score[i];

		}
		avg = sum / score.length;
	}

	public void display() {
		System.out.println("=======己利 贸府 搬苞钎======");
		System.out.println(name);
		System.out.println("己利 : " + Arrays.toString(score));
		System.out.println("醚痢 : " + sum);
		System.out.println("乞闭 : " + avg);
		System.out.println("===============================");
	}

}
