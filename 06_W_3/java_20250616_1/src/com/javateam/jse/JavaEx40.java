package com.javateam.jse;

public class JavaEx40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 16;
		Integer num2 = num;	// aouto-boxing
		// float num3 = num2.floatValue();
		System.out.println(num2.longValue());
		
		int num4 = Integer.parseInt("16");
		// "16" -> 16(int)
		int num5 = Integer.valueOf("16");
		// "16" -> 16(Integer) -> 16(int)
		
		int num6 = new Integer("16");
		// 非推奨（deprecated）
	}

}
