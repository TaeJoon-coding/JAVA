package com.javateam.jse;

public class JavaEx41 {
	
	static float round(float num, int n) {
		return (float)(Math.round(num * Math.pow(10, n-1)) / Math.pow(10, n-1));
		// 小数点n桁から四捨五入(小数点n-1桁まで表記)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 小数点n桁から四捨五入
		float num = 82.45555f;
		// System.out.println(Math.round(num));
		
		
		// 小数点3桁から四捨五入
		float num2 = (float)(Math.round(num * Math.pow(10, 2)) / Math.pow(10, 2));
		// float num2 = num * 1E2;
		System.out.println(num2);
		
		System.out.println(round(num, 3));
		
	}

}
