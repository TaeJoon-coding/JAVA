package com.javateam.jse;

public class JavaEx42 {

	// 素数(prime number)かどうかを判断
	static boolean isPrime(int num) {
		
		boolean result = true;	// 要注意！
		
		for (int i = 2; i <= (int)Math.sqrt(num); i++) {
			if (num % i == 0) {
				result = false;
				break;
			} else {
				result = true;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(Math.sqrt(9));
//		System.out.println(isPrime(739397));
		int sum = 0;
		
		for (int i = 2; i <= 100; i++) {
			if (i > 1 && isPrime(i) == true) {
				sum += i;
			}
		}
		
		System.out.println("１から１００までの素数の合計 : " + sum);
	}

}
