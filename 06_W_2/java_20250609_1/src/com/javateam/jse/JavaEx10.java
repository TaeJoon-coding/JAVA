package com.javateam.jse;
//0O 1Il	한글
import java.util.Scanner;

public class JavaEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("入力 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// System.out.println("num : " + num);
		String season = "";
		
		season = num >= 3 && num <= 5 ? "春" :
				 num >= 6 && num <= 8 ? "夏" :
				 num >= 9 && num <= 11 ? "秋" :
				 num == 12 || num >= 1 && num <= 2 ? "冬" :
				 "該当なし";
				 
		System.out.printf("%d月 => %s%n", num, season);
		sc.close();
	}

}
