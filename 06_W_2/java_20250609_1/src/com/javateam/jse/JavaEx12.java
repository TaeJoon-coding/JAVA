package com.javateam.jse;

import java.util.Scanner;
//0O 1Il	한글
public class JavaEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("入力 : ");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		int sum = 0;
		int i = 1;
		
		for (;;) {

			if (i <= limit) {
				// sum += i;
				// i++;
				sum += i++;
			} else {
				break;
			}
		} //
		System.out.printf("1 ~ %dまでの合計 = %d%n", limit, sum);
		sc.close();
	}

}
