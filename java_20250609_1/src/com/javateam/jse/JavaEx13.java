package com.javateam.jse;

public class JavaEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum = 0;
		for (float i = 1; i <= 10f; i += 1.5) {
			sum += i;
			System.out.printf("1 ~ %2.1fまでの合計 = %3.1f%n", i, sum);
		}
	}

}
