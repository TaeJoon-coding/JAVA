package com.javateam.jse;

//import java.util.*;
import java.util.Scanner;

public class JavaEx5 {

	public static void main(String[] args) {
		
		System.out.print("記入 ： ");
		
		Scanner sc = new Scanner(System.in);
		// int input = sc.nextInt();
		// String input = sc.nextLine();
		String str = sc.next();
		// System.out.println("str : " + input);
		System.out.println("str : " + str);
		
		sc.close();//キーボード(標準)入力資源（resource）返却
	}

}
