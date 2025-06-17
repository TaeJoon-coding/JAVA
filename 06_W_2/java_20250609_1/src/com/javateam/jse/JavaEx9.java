package com.javateam.jse;

import java.util.Scanner;

public class JavaEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("入力 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// System.out.println("num : " + num);
		String season = "";
		
		if (num >= 3 && num <=5) {
			season = "春";
		}else if (num >= 6 && num <= 8) {
			season = "夏";
		}else if (num >= 9 && num <= 11) {
			season = "秋";
		}else if (num ==12 || num >= 1 && num <= 2) {
			season = "冬";
		}else {
			season = "該当なし";
		}
		System.out.printf("%d月 => %s%n", num, season);
		sc.close();
		
	}

}
