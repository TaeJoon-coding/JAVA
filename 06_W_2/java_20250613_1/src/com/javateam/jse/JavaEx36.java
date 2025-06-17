package com.javateam.jse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaEx36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = null;
		int num = -1;
		while (true) {
		
		try {
			//
			System.out.print("点数入力 : ");
			sc = new Scanner(System.in);
			String input = sc.next();
			
			// exit を記入すると分岐する。
			if (input.trim().toLowerCase().equals("exit")) {
				sc.close();
				break;
			} else {
				num = Integer.parseInt(input);
			}
			
//			num = sc.nextInt();
			if (num>= 0 && num <=100) {
				sc.close();
				break;
			} else {
				num = -1;
				throw new NumberFormatException("0~100までの整数を入力してください");
				// エラーメッセージが正常出力されるが、
			}
			
		} catch (InputMismatchException | NumberFormatException e) {
			System.out.println("0~100までの整数を入力してください");
			continue;
		}	
		
		}//while
		
		System.out.println("num : " + num);
	}

}
