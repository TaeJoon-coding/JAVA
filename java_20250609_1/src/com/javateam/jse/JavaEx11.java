package com.javateam.jse;

import java.util.Scanner;

//0O 1Il	한글
public class JavaEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("入力 : ");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= limit; i++) {
			// sum = sum + i;
			sum += i;
			// System.out.println(i + " ");
			System.out.printf("1 ~ %dまでの合計 = %d%n", i, sum);
		}//
		sc.close();
	}

}
