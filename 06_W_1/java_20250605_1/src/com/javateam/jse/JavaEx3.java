package com.javateam.jse;

public class JavaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = '\uAC00'; //UNICODEで”가”に当たる。
		System.out.println("num1 : " + num1);
		// num1 : 44032
		// num1 = 1L;	//int <- long
		num1 = (int)1L;	//int <- (int)long
		System.out.println(num1);
		
		// intの最大値
		System.out.println("int max : " + Integer.MAX_VALUE);
		// int max : 2147483647
		System.out.println("int min : " + Integer.MIN_VALUE);
		// int min : -2147483648
		System.out.println("byte max : " + Byte.MAX_VALUE);
		// byte max : 127
		System.out.println("byte min : " + Byte.MIN_VALUE);
		// byte min : -128
		System.out.println("long max : " + Long.MAX_VALUE);
		// long max : 9223372036854775807
		System.out.println("long min : " + Long.MIN_VALUE);
		// long min : -9223372036854775808
		
		System.out.println("charの最大値 : " + (int)Character.MAX_VALUE);
		// charの最大値 : 65535
		
		System.out.println("char : " + "1" + (int)Character.MAX_VALUE);
		// char : 165535
		System.out.println("char : " + '1' + (int)Character.MAX_VALUE);
		// char : 165535
		
		System.out.println("floatの最大値 : " + Float.MAX_VALUE);
		// floatの最大値 : 3.4028235E38
		
		float num2 = (float)1E1;
		// 10
		// num2 = 10.0f;
		// num2 = 1E2F;	// 100.0F
		num2 = 2E3F;	// 2000.0F -> 2 * 10^3
		System.out.println(num2);
		// E(指数) : exponential
		num2 = 3E-3F;
		// 0.003
		System.out.println(num2);
	}

}
