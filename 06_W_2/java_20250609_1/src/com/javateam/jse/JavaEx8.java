package com.javateam.jse;
//0O 1Il	한글
import java.util.Scanner;

public class JavaEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("入力 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// System.out.println("num : " + num);
		String month = "";
		
		switch (num) {
			case 1 : month = num + "月"; break;
			case 2 : month = num + "月"; break;
			case 3 : month = num + "月"; break;
			default : month = "該当なし。";
		}
		System.out.printf("%d => %s%n", num, month);
		
		sc.close();
	}

}
