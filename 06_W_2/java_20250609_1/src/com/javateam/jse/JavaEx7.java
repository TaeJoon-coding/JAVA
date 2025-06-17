package com.javateam.jse;

public class JavaEx7 {
//0O 1Il	한글
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if (true) {
//			System.out.println("絶対実行");
//		}
		
//		if (false) {
//			System.out.println("絶対実行");
//		}	//Dead code、絶対に実行しないから
		
//		if (2 > 3) {
//			System.out.println("絶対実行");
//		}	//Dead code、絶対に実行しないから
		
		int num = 3;
//		if (num == 3) {
//			System.out.println("絶対実行");
//		}
		if (!(num == 3)) {	// (O) num != 3
			System.out.println("絶対実行");
		} else {
			System.out.println("etc");
		}
		
		int num2 = 1;
		if (num2 >= 3) {
			System.out.println("絶対実行");
		} else if (num2 >= 2) {
			System.out.println("２以上");
		} else {
			System.out.println("etc");
		}
		
	}

}
